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

package fr.esrf.tango.pogo.generator.cpp.projects.VC10

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject


//======================================================
// Define VC 10 Project to be generated
//======================================================
class VC10_Project {
	
	@Inject	extension VC10Utils

	//======================================================
	// Define VC10 project file to be generated
	//======================================================
	def generateVC10_Project (PogoDeviceClass cls) '''
		Microsoft Visual Studio Solution File, Format Version 11.00
		# Visual C++ Express 2010
		Project("{8BC9CEB8-8B4A-11D0-8D11-00A0C91BC942}") = "Server_static", "Server_static.vcxproj", "{A52909BB-E783-4522-BF2D-D9786023881D}"
		EndProject
		Project("{8BC9CEB8-8B4A-11D0-8D11-00A0C91BC942}") = "Class_lib", "Class_lib.vcxproj", "{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}"
		EndProject
		Project("{8BC9CEB8-8B4A-11D0-8D11-00A0C91BC942}") = "Server_shared", "Server_shared.vcxproj", "{570AF151-36FC-4638-A23A-673975792A19}"
		EndProject
		Project("{8BC9CEB8-8B4A-11D0-8D11-00A0C91BC942}") = "Class_dll", "Class_dll.vcxproj", "{F513547B-028B-42F8-BE76-A50FD3A3BA3F}"
		EndProject
		Global
			GlobalSection(SolutionConfigurationPlatforms) = preSolution
		        Debug|Win32 = Debug|Win32
				Debug|x64 = Debug|x64
				Release|x64 = Release|x64
				Release|Win32 = Release|Win32
			EndGlobalSection
			GlobalSection(ProjectConfigurationPlatforms) = postSolution
				{A52909BB-E783-4522-BF2D-D9786023881D}.Debug|Win32.ActiveCfg = Debug|Win32
				{A52909BB-E783-4522-BF2D-D9786023881D}.Debug|Win32.Build.0 = Debug|Win32
				{A52909BB-E783-4522-BF2D-D9786023881D}.Debug|x64.ActiveCfg = Debug|x64
				{A52909BB-E783-4522-BF2D-D9786023881D}.Debug|x64.Build.0 = Debug|x64
				{A52909BB-E783-4522-BF2D-D9786023881D}.Release|Win32.ActiveCfg = Release|Win32
				{A52909BB-E783-4522-BF2D-D9786023881D}.Release|Win32.Build.0 = Release|Win32
				{A52909BB-E783-4522-BF2D-D9786023881D}.Release|x64.ActiveCfg = Release|x64
				{A52909BB-E783-4522-BF2D-D9786023881D}.Release|x64.Build.0 = Release|x64
				{570AF151-36FC-4638-A23A-673975792A19}.Debug|Win32.ActiveCfg = Debug|Win32
				{570AF151-36FC-4638-A23A-673975792A19}.Debug|Win32.Build.0 = Debug|Win32
				{570AF151-36FC-4638-A23A-673975792A19}.Debug|x64.ActiveCfg = Debug|x64
				{570AF151-36FC-4638-A23A-673975792A19}.Debug|x64.Build.0 = Debug|x64
				{570AF151-36FC-4638-A23A-673975792A19}.Release|Win32.ActiveCfg = Release|Win32
				{570AF151-36FC-4638-A23A-673975792A19}.Release|Win32.Build.0 = Release|Win32
				{570AF151-36FC-4638-A23A-673975792A19}.Release|x64.ActiveCfg = Release|x64
				{570AF151-36FC-4638-A23A-673975792A19}.Release|x64.Build.0 = Release|x64
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Debug|Win32.ActiveCfg = Debug|Win32
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Debug|Win32.Build.0 = Debug|Win32
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Debug|x64.ActiveCfg = Debug|x64
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Debug|x64.Build.0 = Debug|x64
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Release|Win32.ActiveCfg = Release|Win32
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Release|Win32.Build.0 = Release|Win32
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Release|x64.ActiveCfg = Release|x64
				{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}.Release|x64.Build.0 = Release|x64
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Debug|Win32.ActiveCfg = Debug|Win32
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Debug|Win32.Build.0 = Debug|Win32
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Debug|x64.ActiveCfg = Debug|x64
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Debug|x64.Build.0 = Debug|x64
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Release|Win32.ActiveCfg = Release|Win32
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Release|Win32.Build.0 = Release|Win32
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Release|x64.ActiveCfg = Release|x64
				{F513547B-028B-42F8-BE76-A50FD3A3BA3F}.Release|x64.Build.0 = Release|x64
			EndGlobalSection
			GlobalSection(SolutionProperties) = preSolution
				HideSolutionNode = FALSE
			EndGlobalSection
		EndGlobal
	'''


	//=============================================================================
 	// Define the ClassLib file
 	//=============================================================================
	def generateVC10_ClassLib (PogoDeviceClass cls) '''
		«vc10EscapeChars»<?xml version="1.0" encoding="utf-8"?>
		<Project DefaultTargets="Build" ToolsVersion="4.0" xmlns="http://schemas.microsoft.com/developer/msbuild/2003">
		  <ItemGroup Label="ProjectConfigurations">
		    <ProjectConfiguration Include="Debug|Win32">
		      <Configuration>Debug</Configuration>
		      <Platform>Win32</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Debug|x64">
		      <Configuration>Debug</Configuration>
		      <Platform>x64</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Release|Win32">
		      <Configuration>Release</Configuration>
		      <Platform>Win32</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Release|x64">
		      <Configuration>Release</Configuration>
		      <Platform>x64</Platform>
		    </ProjectConfiguration>
		  </ItemGroup>
		  <PropertyGroup Label="Globals">
		    <ProjectGuid>{4C40E24A-E85F-4DD1-9E6D-F8B19CD7D2D4}</ProjectGuid>
		    <RootNamespace>«cls.name»_lib</RootNamespace>
		    <Keyword>Win32Proj</Keyword>
		  </PropertyGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.Default.props" />
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'" Label="Configuration">
		    <ConfigurationType>StaticLibrary</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		    <WholeProgramOptimization>true</WholeProgramOptimization>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'" Label="Configuration">
		    <ConfigurationType>StaticLibrary</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		    <WholeProgramOptimization>true</WholeProgramOptimization>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'" Label="Configuration">
		    <ConfigurationType>StaticLibrary</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'" Label="Configuration">
		    <ConfigurationType>StaticLibrary</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		  </PropertyGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.props" />
		  <ImportGroup Label="ExtensionSettings">
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <PropertyGroup Label="UserMacros" />
		  <PropertyGroup>
		    <_ProjectFileVersion>10.0.40219.1</_ProjectFileVersion>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">..\lib\win32\vc10\</OutDir>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">..\lib\win64\vc10\</OutDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">..\obj\win32\vc10\</IntDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">..\obj\win64\vc10\</IntDir>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">..\lib\win32\vc10\</OutDir>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Release|x64'">..\lib\win64\vc10\</OutDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">..\obj\win32\vc10\</IntDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Release|x64'">..\obj\win64\vc10\</IntDir>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">«cls.name»d</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">«cls.name»d</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">«cls.name»</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Release|x64'">«cls.name»</TargetName>
		  </PropertyGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      «includeFilesPath(32)»
		      <PreprocessorDefinitions>WIN32;_WINSTATIC;_DEBUG;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <StringPooling>false</StringPooling>
		      <MinimalRebuild>true</MinimalRebuild>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreadedDebug</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(TargetDir)$(TargetName).pdb</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>EditAndContinue</DebugInformationFormat>
		    </ClCompile>
		    <Lib>
		      <OutputFile>$(OutDir)«cls.name»d.lib</OutputFile>
		    </Lib>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      «includeFilesPath(64)»
		      <PreprocessorDefinitions>WIN32;_WINSTATIC;_DEBUG;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <StringPooling>false</StringPooling>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreadedDebug</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(TargetDir)$(TargetName).pdb</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>ProgramDatabase</DebugInformationFormat>
		    </ClCompile>
		    <Lib>
		      <OutputFile>$(OutDir)«cls.name»d.lib</OutputFile>
		    </Lib>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      <WholeProgramOptimization>false</WholeProgramOptimization>
		      «includeFilesPath(32)»
		      <PreprocessorDefinitions>WIN32;_WINSTATIC;NDEBUG;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <MinimalRebuild>true</MinimalRebuild>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreaded</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(TargetName)</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>EditAndContinue</DebugInformationFormat>
		    </ClCompile>
		    <Lib>
		      <OutputFile>$(OutDir)«cls.name».lib</OutputFile>
		    </Lib>
		    <PostBuildEvent>
		      <Command>
		      </Command>
		    </PostBuildEvent>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      <WholeProgramOptimization>false</WholeProgramOptimization>
		      «includeFilesPath(64)»
		      <PreprocessorDefinitions>WIN32;_WINSTATIC;NDEBUG;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreaded</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(TargetName)</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>ProgramDatabase</DebugInformationFormat>
		    </ClCompile>
		    <Lib>
		      <OutputFile>$(OutDir)«cls.name».lib</OutputFile>
		    </Lib>
		    <PostBuildEvent>
		      <Command>
		      </Command>
		    </PostBuildEvent>
		  </ItemDefinitionGroup>
		  <ItemGroup>
			«cls.sourceFileList»
		  </ItemGroup>
		  <ItemGroup>
			«cls.includeFileList»
		  </ItemGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.targets" />
		  <ImportGroup Label="ExtensionTargets">
		  </ImportGroup>
		</Project>
	'''


	//=============================================================================
 	// Define the Server static file
 	//=============================================================================
	def generateVC10_ServerStatic (PogoDeviceClass cls) '''
		«vc10EscapeChars»<?xml version="1.0" encoding="utf-8"?>
		<Project DefaultTargets="Build" ToolsVersion="4.0" xmlns="http://schemas.microsoft.com/developer/msbuild/2003">
		  <ItemGroup Label="ProjectConfigurations">
		    <ProjectConfiguration Include="Debug|Win32">
		      <Configuration>Debug</Configuration>
		      <Platform>Win32</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Debug|x64">
		      <Configuration>Debug</Configuration>
		      <Platform>x64</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Release|Win32">
		      <Configuration>Release</Configuration>
		      <Platform>Win32</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Release|x64">
		      <Configuration>Release</Configuration>
		      <Platform>x64</Platform>
		    </ProjectConfiguration>
		  </ItemGroup>
		  <PropertyGroup Label="Globals">
		    <ProjectGuid>{A52909BB-E783-4522-BF2D-D9786023881D}</ProjectGuid>
		    <RootNamespace>$(SolutionName)_static</RootNamespace>
		    <Keyword>Win32Proj</Keyword>
		  </PropertyGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.Default.props" />
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'" Label="Configuration">
		    <ConfigurationType>Application</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		    <WholeProgramOptimization>true</WholeProgramOptimization>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'" Label="Configuration">
		    <ConfigurationType>Application</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		    <WholeProgramOptimization>true</WholeProgramOptimization>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'" Label="Configuration">
		    <ConfigurationType>Application</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'" Label="Configuration">
		    <ConfigurationType>Application</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		  </PropertyGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.props" />
		  <ImportGroup Label="ExtensionSettings">
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <PropertyGroup Label="UserMacros" />
		  <PropertyGroup>
		    <_ProjectFileVersion>10.0.40219.1</_ProjectFileVersion>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">..\bin\win32\vc10\debug\</OutDir>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">..\bin\win64\vc10\debug\</OutDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">..\obj\win32\vc10\debug\</IntDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">..\obj\win64\vc10\debug\</IntDir>
		    <IgnoreImportLibrary Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">false</IgnoreImportLibrary>
		    <IgnoreImportLibrary Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">false</IgnoreImportLibrary>
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'" />
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Debug|x64'" />
		    <GenerateManifest Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">true</GenerateManifest>
		    <GenerateManifest Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">true</GenerateManifest>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">..\bin\win32\vc10\release\</OutDir>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Release|x64'">..\bin\win64\vc10\release\</OutDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">..\obj\win32\vc10\release\</IntDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Release|x64'">..\obj\win64\vc10\release\</IntDir>
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Release|Win32'" />
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Release|x64'" />
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Release|x64'">«cls.name»</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">«cls.name»</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">«cls.name»</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">«cls.name»</TargetName>
		  </PropertyGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		       «includeFilesPath(32)»
		      <PreprocessorDefinitions>WIN32;_WINSTATIC;_DEBUG;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <StringPooling>false</StringPooling>
		      <MinimalRebuild>true</MinimalRebuild>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreadedDebug</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(TargetDir)/$(TargetName).pdb</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>EditAndContinue</DebugInformationFormat>
		    </ClCompile>
		    <ProjectReference>
		      <UseLibraryDependencyInputs>false</UseLibraryDependencyInputs>
		    </ProjectReference>
		    <Link>
		      «cls.libraryList("d", false, true)»
		      <ShowProgress>NotSet</ShowProgress>
		      <OutputFile>$(OutDir)«cls.name».exe</OutputFile>
		      «libraryPath(32,false)»
		      <GenerateDebugInformation>true</GenerateDebugInformation>
		      <SubSystem>Console</SubSystem>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		      <TargetMachine>MachineX86</TargetMachine>
		    </Link>
		    <PostBuildEvent>
		      <Command>
		      </Command>
		    </PostBuildEvent>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      «includeFilesPath(64)»
		      <PreprocessorDefinitions>WIN32;_WINSTATIC;_DEBUG;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <StringPooling>false</StringPooling>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreadedDebug</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(TargetDir)/$(TargetName).pdb</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>ProgramDatabase</DebugInformationFormat>
		    </ClCompile>
		    <ProjectReference>
		      <UseLibraryDependencyInputs>false</UseLibraryDependencyInputs>
		    </ProjectReference>
		    <Link>
		      «cls.libraryList("d", false, true)»
		      <ShowProgress>NotSet</ShowProgress>
		      <OutputFile>$(OutDir)«cls.name».exe</OutputFile>
		      «libraryPath(64, false)»
		      <GenerateDebugInformation>true</GenerateDebugInformation>
		      <SubSystem>Console</SubSystem>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		    </Link>
		    <PostBuildEvent>
		      <Command>
		      </Command>
		    </PostBuildEvent>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      <WholeProgramOptimization>false</WholeProgramOptimization>
		      «includeFilesPath(32)»
		      <PreprocessorDefinitions>WIN32;_WINSTATIC;NDEBUG;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <MinimalRebuild>true</MinimalRebuild>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreaded</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(IntDir)</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>EditAndContinue</DebugInformationFormat>
		    </ClCompile>
		    <Link>
		      «cls.libraryList("", false, true)»
		      <OutputFile>$(OutDir)«cls.name».exe</OutputFile>
		      «libraryPath(32, false)»
		      <GenerateDebugInformation>false</GenerateDebugInformation>
		      <SubSystem>Console</SubSystem>
		      <OptimizeReferences>
		      </OptimizeReferences>
		      <EnableCOMDATFolding>
		      </EnableCOMDATFolding>
		      <LinkTimeCodeGeneration>
		      </LinkTimeCodeGeneration>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		      <TargetMachine>MachineX86</TargetMachine>
		    </Link>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      <WholeProgramOptimization>false</WholeProgramOptimization>
		      «includeFilesPath(64)»
		      <PreprocessorDefinitions>WIN32;_WINSTATIC;NDEBUG;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreaded</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(IntDir)</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>ProgramDatabase</DebugInformationFormat>
		    </ClCompile>
		    <Link>
		      «cls.libraryList("",false, true)»
		      <OutputFile>$(OutDir)«cls.name».exe</OutputFile>
		      «libraryPath(64,false)»
		      <GenerateDebugInformation>false</GenerateDebugInformation>
		      <SubSystem>Console</SubSystem>
		      <OptimizeReferences>
		      </OptimizeReferences>
		      <EnableCOMDATFolding>
		      </EnableCOMDATFolding>
		      <LinkTimeCodeGeneration>
		      </LinkTimeCodeGeneration>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		    </Link>
		  </ItemDefinitionGroup>
		  <ItemGroup>
		    <ClCompile Include="..\ClassFactory.cpp" />
		    <ClCompile Include="..\main.cpp" />
		  </ItemGroup>
		  <ItemGroup>
		    <ProjectReference Include="Class_lib.vcxproj">
		      <Project>{4c40e24a-e85f-4dd1-9e6d-f8b19cd7d2d4}</Project>
		      <ReferenceOutputAssembly>false</ReferenceOutputAssembly>
		    </ProjectReference>
		  </ItemGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.targets" />
		  <ImportGroup Label="ExtensionTargets">
		  </ImportGroup>
		</Project>
	'''

	
	//=============================================================================
 	// Define the ClassDll file
 	//=============================================================================
	def generateVC10_ClassDll (PogoDeviceClass cls) '''
		«vc10EscapeChars»<?xml version="1.0" encoding="utf-8"?>
		<Project DefaultTargets="Build" ToolsVersion="4.0" xmlns="http://schemas.microsoft.com/developer/msbuild/2003">
		  <ItemGroup Label="ProjectConfigurations">
		    <ProjectConfiguration Include="Debug|Win32">
		      <Configuration>Debug</Configuration>
		      <Platform>Win32</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Debug|x64">
		      <Configuration>Debug</Configuration>
		      <Platform>x64</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Release|Win32">
		      <Configuration>Release</Configuration>
		      <Platform>Win32</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Release|x64">
		      <Configuration>Release</Configuration>
		      <Platform>x64</Platform>
		    </ProjectConfiguration>
		  </ItemGroup>
		  <PropertyGroup Label="Globals">
		    <ProjectGuid>{F513547B-028B-42F8-BE76-A50FD3A3BA3F}</ProjectGuid>
		    <RootNamespace>$(SolutionName)_dll</RootNamespace>
		    <Keyword>Win32Proj</Keyword>
		  </PropertyGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.Default.props" />
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'" Label="Configuration">
		    <ConfigurationType>DynamicLibrary</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		    <WholeProgramOptimization>true</WholeProgramOptimization>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'" Label="Configuration">
		    <ConfigurationType>DynamicLibrary</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		    <WholeProgramOptimization>true</WholeProgramOptimization>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'" Label="Configuration">
		    <ConfigurationType>DynamicLibrary</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'" Label="Configuration">
		    <ConfigurationType>DynamicLibrary</ConfigurationType>
		    <CharacterSet>Unicode</CharacterSet>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		  </PropertyGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.props" />
		  <ImportGroup Label="ExtensionSettings">
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		  </ImportGroup>
		  <PropertyGroup Label="UserMacros" />
		  <PropertyGroup>
		    <_ProjectFileVersion>10.0.40219.1</_ProjectFileVersion>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">..\lib\win32\vc10_dll\</OutDir>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">..\lib\win64\vc10_dll\</OutDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">..\obj\win32_dll\debug\</IntDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">..\obj\win64_dll\debug\</IntDir>
		    <PreLinkEventUseInBuild Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">true</PreLinkEventUseInBuild>
		    <PreLinkEventUseInBuild Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">true</PreLinkEventUseInBuild>
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">true</LinkIncremental>
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">true</LinkIncremental>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">..\lib\win32\vc10_dll\</OutDir>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Release|x64'">..\lib\win64\vc10_dll\</OutDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">..\obj\win32_obj\release\</IntDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Release|x64'">..\obj\win64_obj\release\</IntDir>
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">true</LinkIncremental>
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Release|x64'">true</LinkIncremental>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">«cls.name»d</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">«cls.name»d</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">«cls.name»</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Release|x64'">«cls.name»</TargetName>
		  </PropertyGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      «includeFilesPath(32)»
		      <PreprocessorDefinitions>_DEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <StringPooling>false</StringPooling>
		      <MinimalRebuild>true</MinimalRebuild>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreadedDebugDLL</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(TargetDir)$(TargetName).pdb</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>EditAndContinue</DebugInformationFormat>
		    </ClCompile>
		    <PreLinkEvent>
		      <Command>
		      </Command>
		    </PreLinkEvent>
		    <Link>
		      «cls.libraryList("d", true, false)»
		      <ShowProgress>NotSet</ShowProgress>
		      <OutputFile>$(OutDir)$(SolutionName)d.dll</OutputFile>
		      <Version>1.0</Version>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      «libraryPath(32, true)»
		      <ModuleDefinitionFile>
		      </ModuleDefinitionFile>
		      <GenerateDebugInformation>true</GenerateDebugInformation>
		      <SubSystem>Console</SubSystem>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		      <TargetMachine>MachineX86</TargetMachine>
		    </Link>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      «includeFilesPath(64)»
		      <PreprocessorDefinitions>_DEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <StringPooling>false</StringPooling>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreadedDebugDLL</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(TargetDir)$(TargetName).pdb</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>ProgramDatabase</DebugInformationFormat>
		    </ClCompile>
		    <PreLinkEvent>
		      <Command>
		      </Command>
		    </PreLinkEvent>
		    <Link>
		      «cls.libraryList("d", true, false)»
		      <ShowProgress>NotSet</ShowProgress>
		      <OutputFile>$(OutDir)$(SolutionName)d.dll</OutputFile>
		      <Version>1.0</Version>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      «libraryPath(64, true)»
		      <ModuleDefinitionFile>
		      </ModuleDefinitionFile>
		      <GenerateDebugInformation>true</GenerateDebugInformation>
		      <SubSystem>Console</SubSystem>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		    </Link>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      <WholeProgramOptimization>false</WholeProgramOptimization>
		      «includeFilesPath(32)»
		      <PreprocessorDefinitions>NDEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <MinimalRebuild>true</MinimalRebuild>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreadedDLL</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(IntDir)</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>EditAndContinue</DebugInformationFormat>
		    </ClCompile>
		    <Link>
		      «cls.libraryList("", true, false)»
		      <ShowProgress>NotSet</ShowProgress>
		      <OutputFile>$(OutDir)$(SolutionName).dll</OutputFile>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      «libraryPath(32, true)»
		      <GenerateDebugInformation>false</GenerateDebugInformation>
		      <SubSystem>Console</SubSystem>
		      <LinkTimeCodeGeneration>
		      </LinkTimeCodeGeneration>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		      <TargetMachine>MachineX86</TargetMachine>
		    </Link>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'">
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      <WholeProgramOptimization>false</WholeProgramOptimization>
		      «includeFilesPath(64)»
		      <PreprocessorDefinitions>NDEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreadedDLL</RuntimeLibrary>
		      <PrecompiledHeader>
		      </PrecompiledHeader>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(IntDir)</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <DebugInformationFormat>ProgramDatabase</DebugInformationFormat>
		    </ClCompile>
		    <Link>
		      «cls.libraryList("", true, false)»
		      <ShowProgress>NotSet</ShowProgress>
		      <OutputFile>$(OutDir)$(SolutionName).dll</OutputFile>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      «libraryPath(64, true)»
		      <GenerateDebugInformation>false</GenerateDebugInformation>
		      <SubSystem>Console</SubSystem>
		      <LinkTimeCodeGeneration>
		      </LinkTimeCodeGeneration>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		    </Link>
		  </ItemDefinitionGroup>
		  <ItemGroup>
			«cls.sourceFileList»
		  </ItemGroup>
		  <ItemGroup>
			«cls.includeFileList»
		  </ItemGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.targets" />
		  <ImportGroup Label="ExtensionTargets">
		  </ImportGroup>
		</Project>
	'''


	//======================================================
	// Define VC10 server shared file to be generated
	//======================================================
	def generateVC10_ServerShared (PogoDeviceClass cls) '''
		«vc10EscapeChars»<?xml version="1.0" encoding="utf-8"?>
		<Project DefaultTargets="Build" ToolsVersion="4.0" xmlns="http://schemas.microsoft.com/developer/msbuild/2003">
		  <ItemGroup Label="ProjectConfigurations">
		    <ProjectConfiguration Include="Debug|Win32">
		      <Configuration>Debug</Configuration>
		      <Platform>Win32</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Debug|x64">
		      <Configuration>Debug</Configuration>
		      <Platform>x64</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Release|Win32">
		      <Configuration>Release</Configuration>
		      <Platform>Win32</Platform>
		    </ProjectConfiguration>
		    <ProjectConfiguration Include="Release|x64">
		      <Configuration>Release</Configuration>
		      <Platform>x64</Platform>
		    </ProjectConfiguration>
		  </ItemGroup>
		  <PropertyGroup Label="Globals">
		    <ProjectGuid>{570AF151-36FC-4638-A23A-673975792A19}</ProjectGuid>
		    <RootNamespace>Server_shared</RootNamespace>
		  </PropertyGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.Default.props" />
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'" Label="Configuration">
		    <ConfigurationType>Application</ConfigurationType>
		    <UseOfMfc>false</UseOfMfc>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		    <CharacterSet>MultiByte</CharacterSet>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'" Label="Configuration">
		    <ConfigurationType>Application</ConfigurationType>
		    <UseOfMfc>false</UseOfMfc>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		    <CharacterSet>MultiByte</CharacterSet>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'" Label="Configuration">
		    <ConfigurationType>Application</ConfigurationType>
		    <UseOfMfc>false</UseOfMfc>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		    <CharacterSet>MultiByte</CharacterSet>
		  </PropertyGroup>
		  <PropertyGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'" Label="Configuration">
		    <ConfigurationType>Application</ConfigurationType>
		    <UseOfMfc>false</UseOfMfc>
		    <PlatformToolset>Windows7.1SDK</PlatformToolset>
		    <CharacterSet>MultiByte</CharacterSet>
		  </PropertyGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.props" />
		  <ImportGroup Label="ExtensionSettings">
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		    <Import Project="$(VCTargetsPath)Microsoft.CPP.UpgradeFromVC71.props" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		    <Import Project="$(VCTargetsPath)Microsoft.CPP.UpgradeFromVC71.props" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		    <Import Project="$(VCTargetsPath)Microsoft.CPP.UpgradeFromVC71.props" />
		  </ImportGroup>
		  <ImportGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'" Label="PropertySheets">
		    <Import Project="$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props" Condition="exists('$(UserRootDir)\Microsoft.Cpp.$(Platform).user.props')" Label="LocalAppDataPlatform" />
		    <Import Project="$(VCTargetsPath)Microsoft.CPP.UpgradeFromVC71.props" />
		  </ImportGroup>
		  <PropertyGroup Label="UserMacros" />
		  <PropertyGroup>
		    <_ProjectFileVersion>10.0.40219.1</_ProjectFileVersion>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">..\bin\win32_shared\release\</OutDir>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Release|x64'">..\bin\win64_shared\release\</OutDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">..\obj\win32_dll\release\</IntDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Release|x64'">..\obj\win64_dll\release\</IntDir>
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">false</LinkIncremental>
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Release|x64'">false</LinkIncremental>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">..\bin\win32_shared\debug\</OutDir>
		    <OutDir Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">..\bin\win64_shared\debug\</OutDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">..\obj\win32_dll\debug\</IntDir>
		    <IntDir Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">..\obj\win64_dll\debug\</IntDir>
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">true</LinkIncremental>
		    <LinkIncremental Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">true</LinkIncremental>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">«cls.name»</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">«cls.name»</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">«cls.name»</TargetName>
		    <TargetName Condition="'$(Configuration)|$(Platform)'=='Release|x64'">«cls.name»</TargetName>
		  </PropertyGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Release|Win32'">
		    <Midl>
		      <TypeLibraryName>$(IntDir)$(TargetName).tlb</TypeLibraryName>
		      <HeaderFileName>
		      </HeaderFileName>
		    </Midl>
		    <ClCompile>
		      <Optimization>MaxSpeed</Optimization>
		      <InlineFunctionExpansion>OnlyExplicitInline</InlineFunctionExpansion>
		      «includeFilesPath(32)»
		      <PreprocessorDefinitions>NDEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <StringPooling>true</StringPooling>
		      <RuntimeLibrary>MultiThreadedDLL</RuntimeLibrary>
		      <FunctionLevelLinking>true</FunctionLevelLinking>
		      <RuntimeTypeInfo>true</RuntimeTypeInfo>
		      <PrecompiledHeaderOutputFile>
		      </PrecompiledHeaderOutputFile>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(IntDir)</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      <CompileAs>Default</CompileAs>
		    </ClCompile>
		    <ResourceCompile>
		      <PreprocessorDefinitions>NDEBUG;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <Culture>0x040c</Culture>
		    </ResourceCompile>
		    <Link>
		      «cls.libraryList("", true, true)»
		      <ShowProgress>NotSet</ShowProgress>
		      <OutputFile>$(OutDir)«cls.name».exe</OutputFile>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      «libraryPath(32, true)»
		      <GenerateDebugInformation>false</GenerateDebugInformation>
		      <ProgramDatabaseFile>
		      </ProgramDatabaseFile>
		      <SubSystem>Console</SubSystem>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		      <TargetMachine>MachineX86</TargetMachine>
		    </Link>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Release|x64'">
		    <Midl>
		      <TypeLibraryName>$(IntDir)$(TargetName).tlb</TypeLibraryName>
		      <HeaderFileName>
		      </HeaderFileName>
		    </Midl>
		    <ClCompile>
		      <Optimization>MaxSpeed</Optimization>
		      <InlineFunctionExpansion>OnlyExplicitInline</InlineFunctionExpansion>
		      «includeFilesPath(64)»
		      <PreprocessorDefinitions>NDEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <StringPooling>true</StringPooling>
		      <RuntimeLibrary>MultiThreadedDLL</RuntimeLibrary>
		      <FunctionLevelLinking>true</FunctionLevelLinking>
		      <RuntimeTypeInfo>true</RuntimeTypeInfo>
		      <PrecompiledHeaderOutputFile>
		      </PrecompiledHeaderOutputFile>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(IntDir)</ProgramDataBaseFileName>
		      <WarningLevel>Level2</WarningLevel>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      <CompileAs>Default</CompileAs>
		    </ClCompile>
		    <ResourceCompile>
		      <PreprocessorDefinitions>NDEBUG;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <Culture>0x040c</Culture>
		    </ResourceCompile>
		    <Link>
		      «cls.libraryList("",true, true)»
		      <ShowProgress>NotSet</ShowProgress>
		      <OutputFile>$(OutDir)«cls.name».exe</OutputFile>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      «libraryPath(64, true)»
		      <GenerateDebugInformation>false</GenerateDebugInformation>
		      <ProgramDatabaseFile>
		      </ProgramDatabaseFile>
		      <SubSystem>Console</SubSystem>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		    </Link>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Debug|Win32'">
		    <Midl>
		      <TypeLibraryName>$(IntDir)$(TargetName).tlb</TypeLibraryName>
		      <HeaderFileName>
		      </HeaderFileName>
		    </Midl>
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      «includeFilesPath(32)»
		      <PreprocessorDefinitions>_DEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreadedDebugDLL</RuntimeLibrary>
		      <RuntimeTypeInfo>true</RuntimeTypeInfo>
		      <PrecompiledHeaderOutputFile>
		      </PrecompiledHeaderOutputFile>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(TargetDir)$(TargetName).pdb</ProgramDataBaseFileName>
		      <BrowseInformation>true</BrowseInformation>
		      <WarningLevel>Level2</WarningLevel>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      <DebugInformationFormat>EditAndContinue</DebugInformationFormat>
		      <CompileAs>Default</CompileAs>
		    </ClCompile>
		    <ResourceCompile>
		      <PreprocessorDefinitions>_DEBUG;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <Culture>0x040c</Culture>
		    </ResourceCompile>
		    <Link>
		      «cls.libraryList("d", true, true)»
		      <ShowProgress>NotSet</ShowProgress>
		      <OutputFile>$(OutDir)«cls.name».exe</OutputFile>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      «libraryPath(32, true)»
		      <GenerateDebugInformation>true</GenerateDebugInformation>
		      <SubSystem>Console</SubSystem>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		      <TargetMachine>MachineX86</TargetMachine>
		    </Link>
		  </ItemDefinitionGroup>
		  <ItemDefinitionGroup Condition="'$(Configuration)|$(Platform)'=='Debug|x64'">
		    <Midl>
		      <TypeLibraryName>$(IntDir)$(TargetName).tlb</TypeLibraryName>
		      <HeaderFileName>
		      </HeaderFileName>
		    </Midl>
		    <ClCompile>
		      <Optimization>Disabled</Optimization>
		      «includeFilesPath(64)»
		      <PreprocessorDefinitions>_DEBUG;LOG4TANGO_HAS_DLL;TANGO_HAS_DLL;WIN32;_CONSOLE;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <BasicRuntimeChecks>EnableFastChecks</BasicRuntimeChecks>
		      <RuntimeLibrary>MultiThreadedDebugDLL</RuntimeLibrary>
		      <RuntimeTypeInfo>true</RuntimeTypeInfo>
		      <PrecompiledHeaderOutputFile>
		      </PrecompiledHeaderOutputFile>
		      <AssemblerListingLocation>$(IntDir)</AssemblerListingLocation>
		      <ObjectFileName>$(IntDir)</ObjectFileName>
		      <ProgramDataBaseFileName>$(TargetDir)$(TargetName).pdb</ProgramDataBaseFileName>
		      <BrowseInformation>true</BrowseInformation>
		      <WarningLevel>Level2</WarningLevel>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      <DebugInformationFormat>ProgramDatabase</DebugInformationFormat>
		      <CompileAs>Default</CompileAs>
		    </ClCompile>
		    <ResourceCompile>
		      <PreprocessorDefinitions>_DEBUG;%(PreprocessorDefinitions)</PreprocessorDefinitions>
		      <Culture>0x040c</Culture>
		    </ResourceCompile>
		    <Link>
		      «cls.libraryList("d", true, true)»
		      <ShowProgress>NotSet</ShowProgress>
		      <OutputFile>$(OutDir)«cls.name».exe</OutputFile>
		      <SuppressStartupBanner>true</SuppressStartupBanner>
		      «libraryPath(64, true)»
		      <GenerateDebugInformation>true</GenerateDebugInformation>
		      <SubSystem>Console</SubSystem>
		      <RandomizedBaseAddress>false</RandomizedBaseAddress>
		      <DataExecutionPrevention>
		      </DataExecutionPrevention>
		    </Link>
		  </ItemDefinitionGroup>
		  <ItemGroup>
		    <ClCompile Include="..\ClassFactory.cpp" />
		    <ClCompile Include="..\main.cpp" />
		  </ItemGroup>
		  <ItemGroup>
		    <ProjectReference Include="Class_dll.vcxproj">
		      <Project>{f513547b-028b-42f8-be76-a50fd3a3ba3f}</Project>
		      <ReferenceOutputAssembly>false</ReferenceOutputAssembly>
		    </ProjectReference>
		  </ItemGroup>
		  <Import Project="$(VCTargetsPath)\Microsoft.Cpp.targets" />
		  <ImportGroup Label="ExtensionTargets">
		  </ImportGroup>
		</Project>
	'''

	//======================================================
	// Define VC10 code for filters files
	//======================================================
	def generateVC10_Filters (PogoDeviceClass cls) '''
		«vc10EscapeChars»<?xml version="1.0" encoding="utf-8"?>
		<Project ToolsVersion="4.0" xmlns="http://schemas.microsoft.com/developer/msbuild/2003">
		  <ItemGroup>
			«cls.sourceFileList»
		  </ItemGroup>
		  <ItemGroup>
			«cls.includeFileList»
		  </ItemGroup>
		  <ItemGroup>
		    <Filter Include="Header Files">
		      <UniqueIdentifier>{26066fcf-2f85-4ed9-978a-766eb01b58f5}</UniqueIdentifier>
		    </Filter>
		  </ItemGroup>
		</Project>
	'''
}