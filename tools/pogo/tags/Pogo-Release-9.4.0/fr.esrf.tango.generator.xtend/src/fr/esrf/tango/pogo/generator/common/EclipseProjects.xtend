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

package fr.esrf.tango.pogo.generator.common

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass

//======================================================
// Define linux Makefile file to be generated
//======================================================
class EclipseProjects {
	

	//======================================================
	// Define Eclipse project code to be generated
	//======================================================
	def generateEclipseProject(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<projectDescription>
			<name>«cls.name»</name>
			<comment></comment>
			<projects>
			</projects>
			<buildSpec>
				<buildCommand>
					<name>org.eclipse.cdt.managedbuilder.core.genmakebuilder</name>
					<triggers>clean,full,incremental,</triggers>
					<arguments>
						<dictionary>
							<key>?name?</key>
							<value></value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.append_environment</key>
							<value>true</value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.autoBuildTarget</key>
							<value>all</value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.buildArguments</key>
							<value></value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.buildCommand</key>
							<value>make</value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.cleanBuildTarget</key>
							<value>clean</value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.contents</key>
							<value>org.eclipse.cdt.make.core.activeConfigSettings</value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.enableAutoBuild</key>
							<value>false</value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.enableCleanBuild</key>
							<value>true</value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.enableFullBuild</key>
							<value>true</value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.fullBuildTarget</key>
							<value>all</value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.stopOnError</key>
							<value>true</value>
						</dictionary>
						<dictionary>
							<key>org.eclipse.cdt.make.core.useDefaultBuildCmd</key>
							<value>true</value>
						</dictionary>
					</arguments>
				</buildCommand>
				<buildCommand>
					<name>org.eclipse.cdt.managedbuilder.core.ScannerConfigBuilder</name>
					<triggers>full,incremental,</triggers>
					<arguments>
					</arguments>
				</buildCommand>
			</buildSpec>
			<natures>
				<nature>org.eclipse.cdt.core.cnature</nature>
				<nature>org.eclipse.cdt.core.ccnature</nature>
				<nature>org.eclipse.cdt.managedbuilder.core.managedBuildNature</nature>
				<nature>org.eclipse.cdt.managedbuilder.core.ScannerConfigNature</nature>
			</natures>
		</projectDescription>
	'''


	//======================================================
	// Define Eclipse C++ project code to be generated
	//======================================================
	def generateCppEclipseProject(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8" standalone="no"?>
		<?fileVersion 4.0.0?><cproject storage_type_id="org.eclipse.cdt.core.XmlProjectDescriptionStorage">
			<storageModule moduleId="org.eclipse.cdt.core.settings">
				<cconfiguration id="cdt.managedbuild.toolchain.gnu.base.199012160">
					<storageModule buildSystemId="org.eclipse.cdt.managedbuilder.core.configurationDataProvider" id="cdt.managedbuild.toolchain.gnu.base.199012160" moduleId="org.eclipse.cdt.core.settings" name="Default">
						<externalSettings/>
						<extensions>
							<extension id="org.eclipse.cdt.core.ELF" point="org.eclipse.cdt.core.BinaryParser"/>
							<extension id="org.eclipse.cdt.core.GmakeErrorParser" point="org.eclipse.cdt.core.ErrorParser"/>
							<extension id="org.eclipse.cdt.core.CWDLocator" point="org.eclipse.cdt.core.ErrorParser"/>
							<extension id="org.eclipse.cdt.core.GCCErrorParser" point="org.eclipse.cdt.core.ErrorParser"/>
							<extension id="org.eclipse.cdt.core.GASErrorParser" point="org.eclipse.cdt.core.ErrorParser"/>
							<extension id="org.eclipse.cdt.core.GLDErrorParser" point="org.eclipse.cdt.core.ErrorParser"/>
						</extensions>
					</storageModule>
					<storageModule moduleId="cdtBuildSystem" version="4.0.0">
						<configuration buildProperties="" description="" id="cdt.managedbuild.toolchain.gnu.base.199012160" name="Default" parent="org.eclipse.cdt.build.core.emptycfg">
							<folderInfo id="cdt.managedbuild.toolchain.gnu.base.199012160.208689999" name="/" resourcePath="">
								<toolChain id="cdt.managedbuild.toolchain.gnu.base.1111700334" name="cdt.managedbuild.toolchain.gnu.base" superClass="cdt.managedbuild.toolchain.gnu.base">
									<targetPlatform archList="all" binaryParser="org.eclipse.cdt.core.ELF" id="cdt.managedbuild.target.gnu.platform.base.1467086329" name="Debug Platform" osList="linux,hpux,aix,qnx" superClass="cdt.managedbuild.target.gnu.platform.base"/>
									<builder id="cdt.managedbuild.target.gnu.builder.base.730334496" keepEnvironmentInBuildfile="false" managedBuildOn="false" name="Gnu Make Builder" superClass="cdt.managedbuild.target.gnu.builder.base"/>
									<tool id="cdt.managedbuild.tool.gnu.archiver.base.946696523" name="GCC Archiver" superClass="cdt.managedbuild.tool.gnu.archiver.base"/>
									<tool id="cdt.managedbuild.tool.gnu.cpp.compiler.base.1843728894" name="GCC C++ Compiler" superClass="cdt.managedbuild.tool.gnu.cpp.compiler.base">
										<option id="gnu.cpp.compiler.option.include.paths.1220787058" name="Include paths (-I)" superClass="gnu.cpp.compiler.option.include.paths" valueType="includePath">
											<listOptionValue builtIn="false" value="«StringUtils::includePath»"/>
											<listOptionValue builtIn="false" value="&quot;${w orkspace_loc:«cls.description.sourcePath»}&quot;"/>
										</option>
										<inputType id="cdt.managedbuild.tool.gnu.cpp.compiler.input.1579867133" superClass="cdt.managedbuild.tool.gnu.cpp.compiler.input"/>
									</tool>
									<tool id="cdt.managedbuild.tool.gnu.c.compiler.base.23438034" name="GCC C Compiler" superClass="cdt.managedbuild.tool.gnu.c.compiler.base">
										<inputType id="cdt.managedbuild.tool.gnu.c.compiler.input.1013132660" superClass="cdt.managedbuild.tool.gnu.c.compiler.input"/>
									</tool>
									<tool id="cdt.managedbuild.tool.gnu.c.linker.base.651337967" name="GCC C Linker" superClass="cdt.managedbuild.tool.gnu.c.linker.base"/>
									<tool id="cdt.managedbuild.tool.gnu.cpp.linker.base.106754568" name="GCC C++ Linker" superClass="cdt.managedbuild.tool.gnu.cpp.linker.base">
										<inputType id="cdt.managedbuild.tool.gnu.cpp.linker.input.1985099519" superClass="cdt.managedbuild.tool.gnu.cpp.linker.input">
											<additionalInput kind="additionalinputdependency" paths="$(USER_OBJS)"/>
											<additionalInput kind="additionalinput" paths="$(LIBS)"/>
										</inputType>
									</tool>
									<tool id="cdt.managedbuild.tool.gnu.assembler.base.1377905396" name="GCC Assembler" superClass="cdt.managedbuild.tool.gnu.assembler.base">
										<inputType id="cdt.managedbuild.tool.gnu.assembler.input.1222692721" superClass="cdt.managedbuild.tool.gnu.assembler.input"/>
									</tool>
								</toolChain>
							</folderInfo>
						</configuration>
					</storageModule>
					<storageModule moduleId="org.eclipse.cdt.core.externalSettings"/>
				</cconfiguration>
			</storageModule>
			<storageModule moduleId="cdtBuildSystem" version="4.0.0">
				<project id="«cls.name».null.601881414" name="«cls.name»"/>
			</storageModule>
			<storageModule moduleId="org.eclipse.cdt.core.LanguageSettingsProviders"/>
			<storageModule moduleId="scannerConfiguration">
				<autodiscovery enabled="true" problemReportingEnabled="true" selectedProfileId=""/>
				<scannerConfigBuildInfo instanceId="cdt.managedbuild.toolchain.gnu.base.199012160;cdt.managedbuild.toolchain.gnu.base.199012160.208689999;cdt.managedbuild.tool.gnu.cpp.compiler.base.1843728894;cdt.managedbuild.tool.gnu.cpp.compiler.input.1579867133">
					<autodiscovery enabled="true" problemReportingEnabled="true" selectedProfileId="org.eclipse.cdt.make.core.GCCStandardMakePerFileProfile"/>
				</scannerConfigBuildInfo>
				<scannerConfigBuildInfo instanceId="cdt.managedbuild.toolchain.gnu.base.199012160;cdt.managedbuild.toolchain.gnu.base.199012160.208689999;cdt.managedbuild.tool.gnu.c.compiler.base.23438034;cdt.managedbuild.tool.gnu.c.compiler.input.1013132660">
					<autodiscovery enabled="true" problemReportingEnabled="true" selectedProfileId=""/>
				</scannerConfigBuildInfo>
			</storageModule>
		</cproject>
	'''
}