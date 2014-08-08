//+======================================================================
//
// Project:   Tango
//
// Description:  source code for Tango code generator.
//
// $Author: verdier $
//
// Copyright (C) :  2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
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

package fr.esrf.tango.pogo.generator.java

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import fr.esrf.tango.pogo.generator.java.projects.LinuxMakefile
import fr.esrf.tango.pogo.generator.java.projects.IdeaProject
import fr.esrf.tango.pogo.generator.common.EclipseProjects
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass


class JavaGenerator implements IGenerator {

	@Inject	JavaDevice		javaDevice
	@Inject	LinuxMakefile	linuxMakefile
	@Inject	IdeaProject		ideaProject
	@Inject	extension 		EclipseProjects

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		//	Code files
		javaDevice.doGenerate(resource, fsa)
		//	Linux Makefile
		linuxMakefile.doGenerate(resource, fsa)
		//	IntelliJIDEA project
		ideaProject.doGenerate(resource, fsa)
		for (cls : resource.allContents.toIterable.filter(typeof(PogoDeviceClass))) {
			if (cls.description.language.toLowerCase.equals("java")) {
				//	Eclipse Project
				if (cls.description.filestogenerate.toLowerCase.contains("eclipse")) {
					printTrace("Generating Eclipse project")
					fsa.generateFile(".project",  cls.generateEclipseProject)
//					fsa.generateFile(".cproject", cls.generateCppEclipseProject)
				}
			}
		}
	}
}