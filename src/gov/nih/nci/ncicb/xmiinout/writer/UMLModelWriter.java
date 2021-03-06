/*L
 *  Copyright Ekagra Software Technologies Ltd.
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/xmihandler/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.xmiinout.writer;

import gov.nih.nci.ncicb.xmiinout.domain.*;

public interface UMLModelWriter {

  public UMLTaggedValue writeTaggedValue(UMLModel model, UMLTaggedValue taggedValue);

  public void removeTaggedValue(UMLModel model, UMLTaggedValue taggedValue);

  public UMLDependency writeDependency(UMLModel model, UMLDependency dependency);
}
