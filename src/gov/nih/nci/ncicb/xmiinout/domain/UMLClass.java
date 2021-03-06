/*L
 *  Copyright Ekagra Software Technologies Ltd.
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/xmihandler/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.xmiinout.domain;

import java.util.*;

/**
 * UMLClass represents a Class in a UML Model
 */
public interface UMLClass extends UMLTaggableElement, UMLDependencyEnd, UMLAssociable, UMLGeneralizable, UMLDatatype {

  /**
   * @return the class name
   */
  public String getName();

  /**
   * @return the isAbstract modifier
   */
  public UMLAbstractModifier getAbstractModifier();
  
  /**
   * @return the visibility (scope)
   */
  public UMLVisibility getVisibility();

  /**
   * @return the UMLPackage to which this class belongs
   */
  public UMLPackage getPackage();

  /**
   * @return a List of all the UML Attributes belonging to this class
   */
  public List<UMLAttribute> getAttributes();

  /**
   * @return UML Operation 
   */
  public UMLOperation getOperation(String name);


  /**
   * @return a List of all the UML Operations belonging to this class
   */
  public List<UMLOperation> getOperations();

  /**
   * Convenient method to retrieve one Attribute by it's name.
   *
   * @param name the name of the attribute to find
   * @return The Attribute with requested name or null if none exists
   */
  public UMLAttribute getAttribute(String name);


  /**
   * @return a Set of all associations where at least one end points to this class. 
   */
  public Set<UMLAssociation> getAssociations();
  
  /**
   * @return a List of all Generalizations where one end points to this class. 
   */
  public List<UMLGeneralization> getGeneralizations();

  /**
   * @return the class stereotype, or null if there isn't any
   */
  public String getStereotype();
}