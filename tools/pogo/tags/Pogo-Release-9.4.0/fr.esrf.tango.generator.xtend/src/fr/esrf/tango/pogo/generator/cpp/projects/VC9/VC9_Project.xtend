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

package fr.esrf.tango.pogo.generator.cpp.projects.VC9

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject


//======================================================
// Define VC Project to be generated
//======================================================
class VC9_Project {
	
	@Inject	extension VC9Utils

	//======================================================
	// Define VC9 project file to be generated
	//======================================================
	def generateVC9_Project (PogoDeviceClass cls) '''
		Microsoft Visual Studio Solution File, Format Version 10.00
		# Visual Studio 2008
		Project("{8BC9CEB8-8B4A-11D0-8D11-00A0C91BC942}") = "Server_static", "Server_static.vcproj", "{A52909BB-E783-4522-BF2D-D9786023881D}"
			ProjectSection(ProjectDependencies) = postProject
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4} = {4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}
			EndProjectSection
		EndProject
		Project("{8BC9CEB8-8B4A-11D0-8D11-00A0C91BC942}") = "Server_shared", "Server_shared.vcproj", "{570AF151-36FC-4638-A23A-673975792A19}"
			ProjectSection(ProjectDependencies) = postProject
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F} = {F513547B-028B-42F8-BE76-A50FD3A3BA3F}
			EndProjectSection
		EndProject
		Project("{8BC9CEB8-8B4A-11D0-8D11-00A0C91BC942}") = "Class_lib", "Class_lib.vcproj", "{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}"
		EndProject
		Project("{8BC9CEB8-8B4A-11D0-8D11-00A0C91BC942}") = "Class_dll", "Class_dll.vcproj", "{F513547B-028B-42F8-BE76-A50FD3A3BA3F}"
		EndProject
		Global
			GlobalSection(SolutionConfigurationPlatforms) = preSolution
				Debug|Win32 = Debug|Win32
				Release|Win32 = Release|Win32
			EndGlobalSection
			GlobalSection(ProjectConfigurationPlatforms) = postSolution
				{A52909BB-E783-4522-BF2D-D9786023881D}.Debug|Win32.ActiveCfg = Debug|Win32
				{A52909BB-E783-4522-BF2D-D9786023881D}.Debug|Win32.Build.0 = Debug|Win32
				{A52909BB-E783-4522-BF2D-D9786023881D}.Release|Win32.ActiveCfg = Release|Win32
				{A52909BB-E783-4522-BF2D-D9786023881D}.Release|Win32.Build.0 = Release|Win32
				{570AF151-36FC-4638-A23A-673975792A19}.Debug|Win32.ActiveCfg = Debug|Win32
				{570AF151-36FC-4638-A23A-673975792A19}.Debug|Win32.Build.0 = Debug|Win32
				{570AF151-36FC-4638-A23A-673975792A19}.Release|Win32.ActiveCfg = Release|Win32
				{570AF151-36FC-4638-A23A-673975792A19}.Release|Win32.Build.0 = Release|Win32
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Debug|Win32.ActiveCfg = Debug|Win32
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Debug|Win32.Build.0 = Debug|Win32
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Release|Win32.ActiveCfg = Release|Win32
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Release|Win32.Build.0 = Release|Win32
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Debug|Win32.ActiveCfg = Debug|Win32
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Debug|Win32.Build.0 = Debug|Win32
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Release|Win32.ActiveCfg = Release|Win32
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Release|Win32.Build.0 = Release|Win32
			EndGlobalSection
			GlobalSection(SolutionProperties) = preSolution
				HideSolutionNode = FALSE
			EndGlobalSection
		EndGlobal
	'''



	//=============================================================================
 	// Define the ClassLib file
 	//=============================================================================
	def generateVC9_ClassLib (PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="Windows-1252"?>
		<VisualStudioProject
			ProjectType="Visual C++"
			Version="9,00"
			Name="Class_lib"
			ProjectGUID="{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}"
			RootNamespace="$(SolutionName)_lib"
			Keyword="Win32Proj"
			TargetFrameworkVersion="131072"
			>
			<Platforms>
				<Platform Name="Win32" />
			</Platforms>
			<ToolFiles>
			</ToolFiles>
			<Configurations>
				<Configuration
					Name="Debug|Win32"
					OutputDirectory="..\lib\win32\debug"
					IntermediateDirectory="..\obj\win32\debug"
					ConfigurationType="4"
					CharacterSet="1"
					>
					<Tool Name="VCPreBuildEventTool" />
					<Tool Name="VCCustomBuildTool" />
					<Tool Name="VCXMLDataGeneratorTool" />
					<Tool Name="VCWebServiceProxyGeneratorTool" />
					<Tool Name="VCMIDLTool" />
					<Tool Name="VCCLCompilerTool"
						Optimization="0"
						AdditionalIncludeDirectories="..;&quot;$(TANGO_ROOT)\win32\include\vc9&quot;;&quot;$(TANGO_ROOT)\classes\win32\include\vc9&quot;;&quot;TemplateAbstractPath&quot;"
						PreprocessorDefinitions="WIN32;_WINSTATIC;_DEBUG;_CONSOLE"
						StringPooling="false"
						MinimalRebuild="true"
						BasicRuntimeChecks="3"
						RuntimeLibrary="1"
						UsePrecompiledHeader="0"
						AssemblerListingLocation="$(IntDir)/"
						ObjectFile="$(IntDir)/"
						ProgramDataBaseFileName="$(TargetDir)$(TargetName).pdb"
						WarningLevel="2"
						Detect64BitPortabilityProblems="false"
						DebugInformationFormat="4"
					/>
					<Tool Name="VCManagedResourceCompilerTool" />
					<Tool Name="VCResourceCompilerTool" />
					<Tool Name="VCPreLinkEventTool" />
					<Tool Name="VCLibrarianTool"
						OutputFile="$(OutDir)\$(SolutionName)d.lib" />
					<Tool Name="VCALinkTool" />
					<Tool Name="VCXDCMakeTool" />
					<Tool Name="VCBscMakeTool" />
					<Tool Name="VCFxCopTool" />
					<Tool Name="VCPostBuildEventTool" />
				</Configuration>
				<Configuration
					Name="Release|Win32"
					OutputDirectory="..\lib\win32\release"
					IntermediateDirectory="..\obj\win32\release"
					ConfigurationType="4"
					CharacterSet="1"
					WholeProgramOptimization="1"
					>
					<Tool Name="VCPreBuildEventTool" />
					<Tool Name="VCCustomBuildTool" />
					<Tool Name="VCXMLDataGeneratorTool" />
					<Tool Name="VCWebServiceProxyGeneratorTool" />
					<Tool Name="VCMIDLTool" />
					<Tool Name="VCCLCompilerTool"
						Optimization="0"
						WholeProgramOptimization="false"
						AdditionalIncludeDirectories="..;&quot;$(TANGO_ROOT)\win32\include\vc9&quot;;&quot;$(TANGO_ROOT)\classes\win32\include\vc9&quot;;&quot;TemplateAbstractPath&quot;"
						PreprocessorDefinitions="WIN32;_WINSTATIC;NDEBUG;_CONSOLE"
						MinimalRebuild="true"
						BasicRuntimeChecks="3"
						RuntimeLibrary="0"
						UsePrecompiledHeader="0"
						AssemblerListingLocation="$(IntDir)/"
						ObjectFile="$(IntDir)/"
						ProgramDataBaseFileName="$(IntDir)/"
						WarningLevel="2"
						Detect64BitPortabilityProblems="false"
						DebugInformationFormat="4"
					/>
					<Tool Name="VCManagedResourceCompilerTool" />
					<Tool Name="VCResourceCompilerTool" />
					<Tool Name="VCPreLinkEventTool" />
					<Tool Name="VCLibrarianTool"
						OutputFile="$(OutDir)\$(SolutionName).lib" />
					<Tool Name="VCALinkTool" />
					<Tool Name="VCXDCMakeTool" />
					<Tool Name="VCBscMakeTool" />
					<Tool Name="VCFxCopTool" />
					<Tool Name="VCPostBuildEventTool"
						CommandLine="" />
				</Configuration>
			</Configurations>
			<References>
			</References>
			<Files>
				<Filter Name="Source Files"
					Filter="cpp;c;cc;cxx;def;odl;idl;hpj;bat;asm;asmx"
					UniqueIdentifier="{4FC737F1-C7A5-4376-A066-2A32D752A2FF}">
					«cls.sourceFileList»
				</Filter>
				<Filter	Name="Header Files"
					Filter="h;hpp;hxx;hm;inl;inc;xsd"
					UniqueIdentifier="{93995380-89BD-4b04-88EB-625FBE52EBFB}">
					«cls.includeFileList»
				</Filter>
			</Files>
			<Globals>
			</Globals>
		</VisualStudioProject>
	'''

	//=============================================================================
 	// Define the Server static file
 	//=============================================================================
	def generateVC9_ServerStatic (PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="Windows-1252"?>
		<VisualStudioProject
			ProjectType="Visual C++"
			Version="9,00"
			Name="Server_static"
			ProjectGUID="{A52909BB-E783-4522-BF2D-D9786023881D}"
			RootNamespace="$(SolutionName)_static"
			Keyword="Win32Proj"
			TargetFrameworkVersion="131072"
			>
			<Platforms>
				<Platform Name="Win32" />
			</Platforms>
			<ToolFiles>
			</ToolFiles>
			<Configurations>
				<Configuration
					Name="Debug|Win32"
					OutputDirectory="..\bin\win32\debug"
					IntermediateDirectory="..\obj\win32\debug"
					ConfigurationType="1"
					CharacterSet="1"
					>
					<Tool Name="VCPreBuildEventTool" />
					<Tool Name="VCCustomBuildTool" />
					<Tool Name="VCXMLDataGeneratorTool" />
					<Tool Name="VCWebServiceProxyGeneratorTool" />
					<Tool Name="VCMIDLTool" />
					<Tool Name="VCCLCompilerTool"
						Optimization="0"
						AdditionalIncludeDirectories="..;&quot;$(TANGO_ROOT)\win32\include\vc9&quot;;&quot;$(TANGO_ROOT)\classes\win32\include\vc9&quot;;&quot;TemplateAbstractPath&quot;"
						PreprocessorDefinitions="WIN32;_WINSTATIC;_DEBUG;_CONSOLE"
						StringPooling="false"
						MinimalRebuild="true"
						BasicRuntimeChecks="3"
						RuntimeLibrary="1"
						UsePrecompiledHeader="0"
						AssemblerListingLocation="$(IntDir)/"
						ObjectFile="$(IntDir)/"
						ProgramDataBaseFileName="$(TargetDir)/$(TargetName).pdb"
						WarningLevel="2"
						Detect64BitPortabilityProblems="false"
						DebugInformationFormat="4"
					/>
					<Tool Name="VCManagedResourceCompilerTool" />
					<Tool Name="VCResourceCompilerTool" />
					<Tool Name="VCPreLinkEventTool" />
					<Tool Name="VCLinkerTool"
						IgnoreImportLibrary="false"
						UseLibraryDependencyInputs="false"
						AdditionalDependencies="$(SolutionName)d.lib omniORB4d.lib omniDynamic4d.lib COS4d.lib omnithreadd.lib tangod.lib zmqd.lib log4tangod.lib comctl32.lib ws2_32.lib mswsock.lib advapi32.lib"
						ShowProgress="0"
						OutputFile="$(OutDir)\$(SolutionName).exe"
						LinkIncremental="0"
						AdditionalLibraryDirectories="..\lib\win32\debug;&quot;$(TANGO_ROOT)\win32\lib\vc9&quot;;&quot;$(TANGO_ROOT)\classes\win32\lib\vc9&quot;"
						GenerateManifest="true"
						GenerateDebugInformation="true"
						SubSystem="1"
						RandomizedBaseAddress="1"
						DataExecutionPrevention="0"
						TargetMachine="1"
					/>
					<Tool Name="VCALinkTool" />
					<Tool Name="VCManifestTool" />
					<Tool Name="VCXDCMakeTool" />
					<Tool Name="VCBscMakeTool" />
					<Tool Name="VCFxCopTool" />
					<Tool Name="VCAppVerifierTool" />
					<Tool Name="VCPostBuildEventTool"
						CommandLine="" />
				</Configuration>
				<Configuration
					Name="Release|Win32"
					OutputDirectory="..\bin\win32\release"
					IntermediateDirectory="..\obj\win32\release"
					ConfigurationType="1"
					CharacterSet="1"
					WholeProgramOptimization="1"
					>
					<Tool Name="VCPreBuildEventTool" />
					<Tool Name="VCCustomBuildTool" />
					<Tool Name="VCXMLDataGeneratorTool" />
					<Tool Name="VCWebServiceProxyGeneratorTool" />
					<Tool Name="VCMIDLTool" />
					<Tool Name="VCCLCompilerTool"
						Optimization="0"
						WholeProgramOptimization="false"
						AdditionalIncludeDirectories="..;&quot;$(TANGO_ROOT)\win32\include\vc9&quot;;&quot;TemplateAbstractPath&quot;"
						PreprocessorDefinitions="WIN32;_WINSTATIC;NDEBUG;_CONSOLE"
						MinimalRebuild="true"
						BasicRuntimeChecks="3"
						RuntimeLibrary="0"
						UsePrecompiledHeader="0"
						AssemblerListingLocation="$(IntDir)/"
						ObjectFile="$(IntDir)/"
						ProgramDataBaseFileName="$(IntDir)/"
						WarningLevel="2"
						Detect64BitPortabilityProblems="false"
						DebugInformationFormat="4"
					/>
					<Tool Name="VCManagedResourceCompilerTool" />
					<Tool Name="VCResourceCompilerTool" />
					<Tool Name="VCPreLinkEventTool" />
					<Tool Name="VCLinkerTool"
						AdditionalDependencies="$(SolutionName).lib omniORB4.lib omniDynamic4.lib COS4.lib omnithread.lib tango.lib zmq.lib log4tango.lib comctl32.lib ws2_32.lib mswsock.lib advapi32.lib"
						OutputFile="$(OutDir)\$(SolutionName).exe"
						LinkIncremental="0"
						AdditionalLibraryDirectories="&quot;..\lib\win32\release&quot;;&quot;$(TANGO_ROOT)\win32\lib\vc9&quot;;&quot;$(TANGO_ROOT)\classes\win32\lib\vc9&quot;"
						GenerateDebugInformation="false"
						SubSystem="1"
						OptimizeReferences="0"
						EnableCOMDATFolding="0"
						LinkTimeCodeGeneration="0"
						RandomizedBaseAddress="1"
						DataExecutionPrevention="0"
						TargetMachine="1"
					/>
					<Tool Name="VCALinkTool" />
					<Tool Name="VCManifestTool" />
					<Tool Name="VCXDCMakeTool" />
					<Tool Name="VCBscMakeTool" />
					<Tool Name="VCFxCopTool" />
					<Tool Name="VCAppVerifierTool" />
					<Tool Name="VCPostBuildEventTool" />
				</Configuration>
			</Configurations>
			<References>
			</References>
			<Files>
				<Filter Name="Source Files"
					Filter="cpp;c;cc;cxx;def;odl;idl;hpj;bat;asm;asmx"
					UniqueIdentifier="{4FC737F1-C7A5-4376-A066-2A32D752A2FF}" >
					«"ClassFactory.cpp".buildFileLine»
					«"main.cpp".buildFileLine»
				</Filter>
			</Files>
			<Globals>
			</Globals>
		</VisualStudioProject>
	'''
	
	
	//=============================================================================
 	// Define the ClassDll file
 	//=============================================================================
	def generateVC9_ClassDll (PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="Windows-1252"?>
		<VisualStudioProject
			ProjectType="Visual C++"
			Version="9,00"
			Name="Class_dll"
			ProjectGUID="{F513547B-028B-42F8-BE76-A50FD3A3BA3F}"
			RootNamespace="$(SolutionName)_dll"
			Keyword="Win32Proj"
			TargetFrameworkVersion="131072"
			>
			<Platforms>
				<Platform Name="Win32" />
			</Platforms>
			<ToolFiles>
			</ToolFiles>
			<Configurations>
				<Configuration
					Name="Debug|Win32"
					OutputDirectory="..\dll\win32\debug"
					IntermediateDirectory="..\obj\win32_dll\debug"
					ConfigurationType="2"
					CharacterSet="1" >
					<Tool Name="VCPreBuildEventTool" />
					<Tool Name="VCCustomBuildTool" />
					<Tool Name="VCXMLDataGeneratorTool" />
					<Tool Name="VCWebServiceProxyGeneratorTool" />
					<Tool Name="VCMIDLTool" />
					<Tool Name="VCCLCompilerTool"
						Optimization="0"
						AdditionalIncludeDirectories="..;&quot;$(TANGO_ROOT)\win32\include\vc9&quot;;&quot;$(TANGO_ROOT)\classes\win32\include\vc9&quot;;&quot;TemplateAbstractPath&quot;"
						PreprocessorDefinitions="_DEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE"
						StringPooling="false"
						MinimalRebuild="true"
						BasicRuntimeChecks="3"
						RuntimeLibrary="3"
						UsePrecompiledHeader="0"
						AssemblerListingLocation="$(IntDir)/"
						ObjectFile="$(IntDir)/"
						ProgramDataBaseFileName="$(TargetDir)$(TargetName).pdb"
						WarningLevel="2"
						Detect64BitPortabilityProblems="false"
						DebugInformationFormat="4"
					/>
					<Tool Name="VCManagedResourceCompilerTool" />
					<Tool Name="VCResourceCompilerTool" />
					<Tool Name="VCPreLinkEventTool"
						CommandLine=""
						ExcludedFromBuild="false" />
					<Tool Name="VCLinkerTool"
						AdditionalDependencies="omniORB4_rtd.lib omniDynamic4_rtd.lib COS4_rtd.lib omnithread_rtd.lib tangod.lib log4tangod.lib comctl32.lib ws2_32.lib"
						ShowProgress="0"
						OutputFile="$(OutDir)/$(SolutionName)d.dll"
						Version="1.0"
						LinkIncremental="2"
						SuppressStartupBanner="true"
						AdditionalLibraryDirectories="&quot;$(TANGO_ROOT)\win32\lib\vc9_dll&quot;"
						ModuleDefinitionFile=""
						GenerateDebugInformation="true"
						SubSystem="1"
						RandomizedBaseAddress="1"
						DataExecutionPrevention="0"
						TargetMachine="1"
					/>
					<Tool Name="VCALinkTool" />
					<Tool Name="VCManifestTool" />
					<Tool Name="VCXDCMakeTool" />
					<Tool Name="VCBscMakeTool" />
					<Tool Name="VCFxCopTool" />
					<Tool Name="VCAppVerifierTool" />
					<Tool Name="VCPostBuildEventTool" />
				</Configuration>
				<Configuration
					Name="Release|Win32"
					OutputDirectory="..\dll\win32\release"
					IntermediateDirectory="..\obj\win32_obj\release"
					ConfigurationType="2"
					CharacterSet="1"
					WholeProgramOptimization="1" >
					<Tool Name="VCPreBuildEventTool" />
					<Tool Name="VCCustomBuildTool" />
					<Tool Name="VCXMLDataGeneratorTool" />
					<Tool Name="VCWebServiceProxyGeneratorTool" />
					<Tool Name="VCMIDLTool" />
					<Tool Name="VCCLCompilerTool"
						Optimization="0"
						WholeProgramOptimization="false"
						AdditionalIncludeDirectories="..;&quot;$(TANGO_ROOT)\win32\include\vc9&quot;;&quot;$(TANGO_ROOT)\classes\win32\include\vc9&quot;;&quot;TemplateAbstractPath&quot;"
						PreprocessorDefinitions="NDEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE"
						MinimalRebuild="true"
						BasicRuntimeChecks="3"
						RuntimeLibrary="2"
						UsePrecompiledHeader="0"
						AssemblerListingLocation="$(IntDir)/"
						ObjectFile="$(IntDir)/"
						ProgramDataBaseFileName="$(IntDir)/"
						WarningLevel="2"
						Detect64BitPortabilityProblems="false"
						DebugInformationFormat="4"
					/>
					<Tool Name="VCManagedResourceCompilerTool" />
					<Tool Name="VCResourceCompilerTool" />
					<Tool Name="VCPreLinkEventTool" />
					<Tool Name="VCLinkerTool"
						AdditionalDependencies="omniORB4_rt.lib omniDynamic4_rt.lib COS4_rt.lib omnithread_rt.lib tango.lib log4tango.lib comctl32.lib ws2_32.lib"
						ShowProgress="0"
						OutputFile="$(OutDir)/$(SolutionName).dll"
						LinkIncremental="2"
						SuppressStartupBanner="true"
						AdditionalLibraryDirectories="&quot;$(TANGO_ROOT)\win32\lib\vc9_dll&quot;"
						GenerateDebugInformation="false"
						SubSystem="1"
						LinkTimeCodeGeneration="0"
						RandomizedBaseAddress="1"
						DataExecutionPrevention="0"
						TargetMachine="1" />
					<Tool Name="VCALinkTool" />
					<Tool Name="VCManifestTool" />
					<Tool Name="VCXDCMakeTool" />
					<Tool Name="VCBscMakeTool" />
					<Tool Name="VCFxCopTool" />
					<Tool Name="VCAppVerifierTool" />
					<Tool Name="VCPostBuildEventTool" />
				</Configuration>
			</Configurations>
			<References>
			</References>
			<Files>
				<Filter
					Name="Source Files"
					Filter="cpp;c;cc;cxx;def;odl;idl;hpj;bat;asm;asmx"
					UniqueIdentifier="{4FC737F1-C7A5-4376-A066-2A32D752A2FF}" >
					«cls.sourceFileList»
				</Filter>
				<Filter
					Name="Header Files"
					Filter="h;hpp;hxx;hm;inl;inc;xsd"
					UniqueIdentifier="{93995380-89BD-4b04-88EB-625FBE52EBFB}" >
					«cls.includeFileList»
				</Filter>
			</Files>
			<Globals>
			</Globals>
		</VisualStudioProject>
	'''
	//======================================================
	// Define VC9 server shared file to be generated
	//======================================================
	def generateVC9_ServerShared (PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="Windows-1252"?>
		<VisualStudioProject
			ProjectType="Visual C++"
			Version="9,00"
			Name="Server_shared"
			ProjectGUID="{570AF151-36FC-4638-A23A-673975792A19}"
			RootNamespace="Server_shared"
			TargetFrameworkVersion="131072"
			>
			<Platforms>
				<Platform Name="Win32" />
			</Platforms>
			<ToolFiles>
			</ToolFiles>
			<Configurations>
				<Configuration
					Name="Release|Win32"
					OutputDirectory="..\bin\win32_shared\release"
					IntermediateDirectory="..\obj\win32_dll\release"
					ConfigurationType="1"
					InheritedPropertySheets="$(VCInstallDir)VCProjectDefaults\UpgradeFromVC71.vsprops"
					UseOfMFC="0"
					ATLMinimizesCRunTimeLibraryUsage="false"
					CharacterSet="2"
					>
					<Tool Name="VCPreBuildEventTool" />
					<Tool Name="VCCustomBuildTool" />
					<Tool Name="VCXMLDataGeneratorTool" />
					<Tool Name="VCWebServiceProxyGeneratorTool" />
					<Tool Name="VCMIDLTool"
						TypeLibraryName="$(IntDir)/$(TargetName).tlb"
						HeaderFileName="" />
					<Tool Name="VCCLCompilerTool"
						Optimization="2"
						InlineFunctionExpansion="1"
						AdditionalIncludeDirectories="..;&quot;$(TANGO_ROOT)\win32\include\vc9&quot;;&quot;$(TANGO_ROOT)\classes\win32\include\vc9&quot;;&quot;TemplateAbstractPath&quot;"
						PreprocessorDefinitions="NDEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE"
						StringPooling="true"
						RuntimeLibrary="2"
						EnableFunctionLevelLinking="true"
						RuntimeTypeInfo="true"
						PrecompiledHeaderFile=""
						AssemblerListingLocation="$(IntDir)/"
						ObjectFile="$(IntDir)/"
						ProgramDataBaseFileName="$(IntDir)/"
						WarningLevel="2"
						SuppressStartupBanner="true"
						CompileAs="0"
					/>
					<Tool Name="VCManagedResourceCompilerTool" />
					<Tool Name="VCResourceCompilerTool"
						PreprocessorDefinitions="NDEBUG"
						Culture="1036" />
					<Tool Name="VCPreLinkEventTool" />
					<Tool Name="VCLinkerTool"
						AdditionalDependencies="$(SolutionName).lib omniORB4_rt.lib omniDynamic4_rt.lib COS4_rt.lib omniThread_rt.lib tango.lib zmq.lib log4tango.lib comctl32.lib ws2_32.lib"
						ShowProgress="0"
						OutputFile="$(OutDir)\$(SolutionName).exe"
						LinkIncremental="1"
						SuppressStartupBanner="true"
						AdditionalLibraryDirectories="&quot;..\dll\win32\release&quot;;&quot;$(TANGO_ROOT)\win32\lib\vc9_dll&quot;;&quot;$(TANGO_ROOT)\classes\win32\lib\vc9_dll&quot;"
						GenerateDebugInformation="false"
						ProgramDatabaseFile=""
						SubSystem="1"
						RandomizedBaseAddress="1"
						DataExecutionPrevention="0"
						TargetMachine="1"
					/>
					<Tool Name="VCALinkTool" />
					<Tool Name="VCManifestTool" />
					<Tool Name="VCXDCMakeTool" />
					<Tool Name="VCBscMakeTool" />
					<Tool Name="VCFxCopTool" />
					<Tool Name="VCAppVerifierTool" />
					<Tool Name="VCPostBuildEventTool" />
				</Configuration>
				<Configuration
					Name="Debug|Win32"
					OutputDirectory="..\bin\win32_shared\debug"
					IntermediateDirectory="..\obj\win32_dll\debug"
					ConfigurationType="1"
					InheritedPropertySheets="$(VCInstallDir)VCProjectDefaults\UpgradeFromVC71.vsprops"
					UseOfMFC="0"
					ATLMinimizesCRunTimeLibraryUsage="false"
					CharacterSet="2"
					>
					<Tool Name="VCPreBuildEventTool" />
					<Tool Name="VCCustomBuildTool" />
					<Tool Name="VCXMLDataGeneratorTool" />
					<Tool Name="VCWebServiceProxyGeneratorTool" />
					<Tool Name="VCMIDLTool"
						TypeLibraryName="$(IntDir)/$(TargetName).tlb"
						HeaderFileName="" />
					<Tool
						Name="VCCLCompilerTool"
						Optimization="0"
						AdditionalIncludeDirectories="..;&quot;$(TANGO_ROOT)\win32\include\vc9&quot;;&quot;$(TANGO_ROOT)\classes\win32\include\vc9&quot;;&quot;TemplateAbstractPath&quot;"
						PreprocessorDefinitions="_DEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE"
						BasicRuntimeChecks="3"
						RuntimeLibrary="3"
						RuntimeTypeInfo="true"
						PrecompiledHeaderFile=""
						AssemblerListingLocation="$(IntDir)/"
						ObjectFile="$(IntDir)/"
						ProgramDataBaseFileName="$(TargetDir)$(TargetName).pdb"
						BrowseInformation="1"
						WarningLevel="2"
						SuppressStartupBanner="true"
						DebugInformationFormat="4"
						CompileAs="0"
					/>
					<Tool Name="VCManagedResourceCompilerTool" />
					<Tool Name="VCResourceCompilerTool"
						PreprocessorDefinitions="_DEBUG"
						Culture="1036" />
					<Tool Name="VCPreLinkEventTool" />
					<Tool
						Name="VCLinkerTool"
						AdditionalDependencies="$(SolutionName)d.lib omniORB4_rtd.lib omniDynamic4_rtd.lib COS4_rtd.lib omnithread_rtd.lib tangod.lib zmqd.lib log4tangod.lib comctl32.lib ws2_32.lib"
						ShowProgress="0"
						OutputFile="$(OutDir)\$(SolutionName).exe"
						LinkIncremental="2"
						SuppressStartupBanner="true"
						AdditionalLibraryDirectories="&quot;..\dll\win32\debug&quot;;&quot;$(TANGO_ROOT)\win32\lib\vc9_dll&quot;;&quot;$(TANGO_ROOT)\classes\win32\lib\vc9_dll&quot;"
						GenerateDebugInformation="true"
						SubSystem="1"
						RandomizedBaseAddress="1"
						DataExecutionPrevention="0"
						TargetMachine="1"
					/>
					<Tool Name="VCALinkTool" />
					<Tool Name="VCManifestTool" />
					<Tool Name="VCXDCMakeTool" />
					<Tool Name="VCBscMakeTool" />
					<Tool Name="VCFxCopTool" />
					<Tool Name="VCAppVerifierTool" />
					<Tool Name="VCPostBuildEventTool" />
				</Configuration>
			</Configurations>
			<References>
			</References>
			<Files>
				<Filter Name="Source Files">
					«"ClassFactory.cpp".buildFileLine»
					«"main.cpp".buildFileLine»
				</Filter>
				<Filter Name="Header Files">
				</Filter>
			</Files>
			<Globals>
			</Globals>
		</VisualStudioProject>
	'''
}
