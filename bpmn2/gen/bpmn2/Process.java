/**
 */
package bpmn2;

import de.upb.tools.sdm.*;
import java.util.*;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see bpmn2.Bpmn2Package#getProcess()
 * @model
 * @generated
 */
public interface Process extends CallableElement, FlowElementsContainer {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Iterator fujaba__IterThisToOutFlow = null;\n      Object _TmpObject = null;\n      SequenceFlow outFlow = null;\n      Iterator fujaba__IterThisToNextNode = null;\n      FlowNode nextNode = null;\n      Iterator fujaba__IterThisToInFlow = null;\n      SequenceFlow inFlow = null;\n\n      // story node \'removeNodeFromProcess\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object node is really bound\n         JavaSDM.ensure ( node != null );\n         // check link flowElements from node to this\n         JavaSDM.ensure (this.equals (node.eContainer()\n         ));\n\n         // iterate to-many link flowElements from this to inFlow\n         fujaba__Success = false;\n\n         fujaba__IterThisToInFlow = this.getFlowElements().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterThisToInFlow.hasNext () )\n         {\n            try\n            {\n               _TmpObject =  fujaba__IterThisToInFlow.next ();\n\n               // ensure correct type and really bound of object inFlow\n               JavaSDM.ensure ( _TmpObject instanceof SequenceFlow );\n               inFlow = (SequenceFlow) _TmpObject;\n               // check link incoming from inFlow to node\n               JavaSDM.ensure (node.equals (inFlow.getTargetRef ()\n               ));\n\n               // iterate to-many link flowElements from this to nextNode\n               fujaba__Success = false;\n\n               fujaba__IterThisToNextNode = this.getFlowElements().iterator ();\n\n               while ( !(fujaba__Success) && fujaba__IterThisToNextNode.hasNext () )\n               {\n                  try\n                  {\n                     _TmpObject =  fujaba__IterThisToNextNode.next ();\n\n                     // ensure correct type and really bound of object nextNode\n                     JavaSDM.ensure ( _TmpObject instanceof FlowNode );\n                     nextNode = (FlowNode) _TmpObject;\n                     // check isomorphic binding between objects node and nextNode \n                     JavaSDM.ensure ( !node.equals (nextNode) );\n\n                     // iterate to-many link flowElements from this to outFlow\n                     fujaba__Success = false;\n\n                     fujaba__IterThisToOutFlow = this.getFlowElements().iterator ();\n\n                     while ( !(fujaba__Success) && fujaba__IterThisToOutFlow.hasNext () )\n                     {\n                        try\n                        {\n                           _TmpObject =  fujaba__IterThisToOutFlow.next ();\n\n                           // ensure correct type and really bound of object outFlow\n                           JavaSDM.ensure ( _TmpObject instanceof SequenceFlow );\n                           outFlow = (SequenceFlow) _TmpObject;\n                           // check isomorphic binding between objects outFlow and inFlow \n                           JavaSDM.ensure ( !outFlow.equals (inFlow) );\n\n                           // check link incoming from outFlow to nextNode\n                           JavaSDM.ensure (nextNode.equals (outFlow.getTargetRef ()\n                           ));\n\n                           // check link outgoing from outFlow to node\n                           JavaSDM.ensure (node.equals (outFlow.getSourceRef ()\n                           ));\n\n\n                           fujaba__Success = true;\n                        }\n                        catch ( JavaSDMException fujaba__InternalException )\n                        {\n                           fujaba__Success = false;\n                        }\n                     }\n                     JavaSDM.ensure (fujaba__Success);\n\n                     fujaba__Success = true;\n                  }\n                  catch ( JavaSDMException fujaba__InternalException )\n                  {\n                     fujaba__Success = false;\n                  }\n               }\n               JavaSDM.ensure (fujaba__Success);\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // destroy link\n         \t\t\tthis.getFlowElements().remove(node); // delete link\n\t\n         // destroy link\n         \t\t\tthis.getFlowElements().remove(outFlow); // delete link\n\t\n         // destroy link\n         inFlow.setTargetRef(null);\n         // destroy link\n         outFlow.setSourceRef(null);\n         // destroy link\n         nextNode.getIncoming().remove(outFlow);\n         // delete object node\n          org.moflon.util.eMoflonEMFUtil.remove(node);\n         // delete object outFlow\n          org.moflon.util.eMoflonEMFUtil.remove(outFlow);\n\n         // create link\n         nextNode.getIncoming().add(inFlow);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      if (fujaba__Success)\n      {\n         return nextNode;\n\n      }\n      else\n      {\n         throw new IllegalStateException();\n\n      }'"
	 * @generated
	 */
	FlowNode removeNode(FlowNode node); // <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Process
