//+======================================================================
//
// Project:   Tango
//
// Description:  source code for Tango code generator.
//
// $Author: verdier $
//
// Copyright (C) :  2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013
//					European Synchrotron Radiation Facility
//                  BP 220, Grenoble 38043
//                  FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision: $
// $Date:  $
//
// $HeadURL: $
//
//-======================================================================

package fr.esrf.tango.pogo.generator;

import java.net.URI;

import java.util.ArrayList;

import net.danieldietrich.protectedregions.core.IRegionParser;
import net.danieldietrich.protectedregions.core.RegionParserBuilder;
import net.danieldietrich.protectedregions.core.RegionParserFactory;
import net.danieldietrich.protectedregions.support.IPathFilter;
import net.danieldietrich.protectedregions.support.ProtectedRegionSupport;
import net.danieldietrich.protectedregions.xtext.BidiJavaIoFileSystemAccess;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Provides;

import fr.esrf.tango.pogo.generator.pr.PogoPR;

public class PogoGeneratorModule extends AbstractGenericModule {

	//===================================================================================
	//===================================================================================
	public Class<? extends IGenerator> bindIGenerator () {
		return PogoDslGenerator.class;
	}

	//===================================================================================
	//===================================================================================
	@Provides
	public JavaIoFileSystemAccess createJavaIoFileSystemAccess(ProtectedRegionSupport support) {

		// comments in Java and C++ are the same, so we just add the file extensions for C++ to the Java parser
		support.addParser(RegionParserFactory.createJavaParser(new PogoPR(),false), ".java", ".cpp", ".h", ".html");
		support.addParser(RegionParserFactory.createXmlParser(), ".xml", ".xsd");
		support.addParser(createPythonParser(), ".py");		
		BidiJavaIoFileSystemAccess fsa = new BidiJavaIoFileSystemAccess(support);
		if (System.getProperty("targetDir")!=null)
			fsa.setFilter(new pogoPathFilter());
	  return fsa;
	}
	
	//===================================================================================
	//===================================================================================
	private IRegionParser createPythonParser () {
		IRegionParser parser = new RegionParserBuilder().name("python").addComment("#").ignoreCData('"', '\\')
				.ignoreCData('\'', '\\').setInverse(false).useOracle(new PogoPR()).build();
		return parser;
	}
	
	//===================================================================================
	//===================================================================================
	private class pogoPathFilter implements IPathFilter {
		
		private ArrayList<String>	generatedFiles = new ArrayList<String>();
		private boolean isWindows;
		//===================================================================================
		pogoPathFilter() {
			
	        String os = System.getProperty("os.name");
	        isWindows = os.toLowerCase().startsWith("windows");

			//	Build the list of generated files.
			String	targetDir = System.getProperty("targetDir");
			String	className = System.getProperty("className");
			String	language  = System.getProperty("targetLanguage");
			
			if (isWindows) {
				//	Replace '\' by '/' if any in targetDir
				StringBuffer	sb = new StringBuffer();
				int	start = 0;
				int end;
				while ((end=targetDir.indexOf('\\', start))>=0){
					sb.append(targetDir.substring(start, end)).append('/');
					start = end +1;
				}
				sb.append(targetDir.substring(start));
				targetDir = sb.toString();

				int	p = targetDir.indexOf(':');
				if (p>0)
					targetDir = targetDir.substring(p+1);
			}
			fr.esrf.tango.pogo.generator.common.StringUtils.printTrace(targetDir + "/" + className + " : " + language);

			generatedFiles.clear();
			if (language.toLowerCase().equals("Multicpp"))
				fillGeneratedFilesListForMultiClasesCpp(targetDir, className);
			else
			if (language.toLowerCase().equals("cpp"))
				fillGeneratedFilesListForCpp(targetDir, className);
			else
			if (language.toLowerCase().equals("java"))
				fillGeneratedFilesListForJava(targetDir, className);
			else
			if (language.toLowerCase().equals("python"))
				fillGeneratedFilesListForPython(targetDir, className);
			else
			if (language.toLowerCase().equals("pythonhl"))
				fillGeneratedFilesListForPythonHL(targetDir, className);
			

			//	Add html file for all languages
			generatedFiles.add(targetDir+"/doc_html/ClassDescription.html");
		}
		//===================================================================================
		public boolean accept(URI uri) {

			String fileName = uri.getPath();
			
			//	remove "X:" (disk unit for Windows)
			if (isWindows) {
				int	p = fileName.indexOf(':');
				if (p>0)
					fileName = fileName.substring(p+1);
			}
			//System.out.println("Check filter for " + fileName);
		
			for (String generateFile : generatedFiles) {
				if (generateFile.contains("*")) {
					int	pos = generateFile.indexOf('*');
					String head = generateFile.substring(0, pos);
					String end  = generateFile.substring(pos+1);
					if (fileName.indexOf("/", pos+1)>0)  {//	Sub-directory
						return false;
					}
					if (fileName.startsWith(head) && fileName.endsWith(end)) {
						return true;
					}
				}
				else {
					//System.out.println(generateFile + "==" + fileName);
					if (generateFile.equals(fileName)) {
						return true;
					}
				}
			}
			return false;
		}
		//===================================================================================
		private void fillGeneratedFilesListForMultiClasesCpp(String targetDir, String className) {
			generatedFiles.add(targetDir+"/MultiClassFactory.cpp");
			generatedFiles.add(targetDir+"/Makefile.multi");
		}
		//===================================================================================
		private void fillGeneratedFilesListForCpp(String targetDir, String className) {
			generatedFiles.add(targetDir+"/"+className + ".h");
			generatedFiles.add(targetDir+"/"+className + ".cpp");
			generatedFiles.add(targetDir+"/"+className + "Class.h");
			generatedFiles.add(targetDir+"/"+className + "Class.cpp");
			generatedFiles.add(targetDir+"/"+className + "StateMachine.cpp");
			generatedFiles.add(targetDir+"/"+className + "DynAttrUtils.cpp");
			generatedFiles.add(targetDir+"/ClassFactory.cpp");
			generatedFiles.add(targetDir+"/main.cpp");
			generatedFiles.add(targetDir+"/Makefile");
			generatedFiles.add(targetDir+"/CMakeLists.txt");
		}
		//===================================================================================
		private void fillGeneratedFilesListForJava(String targetDir, String className) {
			generatedFiles.add(targetDir+"/org/tango/" + className.toLowerCase() + "/*.java");
			generatedFiles.add(targetDir+"/Makefile");
		}
		//===================================================================================
		private void fillGeneratedFilesListForPython(String targetDir, String className) {
			generatedFiles.add(targetDir+"/"+className + ".py");
		}
		//===================================================================================
		private void fillGeneratedFilesListForPythonHL(String targetDir, String className) {
			String	pr_py  = System.getProperty("python package");
			if (pr_py.equals("true")) {
				generatedFiles.add(targetDir+"/test/" + className + "_test.py");
				generatedFiles.add(targetDir+"/"+className + "/" + className + ".py");
			}
			else {			
				generatedFiles.add(targetDir+"/"+className + ".py");
			}
		}
		//===================================================================================
	}
}
