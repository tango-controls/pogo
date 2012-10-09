package fr.esrf.tango.pogo.generator.java.projects

import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import static extension fr.esrf.tango.pogo.generator.java.JavaUtils.*
import static extension fr.esrf.tango.pogo.generator.java.ProtectedArea.*
import static extension fr.esrf.tango.pogo.generator.java.JavaTypeDefinitions.*
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*

class IdeaProject  implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			if (cls.description.language.toLowerCase.equals("java")) {
				if (cls.description.filestogenerate.contains("IntelliJIDEA")) {
					fsa.generateFile(cls.name + ".iml",     cls.generateIdeaProjectMain)
					fsa.generateFile(".idea/ant.xml",       cls.generateIdeaProjectAnt)
					fsa.generateFile(".idea/compiler.xml",  cls.generateIdeaProjectCompiler);
					fsa.generateFile(".idea/encodings.xml", cls.generateIdeaProjectEncoding);
					fsa.generateFile(".idea/misc.xml",      cls.generateIdeaProjectMisc);
					fsa.generateFile(".idea/modules.xml",   cls.generateIdeaProjectModules);
					fsa.generateFile(".idea/uiDesigner.xml",cls.generateIdeaProjectUiDesigner);
					fsa.generateFile(".idea/vcs.xml",       cls.generateIdeaProjectVcs);
					fsa.generateFile(".idea/workspace.xml", cls.generateIdeaProjectWorkspace);
					fsa.generateFile(".idea/copyright/profiles_settings.xml", cls.generateIdeaProjectProfile);
					fsa.generateFile(".idea/scopes/scope_settings.xml",       cls.generateIdeaProjectScope);
				}
			}
		}
	}	

	//======================================================
	// define the ItelliJIDEA project files
	//======================================================
	def generateIdeaProjectMain(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<module type="JAVA_MODULE" version="4">
		  <component name="NewModuleRootManager" inherit-compiler-output="false">
		    <output url="file://$MODULE_DIR$/bin" />
		    <output-test url="file://$MODULE_DIR$/bin" />
		    <exclude-output />
		    <content url="file://$MODULE_DIR$">
		      <sourceFolder url="file://$MODULE_DIR$" isTestSource="false" />
		    </content>
		    <orderEntry type="inheritedJdk" />
		    <orderEntry type="sourceFolder" forTests="false" />
		    <orderEntry type="module-library">
		      <library>
		        <CLASSES>
		          <root url="jar://«getJserverJarFile»!/" />
		        </CLASSES>
		        <JAVADOC />
		        <SOURCES />
		      </library>
		    </orderEntry>
		  </component>
		</module>
	'''

	//======================================================
	//======================================================
	def generateIdeaProjectWorkspace(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project version="4">
		  <component name="ChangeListManager">
		    <list default="true" id="6e7cf6c1-2f38-4f6c-ab3c-8377315cd1d4" name="Default" comment="" />
		    <ignored path="«cls.name».iws" />
		    <ignored path=".idea/workspace.xml" />
		    <option name="TRACKING_ENABLED" value="true" />
		    <option name="SHOW_DIALOG" value="false" />
		    <option name="HIGHLIGHT_CONFLICTS" value="true" />
		    <option name="HIGHLIGHT_NON_ACTIVE_CHANGELIST" value="false" />
		    <option name="LAST_RESOLUTION" value="IGNORE" />
		  </component>
		  <component name="ChangesViewManager" flattened_view="true" show_ignored="false" />
		  <component name="CreatePatchCommitExecutor">
		    <option name="PATCH_PATH" value="" />
		  </component>
		  <component name="DaemonCodeAnalyzer">
		    <disable_hints />
		  </component>
		  <component name="DebuggerManager">
		    <breakpoint_any>
		      <breakpoint>
		        <option name="NOTIFY_CAUGHT" value="true" />
		        <option name="NOTIFY_UNCAUGHT" value="true" />
		        <option name="ENABLED" value="false" />
		        <option name="LOG_ENABLED" value="false" />
		        <option name="LOG_EXPRESSION_ENABLED" value="false" />
		        <option name="SUSPEND_POLICY" value="SuspendAll" />
		        <option name="COUNT_FILTER_ENABLED" value="false" />
		        <option name="COUNT_FILTER" value="0" />
		        <option name="CONDITION_ENABLED" value="false" />
		        <option name="CLASS_FILTERS_ENABLED" value="false" />
		        <option name="INSTANCE_FILTERS_ENABLED" value="false" />
		        <option name="CONDITION" value="" />
		        <option name="LOG_MESSAGE" value="" />
		      </breakpoint>
		      <breakpoint>
		        <option name="NOTIFY_CAUGHT" value="true" />
		        <option name="NOTIFY_UNCAUGHT" value="true" />
		        <option name="ENABLED" value="false" />
		        <option name="LOG_ENABLED" value="false" />
		        <option name="LOG_EXPRESSION_ENABLED" value="false" />
		        <option name="SUSPEND_POLICY" value="SuspendAll" />
		        <option name="COUNT_FILTER_ENABLED" value="false" />
		        <option name="COUNT_FILTER" value="0" />
		        <option name="CONDITION_ENABLED" value="false" />
		        <option name="CLASS_FILTERS_ENABLED" value="false" />
		        <option name="INSTANCE_FILTERS_ENABLED" value="false" />
		        <option name="CONDITION" value="" />
		        <option name="LOG_MESSAGE" value="" />
		      </breakpoint>
		    </breakpoint_any>
		    <breakpoint_rules />
		    <ui_properties />
		  </component>
		  <component name="FavoritesManager">
		    <favorites_list name="«cls.name»" />
		  </component>
		  <component name="FileEditorManager">
		    <leaf>
		      <file leaf-file-name="«cls.name».java" pinned="false" current="true" current-in-tab="true">
		        <entry file="file://$PROJECT_DIR$/org/tango/«cls.name.toLowerCase»/«cls.name».java">
		          <provider selected="true" editor-type-id="text-editor">
		            <state line="431" column="20" selection-start="13524" selection-end="13524" vertical-scroll-proportion="6.7017546">
		              <folding />
		            </state>
		          </provider>
		        </entry>
		      </file>
		    </leaf>
		  </component>
		  <component name="FindManager">
		    <FindUsagesManager>
		      <setting name="OPEN_NEW_TAB" value="false" />
		    </FindUsagesManager>
		  </component>
		  <component name="Git.Settings">
		    <option name="CHECKOUT_INCLUDE_TAGS" value="false" />
		    <option name="UPDATE_CHANGES_POLICY" value="STASH" />
		    <option name="LINE_SEPARATORS_CONVERSION" value="ASK" />
		  </component>
		  <component name="IdeDocumentHistory">
		    <option name="changedFiles">
		      <list>
		        <option value="$PROJECT_DIR$/org/tango/«cls.name.toLowerCase»/«cls.name».java" />
		      </list>
		    </option>
		  </component>
		  <component name="ProjectFrameBounds">
		    <option name="x" value="1" />
		    <option name="y" value="1" />
		    <option name="width" value="1918" />
		    <option name="height" value="1168" />
		  </component>
		  <component name="ProjectLevelVcsManager" settingsEditedManually="false">
		    <OptionsSetting value="true" id="Add" />
		    <OptionsSetting value="true" id="Remove" />
		    <OptionsSetting value="true" id="Checkout" />
		    <OptionsSetting value="true" id="Update" />
		    <OptionsSetting value="true" id="Status" />
		    <OptionsSetting value="true" id="Edit" />
		    <ConfirmationsSetting value="0" id="Add" />
		    <ConfirmationsSetting value="0" id="Remove" />
		  </component>
		  <component name="ProjectReloadState">
		    <option name="STATE" value="0" />
		  </component>
		  <component name="ProjectView">
		    <navigator currentView="ProjectPane" proportions="" version="1" splitterProportion="0.5">
		      <flattenPackages />
		      <showMembers />
		      <showModules />
		      <showLibraryContents />
		      <hideEmptyPackages />
		      <abbreviatePackageNames />
		      <autoscrollToSource />
		      <autoscrollFromSource />
		      <sortByType />
		    </navigator>
		    <panes>
		      <pane id="ProjectPane">
		        <subPane>
		          <PATH>
		            <PATH_ELEMENT>
		              <option name="myItemId" value="«cls.name»" />
		              <option name="myItemType" value="com.intellij.ide.projectView.impl.nodes.ProjectViewProjectNode" />
		            </PATH_ELEMENT>
		          </PATH>
		          <PATH>
		            <PATH_ELEMENT>
		              <option name="myItemId" value="«cls.name»" />
		              <option name="myItemType" value="com.intellij.ide.projectView.impl.nodes.ProjectViewProjectNode" />
		            </PATH_ELEMENT>
		            <PATH_ELEMENT>
		              <option name="myItemId" value="java" />
		              <option name="myItemType" value="com.intellij.ide.projectView.impl.nodes.PsiDirectoryNode" />
		            </PATH_ELEMENT>
		          </PATH>
		          <PATH>
		            <PATH_ELEMENT>
		              <option name="myItemId" value="«cls.name»" />
		              <option name="myItemType" value="com.intellij.ide.projectView.impl.nodes.ProjectViewProjectNode" />
		            </PATH_ELEMENT>
		            <PATH_ELEMENT>
		              <option name="myItemId" value="java" />
		              <option name="myItemType" value="com.intellij.ide.projectView.impl.nodes.PsiDirectoryNode" />
		            </PATH_ELEMENT>
		            <PATH_ELEMENT>
		              <option name="myItemId" value="«cls.name.toLowerCase»" />
		              <option name="myItemType" value="com.intellij.ide.projectView.impl.nodes.PsiDirectoryNode" />
		            </PATH_ELEMENT>
		          </PATH>
		        </subPane>
		      </pane>
		      <pane id="Scope" />
		      <pane id="PackagesPane" />
		    </panes>
		  </component>
		  <component name="PropertiesComponent">
		    <property name="project.structure.last.edited" value="Modules" />
		    <property name="GoToFile.includeJavaFiles" value="false" />
		    <property name="project.structure.proportion" value="0.0" />
		    <property name="GoToClass.toSaveIncludeLibraries" value="false" />
		    <property name="recentsLimit" value="5" />
		    <property name="MemberChooser.sorted" value="false" />
		    <property name="MemberChooser.showClasses" value="true" />
		    <property name="project.structure.side.proportion" value="0.0" />
		    <property name="GoToClass.includeLibraries" value="false" />
		    <property name="dynamic.classpath" value="false" />
		    <property name="MemberChooser.copyJavadoc" value="false" />
		  </component>
		  <component name="RunManager" selected="Application.«cls.name»">
		    <configuration default="true" type="#org.jetbrains.idea.devkit.run.PluginConfigurationType" factoryName="Plugin">
		      <module name="" />
		      <option name="VM_PARAMETERS" value="-Xmx512m -Xms256m -XX:MaxPermSize=250m" />
		      <option name="PROGRAM_PARAMETERS" />
		      <method>
		        <option name="AntTarget" enabled="false" />
		        <option name="BuildArtifacts" enabled="false" />
		        <option name="Make" enabled="true" />
		        <option name="Maven.BeforeRunTask" enabled="false" />
		      </method>
		    </configuration>
		    <configuration default="true" type="Remote" factoryName="Remote">
		      <option name="USE_SOCKET_TRANSPORT" value="true" />
		      <option name="SERVER_MODE" value="false" />
		      <option name="SHMEM_ADDRESS" value="javadebug" />
		      <option name="HOST" value="localhost" />
		      <option name="PORT" value="5005" />
		      <method>
		        <option name="AntTarget" enabled="false" />
		        <option name="BuildArtifacts" enabled="false" />
		        <option name="Maven.BeforeRunTask" enabled="false" />
		      </method>
		    </configuration>
		    <configuration default="true" type="Applet" factoryName="Applet">
		      <module name="" />
		      <option name="MAIN_CLASS_NAME" />
		      <option name="HTML_FILE_NAME" />
		      <option name="HTML_USED" value="false" />
		      <option name="WIDTH" value="400" />
		      <option name="HEIGHT" value="300" />
		      <option name="POLICY_FILE" value="$APPLICATION_HOME_DIR$/bin/appletviewer.policy" />
		      <option name="VM_PARAMETERS" />
		      <option name="ALTERNATIVE_JRE_PATH_ENABLED" value="false" />
		      <option name="ALTERNATIVE_JRE_PATH" />
		      <method>
		        <option name="AntTarget" enabled="false" />
		        <option name="BuildArtifacts" enabled="false" />
		        <option name="Make" enabled="true" />
		        <option name="Maven.BeforeRunTask" enabled="false" />
		      </method>
		    </configuration>
		    <configuration default="true" type="TestNG" factoryName="TestNG">
		      <module name="" />
		      <option name="ALTERNATIVE_JRE_PATH_ENABLED" value="false" />
		      <option name="ALTERNATIVE_JRE_PATH" />
		      <option name="SUITE_NAME" />
		      <option name="PACKAGE_NAME" />
		      <option name="MAIN_CLASS_NAME" />
		      <option name="METHOD_NAME" />
		      <option name="GROUP_NAME" />
		      <option name="TEST_OBJECT" value="CLASS" />
		      <option name="VM_PARAMETERS" value="-ea" />
		      <option name="PARAMETERS" />
		      <option name="WORKING_DIRECTORY" value="$PROJECT_DIR$" />
		      <option name="OUTPUT_DIRECTORY" />
		      <option name="ANNOTATION_TYPE" />
		      <option name="ENV_VARIABLES" />
		      <option name="PASS_PARENT_ENVS" value="true" />
		      <option name="TEST_SEARCH_SCOPE">
		        <value defaultName="moduleWithDependencies" />
		      </option>
		      <option name="USE_DEFAULT_REPORTERS" value="false" />
		      <option name="PROPERTIES_FILE" />
		      <envs />
		      <properties />
		      <listeners />
		      <method>
		        <option name="AntTarget" enabled="false" />
		        <option name="BuildArtifacts" enabled="false" />
		        <option name="Make" enabled="true" />
		        <option name="Maven.BeforeRunTask" enabled="false" />
		      </method>
		    </configuration>
		    <configuration default="true" type="Application" factoryName="Application">
		      <option name="MAIN_CLASS_NAME" />
		      <option name="VM_PARAMETERS" />
		      <option name="PROGRAM_PARAMETERS" />
		      <option name="WORKING_DIRECTORY" value="$PROJECT_DIR$" />
		      <option name="ALTERNATIVE_JRE_PATH_ENABLED" value="false" />
		      <option name="ALTERNATIVE_JRE_PATH" />
		      <option name="ENABLE_SWING_INSPECTOR" value="false" />
		      <option name="ENV_VARIABLES" />
		      <option name="PASS_PARENT_ENVS" value="true" />
		      <module name="" />
		      <envs />
		      <method>
		        <option name="AntTarget" enabled="false" />
		        <option name="BuildArtifacts" enabled="false" />
		        <option name="Make" enabled="true" />
		        <option name="Maven.BeforeRunTask" enabled="false" />
		      </method>
		    </configuration>
		    <configuration default="true" type="JUnit" factoryName="JUnit">
		      <module name="" />
		      <option name="ALTERNATIVE_JRE_PATH_ENABLED" value="false" />
		      <option name="ALTERNATIVE_JRE_PATH" />
		      <option name="PACKAGE_NAME" />
		      <option name="MAIN_CLASS_NAME" />
		      <option name="METHOD_NAME" />
		      <option name="TEST_OBJECT" value="class" />
		      <option name="VM_PARAMETERS" value="-ea" />
		      <option name="PARAMETERS" />
		      <option name="WORKING_DIRECTORY" value="$PROJECT_DIR$" />
		      <option name="ENV_VARIABLES" />
		      <option name="PASS_PARENT_ENVS" value="true" />
		      <option name="TEST_SEARCH_SCOPE">
		        <value defaultName="moduleWithDependencies" />
		      </option>
		      <envs />
		      <patterns />
		      <method>
		        <option name="AntTarget" enabled="false" />
		        <option name="BuildArtifacts" enabled="false" />
		        <option name="Make" enabled="true" />
		        <option name="Maven.BeforeRunTask" enabled="false" />
		      </method>
		    </configuration>
		    <configuration default="false" name="«cls.name»" type="Application" factoryName="Application">
		      <option name="MAIN_CLASS_NAME" value="org.tango.«cls.name.toLowerCase».«cls.name»" />
		      <option name="VM_PARAMETERS" value="-DTANGO_HOST=hal:2001" />
		      <option name="PROGRAM_PARAMETERS" value="test" />
		      <option name="WORKING_DIRECTORY" value="file://$PROJECT_DIR$" />
		      <option name="ALTERNATIVE_JRE_PATH_ENABLED" value="false" />
		      <option name="ALTERNATIVE_JRE_PATH" value="" />
		      <option name="ENABLE_SWING_INSPECTOR" value="false" />
		      <option name="ENV_VARIABLES" />
		      <option name="PASS_PARENT_ENVS" value="true" />
		      <module name="«cls.name»" />
		      <envs />
		      <RunnerSettings RunnerId="JProfiler">
		        <option name="WINDOW" value="false" />
		        <option name="JVMPI" value="false" />
		        <option name="INTERPRETED" value="false" />
		      </RunnerSettings>
		      <RunnerSettings RunnerId="Run" />
		      <ConfigurationWrapper RunnerId="Run" />
		      <method />
		    </configuration>
		    <list size="1">
		      <item index="0" class="java.lang.String" itemvalue="Application.«cls.name»" />
		    </list>
		    <configuration name="&lt;template&gt;" type="WebApp" default="true" selected="false">
		      <Host>localhost</Host>
		      <Port>5050</Port>
		    </configuration>
		  </component>
		  <component name="ShelveChangesManager" show_recycled="false" />
		  <component name="TaskManager">
		    <task active="true" id="Default" summary="Default task">
		      <created>1341233095020</created>
		      <updated>1341233095020</updated>
		    </task>
		    <servers />
		  </component>
		  <component name="ToolWindowManager">
		    <frame x="1" y="1" width="1918" height="1168" extended-state="0" />
		    <editor active="false" />
		    <layout>
		      <window_info id="Changes" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="-1" side_tool="false" content_ui="tabs" />
		      <window_info id="Palette" active="false" anchor="right" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="-1" side_tool="false" content_ui="tabs" />
		      <window_info id="Ant Build" active="false" anchor="right" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.25" sideWeight="0.5" order="1" side_tool="false" content_ui="tabs" />
		      <window_info id="Debug" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.4" sideWeight="0.5" order="3" side_tool="false" content_ui="tabs" />
		      <window_info id="Event Log" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="-1" side_tool="true" content_ui="tabs" />
		      <window_info id="Favorites" active="false" anchor="left" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="-1" side_tool="true" content_ui="tabs" />
		      <window_info id="Version Control" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="-1" side_tool="false" content_ui="tabs" />
		      <window_info id="Messages" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="-1" side_tool="false" content_ui="tabs" />
		      <window_info id="TODO" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="6" side_tool="false" content_ui="tabs" />
		      <window_info id="Structure" active="false" anchor="left" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.25" sideWeight="0.5" order="1" side_tool="true" content_ui="tabs" />
		      <window_info id="Maven Projects" active="false" anchor="right" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="-1" side_tool="false" content_ui="tabs" />
		      <window_info id="Commander" active="false" anchor="right" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.4" sideWeight="0.5" order="0" side_tool="false" content_ui="tabs" />
		      <window_info id="JProfiler" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="-1" side_tool="false" content_ui="tabs" />
		      <window_info id="Project" active="false" anchor="left" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="true" weight="0.24973032" sideWeight="0.6709613" order="0" side_tool="false" content_ui="tabs" />
		      <window_info id="Run" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.32903865" sideWeight="0.5" order="2" side_tool="false" content_ui="tabs" />
		      <window_info id="Cvs" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.25" sideWeight="0.5" order="4" side_tool="false" content_ui="tabs" />
		      <window_info id="Message" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="0" side_tool="false" content_ui="tabs" />
		      <window_info id="Find" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.33" sideWeight="0.5" order="1" side_tool="false" content_ui="tabs" />
		      <window_info id="Inspection" active="false" anchor="bottom" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.4" sideWeight="0.5" order="5" side_tool="false" content_ui="tabs" />
		      <window_info id="Hierarchy" active="false" anchor="right" auto_hide="false" internal_type="DOCKED" type="DOCKED" visible="false" weight="0.25" sideWeight="0.5" order="2" side_tool="false" content_ui="combo" />
		    </layout>
		  </component>
		  <component name="VcsContentAnnotationSettings">
		    <option name="myLimit" value="2678400000" />
		  </component>
		  <component name="VcsManagerConfiguration">
		    <option name="OFFER_MOVE_TO_ANOTHER_CHANGELIST_ON_PARTIAL_COMMIT" value="true" />
		    <option name="CHECK_CODE_SMELLS_BEFORE_PROJECT_COMMIT" value="true" />
		    <option name="CHECK_NEW_TODO" value="true" />
		    <option name="myTodoPanelSettings">
		      <value>
		        <are-packages-shown value="false" />
		        <are-modules-shown value="false" />
		        <flatten-packages value="false" />
		        <is-autoscroll-to-source value="false" />
		      </value>
		    </option>
		    <option name="PERFORM_UPDATE_IN_BACKGROUND" value="true" />
		    <option name="PERFORM_COMMIT_IN_BACKGROUND" value="true" />
		    <option name="PERFORM_EDIT_IN_BACKGROUND" value="true" />
		    <option name="PERFORM_CHECKOUT_IN_BACKGROUND" value="true" />
		    <option name="PERFORM_ADD_REMOVE_IN_BACKGROUND" value="true" />
		    <option name="PERFORM_ROLLBACK_IN_BACKGROUND" value="false" />
		    <option name="CHECK_LOCALLY_CHANGED_CONFLICTS_IN_BACKGROUND" value="false" />
		    <option name="ENABLE_BACKGROUND_PROCESSES" value="false" />
		    <option name="CHANGED_ON_SERVER_INTERVAL" value="60" />
		    <option name="SHOW_ONLY_CHANGED_IN_SELECTION_DIFF" value="true" />
		    <option name="CHECK_COMMIT_MESSAGE_SPELLING" value="true" />
		    <option name="DEFAULT_PATCH_EXTENSION" value="patch" />
		    <option name="SHORT_DIFF_HORISONTALLY" value="true" />
		    <option name="SHORT_DIFF_EXTRA_LINES" value="2" />
		    <option name="SOFT_WRAPS_IN_SHORT_DIFF" value="true" />
		    <option name="INCLUDE_TEXT_INTO_PATCH" value="false" />
		    <option name="INCLUDE_TEXT_INTO_SHELF" value="false" />
		    <option name="CREATE_PATCH_EXPAND_DETAILS_DEFAULT" value="true" />
		    <option name="FORCE_NON_EMPTY_COMMENT" value="false" />
		    <option name="LAST_COMMIT_MESSAGE" />
		    <option name="MAKE_NEW_CHANGELIST_ACTIVE" value="true" />
		    <option name="OPTIMIZE_IMPORTS_BEFORE_PROJECT_COMMIT" value="false" />
		    <option name="CHECK_FILES_UP_TO_DATE_BEFORE_COMMIT" value="false" />
		    <option name="REFORMAT_BEFORE_PROJECT_COMMIT" value="false" />
		    <option name="REFORMAT_BEFORE_FILE_COMMIT" value="false" />
		    <option name="FILE_HISTORY_DIALOG_COMMENTS_SPLITTER_PROPORTION" value="0.8" />
		    <option name="FILE_HISTORY_DIALOG_SPLITTER_PROPORTION" value="0.5" />
		    <option name="ACTIVE_VCS_NAME" />
		    <option name="UPDATE_GROUP_BY_PACKAGES" value="false" />
		    <option name="UPDATE_GROUP_BY_CHANGELIST" value="false" />
		    <option name="SHOW_FILE_HISTORY_AS_TREE" value="false" />
		    <option name="FILE_HISTORY_SPLITTER_PROPORTION" value="0.6" />
		  </component>
		  <component name="XDebuggerManager">
		    <breakpoint-manager />
		  </component>
		  <component name="antWorkspaceConfiguration">
		    <option name="IS_AUTOSCROLL_TO_SOURCE" value="false" />
		    <option name="FILTER_TARGETS" value="false" />
		  </component>
		  <component name="editorHistoryManager">
		    <entry file="file://$PROJECT_DIR$/org/tango/«cls.name.toLowerCase»/«cls.name».java">
		      <provider selected="true" editor-type-id="text-editor">
		        <state line="431" column="20" selection-start="13524" selection-end="13524" vertical-scroll-proportion="6.7017546">
		          <folding />
		        </state>
		      </provider>
		    </entry>
		  </component>
		  <component name="masterDetails">
		    <states>
		      <state key="ArtifactsStructureConfigurable.UI">
		        <settings>
		          <artifact-editor />
		          <splitter-proportions>
		            <option name="proportions">
		              <list>
		                <option value="0.2" />
		              </list>
		            </option>
		          </splitter-proportions>
		        </settings>
		      </state>
		      <state key="FacetStructureConfigurable.UI">
		        <settings>
		          <last-edited>No facets are configured</last-edited>
		          <splitter-proportions>
		            <option name="proportions">
		              <list>
		                <option value="0.2" />
		              </list>
		            </option>
		          </splitter-proportions>
		        </settings>
		      </state>
		      <state key="GlobalLibrariesConfigurable.UI">
		        <settings>
		          <splitter-proportions>
		            <option name="proportions">
		              <list>
		                <option value="0.2" />
		              </list>
		            </option>
		          </splitter-proportions>
		        </settings>
		      </state>
		      <state key="JdkListConfigurable.UI">
		        <settings>
		          <last-edited>1.6</last-edited>
		          <splitter-proportions>
		            <option name="proportions">
		              <list>
		                <option value="0.2" />
		              </list>
		            </option>
		          </splitter-proportions>
		        </settings>
		      </state>
		      <state key="ModuleStructureConfigurable.UI">
		        <settings>
		          <last-edited>«cls.name»</last-edited>
		          <splitter-proportions>
		            <option name="proportions">
		              <list>
		                <option value="0.2" />
		              </list>
		            </option>
		          </splitter-proportions>
		        </settings>
		      </state>
		      <state key="ProjectJDKs.UI">
		        <settings>
		          <last-edited>1.6</last-edited>
		          <splitter-proportions>
		            <option name="proportions">
		              <list>
		                <option value="0.2" />
		              </list>
		            </option>
		          </splitter-proportions>
		        </settings>
		      </state>
		      <state key="ProjectLibrariesConfigurable.UI">
		        <settings>
		          <splitter-proportions>
		            <option name="proportions">
		              <list>
		                <option value="0.2" />
		              </list>
		            </option>
		          </splitter-proportions>
		        </settings>
		      </state>
		    </states>
		  </component>
		</project>
	'''

	//======================================================
	//======================================================
	def generateIdeaProjectVcs(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project version="4">
		  <component name="VcsDirectoryMappings">
		    <mapping directory="" vcs="" />
		  </component>
		</project>
	'''

	//======================================================
	//======================================================
	def generateIdeaProjectUiDesigner(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project version="4">
		  <component name="Palette2">
		    <group name="Swing">
		      <item class="com.intellij.uiDesigner.HSpacer" tooltip-text="Horizontal Spacer" icon="/com/intellij/uiDesigner/icons/hspacer.png" removable="false" auto-create-binding="false" can-attach-label="false">
		        <default-constraints vsize-policy="1" hsize-policy="6" anchor="0" fill="1" />
		      </item>
		      <item class="com.intellij.uiDesigner.VSpacer" tooltip-text="Vertical Spacer" icon="/com/intellij/uiDesigner/icons/vspacer.png" removable="false" auto-create-binding="false" can-attach-label="false">
		        <default-constraints vsize-policy="6" hsize-policy="1" anchor="0" fill="2" />
		      </item>
		      <item class="javax.swing.JPanel" icon="/com/intellij/uiDesigner/icons/panel.png" removable="false" auto-create-binding="false" can-attach-label="false">
		        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3" />
		      </item>
		      <item class="javax.swing.JScrollPane" icon="/com/intellij/uiDesigner/icons/scrollPane.png" removable="false" auto-create-binding="false" can-attach-label="true">
		        <default-constraints vsize-policy="7" hsize-policy="7" anchor="0" fill="3" />
		      </item>
		      <item class="javax.swing.JButton" icon="/com/intellij/uiDesigner/icons/button.png" removable="false" auto-create-binding="true" can-attach-label="false">
		        <default-constraints vsize-policy="0" hsize-policy="3" anchor="0" fill="1" />
		        <initial-values>
		          <property name="text" value="Button" />
		        </initial-values>
		      </item>
		      <item class="javax.swing.JRadioButton" icon="/com/intellij/uiDesigner/icons/radioButton.png" removable="false" auto-create-binding="true" can-attach-label="false">
		        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />
		        <initial-values>
		          <property name="text" value="RadioButton" />
		        </initial-values>
		      </item>
		      <item class="javax.swing.JCheckBox" icon="/com/intellij/uiDesigner/icons/checkBox.png" removable="false" auto-create-binding="true" can-attach-label="false">
		        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />
		        <initial-values>
		          <property name="text" value="CheckBox" />
		        </initial-values>
		      </item>
		      <item class="javax.swing.JLabel" icon="/com/intellij/uiDesigner/icons/label.png" removable="false" auto-create-binding="false" can-attach-label="false">
		        <default-constraints vsize-policy="0" hsize-policy="0" anchor="8" fill="0" />
		        <initial-values>
		          <property name="text" value="Label" />
		        </initial-values>
		      </item>
		      <item class="javax.swing.JTextField" icon="/com/intellij/uiDesigner/icons/textField.png" removable="false" auto-create-binding="true" can-attach-label="true">
		        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
		          <preferred-size width="150" height="-1" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JPasswordField" icon="/com/intellij/uiDesigner/icons/passwordField.png" removable="false" auto-create-binding="true" can-attach-label="true">
		        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
		          <preferred-size width="150" height="-1" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JFormattedTextField" icon="/com/intellij/uiDesigner/icons/formattedTextField.png" removable="false" auto-create-binding="true" can-attach-label="true">
		        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
		          <preferred-size width="150" height="-1" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JTextArea" icon="/com/intellij/uiDesigner/icons/textArea.png" removable="false" auto-create-binding="true" can-attach-label="true">
		        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
		          <preferred-size width="150" height="50" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JTextPane" icon="/com/intellij/uiDesigner/icons/textPane.png" removable="false" auto-create-binding="true" can-attach-label="true">
		        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
		          <preferred-size width="150" height="50" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JEditorPane" icon="/com/intellij/uiDesigner/icons/editorPane.png" removable="false" auto-create-binding="true" can-attach-label="true">
		        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
		          <preferred-size width="150" height="50" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JComboBox" icon="/com/intellij/uiDesigner/icons/comboBox.png" removable="false" auto-create-binding="true" can-attach-label="true">
		        <default-constraints vsize-policy="0" hsize-policy="2" anchor="8" fill="1" />
		      </item>
		      <item class="javax.swing.JTable" icon="/com/intellij/uiDesigner/icons/table.png" removable="false" auto-create-binding="true" can-attach-label="false">
		        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
		          <preferred-size width="150" height="50" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JList" icon="/com/intellij/uiDesigner/icons/list.png" removable="false" auto-create-binding="true" can-attach-label="false">
		        <default-constraints vsize-policy="6" hsize-policy="2" anchor="0" fill="3">
		          <preferred-size width="150" height="50" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JTree" icon="/com/intellij/uiDesigner/icons/tree.png" removable="false" auto-create-binding="true" can-attach-label="false">
		        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
		          <preferred-size width="150" height="50" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JTabbedPane" icon="/com/intellij/uiDesigner/icons/tabbedPane.png" removable="false" auto-create-binding="true" can-attach-label="false">
		        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">
		          <preferred-size width="200" height="200" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JSplitPane" icon="/com/intellij/uiDesigner/icons/splitPane.png" removable="false" auto-create-binding="false" can-attach-label="false">
		        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">
		          <preferred-size width="200" height="200" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JSpinner" icon="/com/intellij/uiDesigner/icons/spinner.png" removable="false" auto-create-binding="true" can-attach-label="true">
		        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />
		      </item>
		      <item class="javax.swing.JSlider" icon="/com/intellij/uiDesigner/icons/slider.png" removable="false" auto-create-binding="true" can-attach-label="false">
		        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />
		      </item>
		      <item class="javax.swing.JSeparator" icon="/com/intellij/uiDesigner/icons/separator.png" removable="false" auto-create-binding="false" can-attach-label="false">
		        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3" />
		      </item>
		      <item class="javax.swing.JProgressBar" icon="/com/intellij/uiDesigner/icons/progressbar.png" removable="false" auto-create-binding="true" can-attach-label="false">
		        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1" />
		      </item>
		      <item class="javax.swing.JToolBar" icon="/com/intellij/uiDesigner/icons/toolbar.png" removable="false" auto-create-binding="false" can-attach-label="false">
		        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1">
		          <preferred-size width="-1" height="20" />
		        </default-constraints>
		      </item>
		      <item class="javax.swing.JToolBar$Separator" icon="/com/intellij/uiDesigner/icons/toolbarSeparator.png" removable="false" auto-create-binding="false" can-attach-label="false">
		        <default-constraints vsize-policy="0" hsize-policy="0" anchor="0" fill="1" />
		      </item>
		      <item class="javax.swing.JScrollBar" icon="/com/intellij/uiDesigner/icons/scrollbar.png" removable="false" auto-create-binding="true" can-attach-label="false">
		        <default-constraints vsize-policy="6" hsize-policy="0" anchor="0" fill="2" />
		      </item>
		    </group>
		  </component>
		</project>
	'''

	//======================================================
	//======================================================
	def generateIdeaProjectModules(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project version="4">
		  <component name="ProjectModuleManager">
		    <modules>
		      <module fileurl="file://$PROJECT_DIR$/«cls.name».iml" filepath="$PROJECT_DIR$/«cls.name».iml" />
		    </modules>
		  </component>
		</project>
	'''

	//======================================================
	//======================================================
	def generateIdeaProjectMisc(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project version="4">
		  <component name="EntryPointsManager">
		    <entry_points version="2.0" />
		  </component>
		  <component name="ProjectRootManager" version="2" languageLevel="JDK_1_6" assert-keyword="true" jdk-15="true" project-jdk-name="1.6" project-jdk-type="JavaSDK">
		    <output url="file://$PROJECT_DIR$/bin" />
		  </component>
		</project>
	'''

	//======================================================
	//======================================================
	def generateIdeaProjectEncoding(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project version="4">
		  <component name="Encoding" useUTFGuessing="true" native2AsciiForPropertiesFiles="false" />
		</project>
	'''

	//======================================================
	//======================================================
	def generateIdeaProjectCompiler(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project version="4">
		  <component name="CompilerConfiguration">
		    <option name="DEFAULT_COMPILER" value="Javac" />
		    <resourceExtensions />
		    <wildcardResourcePatterns>
		      <entry name="?*.properties" />
		      <entry name="?*.xml" />
		      <entry name="?*.gif" />
		      <entry name="?*.png" />
		      <entry name="?*.jpeg" />
		      <entry name="?*.jpg" />
		      <entry name="?*.html" />
		      <entry name="?*.dtd" />
		      <entry name="?*.tld" />
		      <entry name="?*.ftl" />
		    </wildcardResourcePatterns>
		    <annotationProcessing enabled="false" useClasspath="true" />
		  </component>
		</project>
	'''

	//======================================================
	//======================================================
	def generateIdeaProjectAnt(PogoDeviceClass cls) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project version="4">
		  <component name="AntConfiguration">
		    <defaultAnt bundledAnt="true" />
		  </component>
		</project>
	'''

	//======================================================
	//======================================================
	def generateIdeaProjectProfile(PogoDeviceClass cls) '''
		<component name="CopyrightManager">
		  <settings default="">
		    <module2copyright />
		  </settings>
		</component>
	'''

	//======================================================
	//======================================================
	def generateIdeaProjectScope(PogoDeviceClass cls) '''
		<component name="DependencyValidationManager">
		  <state>
		    <option name="SKIP_IMPORT_STATEMENTS" value="false" />
		  </state>
		</component>
	'''


}