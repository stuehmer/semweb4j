/**
 * generated by http://RDFReactor.semweb4j.org ($Id: CodeGenerator.java 870
 * 2007-11-07 17:30:59Z max.at.xam.de $) on 26.01.08 02:10
 */
package org.ontoware.rdfreactor.schema.bootstrap;

import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdf2go.vocabulary.RDF;
import org.ontoware.rdfreactor.runtime.Base;
import org.ontoware.rdfreactor.runtime.ReactorResult;


/**
 * This class manages access to these properties:
 * <ul>
 * <li>OneOf</li>
 * <li>SubClassOf</li>
 * </ul>
 * 
 * This class was generated by <a
 * href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 26.01.08 02:10
 */
public class OwlClass extends Resource {
    
    /** http://www.w3.org/2000/01/rdf-schema#Class */
    public static final URI RDFS_CLASS = new URIImpl("http://www.w3.org/2000/01/rdf-schema#Class",
            false);
    
    /** http://www.w3.org/2002/07/owl#oneOf */
    public static final URI ONEOF = new URIImpl("http://www.w3.org/2002/07/owl#oneOf", false);
    
    /** http://www.w3.org/2000/01/rdf-schema#subClassOf */
    public static final URI SUBCLASSOF = new URIImpl(
            "http://www.w3.org/2000/01/rdf-schema#subClassOf", false);
    
    /** all property-URIs with this class as domain */
    public static final URI[] MANAGED_URIS = {
            new URIImpl("http://www.w3.org/2002/07/owl#oneOf", false),
            new URIImpl("http://www.w3.org/2000/01/rdf-schema#subClassOf", false) };
    
    // protected constructors needed for inheritance
    
    /**
     * Returns a Java wrapper over an RDF object, identified by URI. Creating
     * two wrappers for the same instanceURI is legal.
     * 
     * @param model RDF2GO Model implementation, see http://rdf2go.semweb4j.org
     * @param classURI URI of RDFS class
     * @param instanceIdentifier Resource that identifies this instance
     * @param write if true, the statement (this, rdf:type, TYPE) is written to
     *            the model
     * 
     *            [Generated from RDFReactor template rule #c1]
     */
    protected OwlClass(Model model, URI classURI,
            org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
        super(model, classURI, instanceIdentifier, write);
    }
    
    // public constructors
    
    /**
     * Returns a Java wrapper over an RDF object, identified by URI. Creating
     * two wrappers for the same instanceURI is legal.
     * 
     * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
     * @param instanceIdentifier an RDF2Go Resource identifying this instance
     * @param write if true, the statement (this, rdf:type, TYPE) is written to
     *            the model
     * 
     *            [Generated from RDFReactor template rule #c2]
     */
    public OwlClass(Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier,
            boolean write) {
        super(model, RDFS_CLASS, instanceIdentifier, write);
    }
    
    /**
     * Returns a Java wrapper over an RDF object, identified by a URI, given as
     * a String. Creating two wrappers for the same URI is legal.
     * 
     * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
     * @param uriString a URI given as a String
     * @param write if true, the statement (this, rdf:type, TYPE) is written to
     *            the model
     * @throws ModelRuntimeException if URI syntax is wrong
     * 
     *             [Generated from RDFReactor template rule #c7]
     */
    public OwlClass(Model model, String uriString, boolean write) throws ModelRuntimeException {
        super(model, RDFS_CLASS, new URIImpl(uriString, false), write);
    }
    
    /**
     * Returns a Java wrapper over an RDF object, identified by a blank node.
     * Creating two wrappers for the same blank node is legal.
     * 
     * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
     * @param bnode BlankNode of this instance
     * @param write if true, the statement (this, rdf:type, TYPE) is written to
     *            the model
     * 
     *            [Generated from RDFReactor template rule #c8]
     */
    public OwlClass(Model model, BlankNode bnode, boolean write) {
        super(model, RDFS_CLASS, bnode, write);
    }
    
    /**
     * Returns a Java wrapper over an RDF object, identified by a randomly
     * generated URI. Creating two wrappers results in different URIs.
     * 
     * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
     * @param write if true, the statement (this, rdf:type, TYPE) is written to
     *            the model
     * 
     *            [Generated from RDFReactor template rule #c9]
     */
    public OwlClass(Model model, boolean write) {
        super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
    }
    
    // /////////////////////////////////////////////////////////////////
    // typing
    
    /**
     * Create a new instance of this class in the model. That is, create the
     * statement (instanceResource, RDF.type,
     * http://www.w3.org/2000/01/rdf-schema#Class).
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * 
     *            [Generated from RDFReactor template rule #1]
     */
    public static void createInstance(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource) {
        Base.createInstance(model, RDFS_CLASS, instanceResource);
    }
    
    /**
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return true if instanceResource is an instance of this class in the
     *         model
     * 
     *         [Generated from RDFReactor template rule #2]
     */
    public static boolean hasInstance(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource) {
        return Base.hasInstance(model, RDFS_CLASS, instanceResource);
    }
    
    /**
     * @param model an RDF2Go model
     * @return all instances of this class in Model 'model' as RDF resources
     * 
     *         [Generated from RDFReactor template rule #3]
     */
    public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllInstancesAsRdf2GoResources(
            Model model) {
        return Base.getAllInstances(model, RDFS_CLASS,
                org.ontoware.rdf2go.model.node.Resource.class);
    }
    
    /**
     * @param model an RDF2Go model
     * @return all instances of this class in Model 'model' as a ReactorResult,
     *         which can convenicently be converted to iterator, list or array.
     * 
     *         [Generated from RDFReactor template rule #3-as]
     */
    public static ReactorResult<? extends OwlClass> getAllInstance_as(Model model) {
        return Base.getAll_as(model, RDFS_CLASS, RDF.type, OwlClass.class);
    }
    
    /**
     * @param model an RDF2Go model
     * @return all instances of this class in Model 'model' as RDF resources
     * 
     *         [Generated from RDFReactor template rule #3-list]
     */
    public static java.util.List<? extends OwlClass> getAllInstances_asList(Model model) {
        return Base.getAllInstances_asList(model, RDFS_CLASS, OwlClass.class);
    }
    
    /**
     * @param model an RDF2Go model
     * @return all instances of this class in Model 'model' as RDF resources
     * 
     *         [Generated from RDFReactor template rule #3-array]
     */
    public static OwlClass[] getAllInstances_asArray(Model model) {
        return Base.getAllInstances_asArray(model, RDFS_CLASS, OwlClass.class);
    }
    
    /**
     * Delete all rdf:type from this instance. Other triples are not affected.
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * 
     *            [Generated from RDFReactor template rule #4]
     */
    public static void deleteInstance(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource) {
        Base.deleteInstance(model, RDFS_CLASS, instanceResource);
    }
    
    // /////////////////////////////////////////////////////////////////
    // property access methods
    
    /**
     * @param model an RDF2Go model
     * @param objectValue
     * @return all A's as RDF resources, that have a relation 'Type' to this
     *         Class instance
     * 
     *         [Generated from RDFReactor template rule #getallinverse1static]
     */
    public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllType_Inverse(
            Model model, Object objectValue) {
        return Base.getAll_Inverse(model, Resource.TYPE, objectValue);
    }
    
    /**
     * @param model an RDF2Go model
     * @param objectValue
     * @return all A's as RDF resources, that have a relation 'Domain' to this
     *         Class instance
     * 
     *         [Generated from RDFReactor template rule #getallinverse1static]
     */
    public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllDomain_Inverse(
            Model model, Object objectValue) {
        return Base.getAll_Inverse(model, Property.DOMAIN, objectValue);
    }
    
    /**
     * @param model an RDF2Go model
     * @param objectValue
     * @return all A's as RDF resources, that have a relation 'Range' to this
     *         Class instance
     * 
     *         [Generated from RDFReactor template rule #getallinverse1static]
     */
    public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllRange_Inverse(
            Model model, Object objectValue) {
        return Base.getAll_Inverse(model, Property.RANGE, objectValue);
    }
    
    /**
     * @param model an RDF2Go model
     * @param objectValue
     * @return all A's as RDF resources, that have a relation 'SubClassOf' to
     *         this Class instance
     * 
     *         [Generated from RDFReactor template rule #getallinverse1static]
     */
    public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllSubClassOf_Inverse(
            Model model, Object objectValue) {
        return Base.getAll_Inverse(model, OwlClass.SUBCLASSOF, objectValue);
    }
    
    /**
     * @param model an RDF2Go model
     * @param objectValue
     * @return all A's as RDF resources, that have a relation 'AllValuesFrom' to
     *         this Class instance
     * 
     *         [Generated from RDFReactor template rule #getallinverse1static]
     */
    public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllAllValuesFrom_Inverse(
            Model model, Object objectValue) {
        return Base.getAll_Inverse(model, OWL_Protege_NRL_Restriction.ALLVALUESFROM, objectValue);
    }
    
    /**
     * @param model an RDF2Go model
     * @param objectValue
     * @return all A's as RDF resources, that have a relation 'SomeValuesFrom'
     *         to this Class instance
     * 
     *         [Generated from RDFReactor template rule #getallinverse1static]
     */
    public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllSomeValuesFrom_Inverse(
            Model model, Object objectValue) {
        return Base.getAll_Inverse(model, OWL_Protege_NRL_Restriction.SOMEVALUESFROM, objectValue);
    }
    
    /**
     * Get all values of property OneOf as an Iterator over RDF2Go nodes
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
     * 
     *         [Generated from RDFReactor template rule #get7static]
     */
    public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllOneOf_asNode(
            Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
        return Base.getAll_asNode(model, instanceResource, ONEOF);
    }
    
    /**
     * Get all values of property OneOf as a List of RDF2Go nodes
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return a List of RDF2Go Nodes
     * 
     *         [Generated from RDFReactor template rule #get7static-list]
     */
    public static java.util.List<org.ontoware.rdf2go.model.node.Node> getAllOneOf_asNodeList(
            Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
        return Base.getAll_asNodeList(model, instanceResource, ONEOF);
    }
    
    /**
     * Get all values of property OneOf as an Iterator over RDF2Go nodes
     * 
     * @return a ClosableIterator of RDF2Go Nodes
     * 
     *         [Generated from RDFReactor template rule #get8dynamic]
     */
    public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllOneOf_asNode() {
        return Base.getAll_asNode(this.model, this.getResource(), ONEOF);
    }
    
    /**
     * Get all values of property OneOf as a List of RDF2Go nodes
     * 
     * @return a List of RDF2Go Nodes
     * 
     *         [Generated from RDFReactor template rule #get8dynamic-list]
     */
    public java.util.List<org.ontoware.rdf2go.model.node.Node> getAllOneOf_asNodeList() {
        return Base.getAll_asNodeList(this.model, this.getResource(), ONEOF);
    }
    
    /**
     * Adds a value to property OneOf as an RDF2Go node
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @param value the value to be added
     * 
     *            [Generated from RDFReactor template rule #add1static]
     */
    public static void addOneOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource,
            org.ontoware.rdf2go.model.node.Node value) {
        Base.add(model, instanceResource, ONEOF, value);
    }
    
    /**
     * Adds a value to property OneOf as an RDF2Go node
     * 
     * @param value the value to be added
     * 
     *            [Generated from RDFReactor template rule #add1dynamic]
     */
    public void addOneOf(org.ontoware.rdf2go.model.node.Node value) {
        Base.add(this.model, this.getResource(), ONEOF, value);
    }
    
    /**
     * Sets a value of property OneOf from an RDF2Go node. First, all existing
     * values are removed, then this value is added. Cardinality constraints are
     * not checked, but this method exists only for properties with no
     * minCardinality or minCardinality == 1.
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @param value the value to be set
     * 
     *            [Generated from RDFReactor template rule #set1static]
     */
    public static void setOneOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource,
            org.ontoware.rdf2go.model.node.Node value) {
        Base.set(model, instanceResource, ONEOF, value);
    }
    
    /**
     * Sets a value of property OneOf from an RDF2Go node. First, all existing
     * values are removed, then this value is added. Cardinality constraints are
     * not checked, but this method exists only for properties with no
     * minCardinality or minCardinality == 1.
     * 
     * @param value the value to be added
     * 
     *            [Generated from RDFReactor template rule #set1dynamic]
     */
    public void setOneOf(org.ontoware.rdf2go.model.node.Node value) {
        Base.set(this.model, this.getResource(), ONEOF, value);
    }
    
    /**
     * Removes a value of property OneOf as an RDF2Go node
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @param value the value to be removed
     * 
     *            [Generated from RDFReactor template rule #remove1static]
     */
    public static void removeOneOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource,
            org.ontoware.rdf2go.model.node.Node value) {
        Base.remove(model, instanceResource, ONEOF, value);
    }
    
    /**
     * Removes a value of property OneOf as an RDF2Go node
     * 
     * @param value the value to be removed
     * 
     *            [Generated from RDFReactor template rule #remove1dynamic]
     */
    public void removeOneOf(org.ontoware.rdf2go.model.node.Node value) {
        Base.remove(this.model, this.getResource(), ONEOF, value);
    }
    
    /**
     * Removes all values of property OneOf * @param model an RDF2Go model
     * 
     * @param instanceResource an RDF2Go resource
     * 
     *            [Generated from RDFReactor template rule #removeall1static]
     */
    public static void removeAllOneOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource) {
        Base.removeAll(model, instanceResource, ONEOF);
    }
    
    /**
     * Removes all values of property OneOf * [Generated from RDFReactor
     * template rule #removeall1dynamic]
     */
    public void addOneOf() {
        Base.removeAll(this.model, this.getResource(), ONEOF);
    }
    
    /**
     * Get all values of property SubClassOf as an Iterator over RDF2Go nodes
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
     * 
     *         [Generated from RDFReactor template rule #get7static]
     */
    public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllSubClassOf_asNode(
            Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
        return Base.getAll_asNode(model, instanceResource, SUBCLASSOF);
    }
    
    /**
     * Get all values of property SubClassOf as a List of RDF2Go nodes
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return a List of RDF2Go Nodes
     * 
     *         [Generated from RDFReactor template rule #get7static-list]
     */
    public static java.util.List<org.ontoware.rdf2go.model.node.Node> getAllSubClassOf_asNodeList(
            Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
        return Base.getAll_asNodeList(model, instanceResource, SUBCLASSOF);
    }
    
    /**
     * Get all values of property SubClassOf as an Iterator over RDF2Go nodes
     * 
     * @return a ClosableIterator of RDF2Go Nodes
     * 
     *         [Generated from RDFReactor template rule #get8dynamic]
     */
    public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllSubClassOf_asNode() {
        return Base.getAll_asNode(this.model, this.getResource(), SUBCLASSOF);
    }
    
    /**
     * Get all values of property SubClassOf as a List of RDF2Go nodes
     * 
     * @return a List of RDF2Go Nodes
     * 
     *         [Generated from RDFReactor template rule #get8dynamic-list]
     */
    public java.util.List<org.ontoware.rdf2go.model.node.Node> getAllSubClassOf_asNodeList() {
        return Base.getAll_asNodeList(this.model, this.getResource(), SUBCLASSOF);
    }
    
    /**
     * Get all values of property SubClassOf * @param model an RDF2Go model
     * 
     * @param instanceResource an RDF2Go resource
     * @return a ClosableIterator of $type
     * 
     *         [Generated from RDFReactor template rule #get11static]
     */
    public static ClosableIterator<OwlClass> getAllSubClassOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource) {
        return Base.getAll(model, instanceResource, SUBCLASSOF, OwlClass.class);
    }
    
    /**
     * Get all values of property SubClassOf as a List of Class
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return a ClosableIterator of $type
     * 
     *         [Generated from RDFReactor template rule #get11static-list]
     */
    public static java.util.List<OwlClass> getAllSubClassOf_asList(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource) {
        return Base.getAll_asList(model, instanceResource, SUBCLASSOF, OwlClass.class);
    }
    
    /**
     * Get all values of property SubClassOf * @return a ClosableIterator of
     * $type
     * 
     * [Generated from RDFReactor template rule #get12dynamic]
     */
    public ClosableIterator<OwlClass> getAllSubClassOf() {
        return Base.getAll(this.model, this.getResource(), SUBCLASSOF, OwlClass.class);
    }
    
    /**
     * Get all values of property SubClassOf as a List of Class
     * 
     * @return a List of $type
     * 
     *         [Generated from RDFReactor template rule #get12dynamic-list]
     */
    public java.util.List<OwlClass> getAllSubClassOf_asList() {
        return Base.getAll_asList(this.model, this.getResource(), SUBCLASSOF, OwlClass.class);
    }
    
    /**
     * Adds a value to property SubClassOf as an RDF2Go node
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @param value the value to be added
     * 
     *            [Generated from RDFReactor template rule #add1static]
     */
    public static void addSubClassOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource,
            org.ontoware.rdf2go.model.node.Node value) {
        Base.add(model, instanceResource, SUBCLASSOF, value);
    }
    
    /**
     * Adds a value to property SubClassOf as an RDF2Go node
     * 
     * @param value the value to be added
     * 
     *            [Generated from RDFReactor template rule #add1dynamic]
     */
    public void addSubClassOf(org.ontoware.rdf2go.model.node.Node value) {
        Base.add(this.model, this.getResource(), SUBCLASSOF, value);
    }
    
    /**
     * Adds a value to property SubClassOf from an instance of Class
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * 
     *            [Generated from RDFReactor template rule #add3static]
     */
    public static void addSubClassOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource, OwlClass value) {
        Base.add(model, instanceResource, SUBCLASSOF, value);
    }
    
    /**
     * Adds a value to property SubClassOf from an instance of Class
     * 
     * [Generated from RDFReactor template rule #add4dynamic]
     */
    public void addSubClassOf(OwlClass value) {
        Base.add(this.model, this.getResource(), SUBCLASSOF, value);
    }
    
    /**
     * Sets a value of property SubClassOf from an RDF2Go node. First, all
     * existing values are removed, then this value is added. Cardinality
     * constraints are not checked, but this method exists only for properties
     * with no minCardinality or minCardinality == 1.
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @param value the value to be set
     * 
     *            [Generated from RDFReactor template rule #set1static]
     */
    public static void setSubClassOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource,
            org.ontoware.rdf2go.model.node.Node value) {
        Base.set(model, instanceResource, SUBCLASSOF, value);
    }
    
    /**
     * Sets a value of property SubClassOf from an RDF2Go node. First, all
     * existing values are removed, then this value is added. Cardinality
     * constraints are not checked, but this method exists only for properties
     * with no minCardinality or minCardinality == 1.
     * 
     * @param value the value to be added
     * 
     *            [Generated from RDFReactor template rule #set1dynamic]
     */
    public void setSubClassOf(org.ontoware.rdf2go.model.node.Node value) {
        Base.set(this.model, this.getResource(), SUBCLASSOF, value);
    }
    
    /**
     * Sets a value of property SubClassOf from an instance of Class First, all
     * existing values are removed, then this value is added. Cardinality
     * constraints are not checked, but this method exists only for properties
     * with no minCardinality or minCardinality == 1.
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @param value the value to be added
     * 
     *            [Generated from RDFReactor template rule #set3static]
     */
    public static void setSubClassOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource, OwlClass value) {
        Base.set(model, instanceResource, SUBCLASSOF, value);
    }
    
    /**
     * Sets a value of property SubClassOf from an instance of Class First, all
     * existing values are removed, then this value is added. Cardinality
     * constraints are not checked, but this method exists only for properties
     * with no minCardinality or minCardinality == 1.
     * 
     * @param value the value to be added
     * 
     *            [Generated from RDFReactor template rule #set4dynamic]
     */
    public void setSubClassOf(OwlClass value) {
        Base.set(this.model, this.getResource(), SUBCLASSOF, value);
    }
    
    /**
     * Removes a value of property SubClassOf as an RDF2Go node
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @param value the value to be removed
     * 
     *            [Generated from RDFReactor template rule #remove1static]
     */
    public static void removeSubClassOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource,
            org.ontoware.rdf2go.model.node.Node value) {
        Base.remove(model, instanceResource, SUBCLASSOF, value);
    }
    
    /**
     * Removes a value of property SubClassOf as an RDF2Go node
     * 
     * @param value the value to be removed
     * 
     *            [Generated from RDFReactor template rule #remove1dynamic]
     */
    public void removeSubClassOf(org.ontoware.rdf2go.model.node.Node value) {
        Base.remove(this.model, this.getResource(), SUBCLASSOF, value);
    }
    
    /**
     * Removes a value of property SubClassOf given as an instance of Class
     * 
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @param value the value to be removed
     * 
     *            [Generated from RDFReactor template rule #remove3static]
     */
    public static void removeSubClassOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource, OwlClass value) {
        Base.remove(model, instanceResource, SUBCLASSOF, value);
    }
    
    /**
     * Removes a value of property SubClassOf given as an instance of Class
     * 
     * @param value the value to be removed
     * 
     *            [Generated from RDFReactor template rule #remove4dynamic]
     */
    public void removeSubClassOf(OwlClass value) {
        Base.remove(this.model, this.getResource(), SUBCLASSOF, value);
    }
    
    /**
     * Removes all values of property SubClassOf * @param model an RDF2Go model
     * 
     * @param instanceResource an RDF2Go resource
     * 
     *            [Generated from RDFReactor template rule #removeall1static]
     */
    public static void removeAllSubClassOf(Model model,
            org.ontoware.rdf2go.model.node.Resource instanceResource) {
        Base.removeAll(model, instanceResource, SUBCLASSOF);
    }
    
    /**
     * Removes all values of property SubClassOf * [Generated from RDFReactor
     * template rule #removeall1dynamic]
     */
    public void addSubClassOf() {
        Base.removeAll(this.model, this.getResource(), SUBCLASSOF);
    }
    
}
