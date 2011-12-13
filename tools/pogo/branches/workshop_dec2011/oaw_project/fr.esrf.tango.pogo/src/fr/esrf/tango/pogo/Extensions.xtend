package fr.esrf.tango.pogo

import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider

class Extensions {
	@Inject
	extension IQualifiedNameProvider qfnProvider
	
	def loc (EObject obj) {
		if (obj.eContainer != null)
			obj.info + "owned by " + obj.eContainer.info
		else
			obj.info
	}
	
	def String info (EObject obj) {
		val name = obj.fullyQualifiedName
		val dynamicName = if (name != null) name.toString else "<unnamed>"
		return dynamicName + " [" + obj.eClass.name + "]"
	}
}