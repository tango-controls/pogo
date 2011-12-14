package fr.esrf.tango.pogo.generator.graphviz

import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import fr.esrf.tango.pogo.pogoDsl.PogoSystem
import fr.esrf.tango.pogo.pogoDsl.Property

class GraphvizDiagram implements IGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoSystem))) {
			fsa.generateFile(cls.filename, cls.generate_dotFile)
		}
	}
	
	
	def filename (PogoSystem sys) {
		"dot/"+sys.eResource.URI.lastSegment.replace(".xmi", ".dot")
	}
	
	def generate_dotFile (PogoSystem sys) '''
		«generate_graphPropertiesStart»
		«FOR cls: sys.classes»
			«cls.generate_deviceClass»
		«ENDFOR»
		«generate_graphPropertiesEnd»
	'''
	
	def generate_graphPropertiesStart () '''
		digraph G {             
			fontsize = 10        
			node [                          
				fontsize = 10                
				fontname="arial"
				shape=plaintext
			     ]        
			     
			edge [                            
				fontsize = 10        
			     ]        	
	'''
	
	def generate_graphPropertiesEnd () '''
		}
	'''
	def generate_deviceClass (PogoDeviceClass cls) '''
		«cls.name» [label=<<table border="0" cellborder="1" cellspacing="0" cellpadding="0" port="p" bgcolor="#d0d0d0">
		<tr><td>
		<table border="0" cellspacing="1" cellpadding="1">
			<tr><td> &laquo; PogoDeviceClass&raquo; </td></tr>
			<tr><td><font face="arialbd"  point-size="12.0"> «cls.name» </font></td></tr>
		</table></td></tr>
		«IF !cls.deviceProperties.empty»
			<tr><td align="center">Device Properties</td></tr>
			<tr><td>
				
				<table border="0" cellspacing="0" cellpadding="1">	
				«FOR p: cls.deviceProperties»
					«p.generate_property»
				«ENDFOR»
				</table>		
			</td></tr>
		«ENDIF»
		</table>>, fontname="arial", fontcolor="black", fontsize=9.0];	
	'''

	def generate_property (Property prop) '''
		<tr><td align="left"> + «prop.name» : «prop.type.eClass.name» </td></tr>
	'''	
}