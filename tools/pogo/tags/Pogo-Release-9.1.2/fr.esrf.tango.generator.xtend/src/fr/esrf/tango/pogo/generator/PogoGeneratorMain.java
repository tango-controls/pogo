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

import java.util.List;
import java.util.Set;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class PogoGeneratorMain {
	/** The value of 'module' in the .mwe2 file to execute */
	private static final String WORKFLOW_MODULE = "fr.esrf.tango.pogo.generator.PogoDslGeneratorMWE";
	private static final String TYPE_CPP = "cpp";
	private static final String TYPE_JAVA = "java";
	private static final String TYPE_PYTHON = "python";
	private static final String TYPE_PYTHON_HL = "pythonHL";
	private static final String OPT_LANGUAGE = "language";
	
	public static void main(String[] args) {
		int retval = new PogoGeneratorMain().run(args);
		if (retval != 0)
			System.exit(retval);
	}

	@SuppressWarnings("static-access")
	protected int run(String[] args) {
		final Options options = new Options();

		Option optSrcDir = OptionBuilder.withArgName("path")
				.withDescription("Model source directory").hasArg()
				.isRequired().withValueSeparator(' ').create("srcdir");

		Option optTargetDir = OptionBuilder
				.withArgName("path")
				.withDescription(
						"Generator target directory (default: ./src-gen)")
				.hasArg().create("targetdir");

		Option optFileTypes = OptionBuilder
				.withArgName(OPT_LANGUAGE)
				.withDescription(
						"Specify target languages (cpp, java, python, pythonHL)")
				.hasArg().create(OPT_LANGUAGE);

		options.addOption(optSrcDir);
		options.addOption(optTargetDir);
		options.addOption(optFileTypes);

		// create the parser
		final CommandLineParser parser = new GnuParser();
		CommandLine line = null;
		try {
			line = parser.parse(options, args);
		} catch (final ParseException exp) {
			System.out.println(exp.getMessage());
			final HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("java -jar pogogen.jar [OPTIONS]", options);
			return -1;
		}

		List<String> launchArgs = Lists.newArrayList();
		launchArgs.add(WORKFLOW_MODULE);
		launchArgs.add("-pmodelPath=" + line.getOptionValue("srcdir"));
		launchArgs.add("-ptargetDir="
				+ line.getOptionValue("targetdir", "./src-gen"));
		if (line.hasOption(OPT_LANGUAGE)) {
			Set<String> languages = Sets.newHashSet(line.getOptionValue(OPT_LANGUAGE).split(","));
			if (languages.contains(TYPE_CPP)) {
				launchArgs.add("-pgenerateCpp=true");
			}
			if (languages.contains(TYPE_JAVA)) {
				launchArgs.add("-pgenerateJava=true");
			}
			if (languages.contains(TYPE_PYTHON)) {
				launchArgs.add("-pgeneratePython=true");
			}
			if (languages.contains(TYPE_PYTHON_HL)) {
				launchArgs.add("-pgeneratePythonHL=true");
			}
		}
		try {
			Mwe2Launcher.main(launchArgs.toArray(new String[0]));
			return 0;
		} catch (Exception e) {
			return -1;
		}
	}
}
