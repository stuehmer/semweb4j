/**
 * generated by http://RDFReactor.semweb4j.org ($Id: CodeGenerator.java 1046 2008-01-26 14:38:26Z max.at.xam.de $) on 16.03.08 18:20
 */
package org.ontoware.semversion.impl.generated;

import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdfreactor.runtime.Base;
import org.ontoware.rdfreactor.runtime.ReactorResult;
import org.ontoware.rdfreactor.runtime.CardinalityException;

/**
 * This class manages access to these properties:
 * <ul>
 *   <li> Root </li>
 *   <li> Version </li>
 * </ul>
 *
 * This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 16.03.08 18:20
 */
public class VersionedModel extends VersionedItem {

    /** http://purl.org/net/semversion#VersionedModel */
	public static final URI RDFS_CLASS = new URIImpl("http://purl.org/net/semversion#VersionedModel", false);

    /** http://purl.org/net/semversion#hasRoot */
	public static final URI ROOT = new URIImpl("http://purl.org/net/semversion#hasRoot",false);

    /** http://purl.org/net/semversion#hasVersion */
	public static final URI VERSION = new URIImpl("http://purl.org/net/semversion#hasVersion",false);

    /** all property-URIs with this class as domain */
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://purl.org/net/semversion#hasRoot",false),
      new URIImpl("http://purl.org/net/semversion#hasVersion",false) 
    };


	// protected constructors needed for inheritance
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.semweb4j.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier Resource that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c1] 
	 */
	protected VersionedModel ( Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, classURI, instanceIdentifier, write);
	}

	// public constructors

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param instanceIdentifier an RDF2Go Resource identifying this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c2] 
	 */
	public VersionedModel ( Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}


	/**
	 * Returns a Java wrapper over an RDF object, identified by a URI, given as a String.
	 * Creating two wrappers for the same URI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uriString a URI given as a String
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 * @throws ModelRuntimeException if URI syntax is wrong
	 *
	 * [Generated from RDFReactor template rule #c7] 
	 */
	public VersionedModel ( Model model, String uriString, boolean write) throws ModelRuntimeException {
		super(model, RDFS_CLASS, new URIImpl(uriString,false), write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c8] 
	 */
	public VersionedModel ( Model model, BlankNode bnode, boolean write ) {
		super(model, RDFS_CLASS, bnode, write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by 
	 * a randomly generated URI.
	 * Creating two wrappers results in different URIs.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c9] 
	 */
	public VersionedModel ( Model model, boolean write ) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Create a new instance of this class in the model. 
	 * That is, create the statement (instanceResource, RDF.type, http://purl.org/net/semversion#VersionedModel).
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #class1] 
	 */
	public static void createInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.createInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return true if instanceResource is an instance of this class in the model
	 *
	 * [Generated from RDFReactor template rule #class2] 
	 */
	public static boolean hasInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.hasInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * @param model an RDF2Go model
	 * @return all instances of this class in Model 'model' as RDF resources
	 *
	 * [Generated from RDFReactor template rule #class3] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllInstances(Model model) {
		return Base.getAllInstances(model, RDFS_CLASS, org.ontoware.rdf2go.model.node.Resource.class);
	}

	/**
	 * @param model an RDF2Go model
	 * @return all instances of this class in Model 'model' as a ReactorResult,
	 * which can conveniently be converted to iterator, list or array.
	 *
	 * [Generated from RDFReactor template rule #class3-as] 
	 */
	public static ReactorResult<? extends VersionedModel> getAllInstance_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, VersionedModel.class );
	}

    /**
	 * Delete all rdf:type from this instance. Other triples are not affected.
	 * To delete more, use deleteAllProperties
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #class4] 
	 */
	public static void deleteInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.deleteInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * Delete all (this, *, *), i.e. including rdf:type
	 * @param model an RDF2Go model
	 * @param resource
	 */
	public static void deleteAllProperties(Model model,	org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.deleteAllProperties(model, instanceResource);
	}

    ///////////////////////////////////////////////////////////////////
    // property access methods

	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as RDF resources, that have a relation 'VersionedModel' to this VersionedModel instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1static] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllVersionedModel_Inverse( Model model, Object objectValue) {
		return Base.getAll_Inverse(model, Thing.VERSIONEDMODEL, objectValue);
	}


	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as RDF resources, that have a relation 'Container' to this VersionedModel instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1static] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllContainer_Inverse( Model model, Object objectValue) {
		return Base.getAll_Inverse(model, Version.CONTAINER, objectValue);
	}



    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@d12eea has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasRoot(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, ROOT);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@d12eea has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasRoot() {
		return Base.has(this.model, this.getResource(), ROOT);
	}

    /**
     * Get single value of property Root as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return the single value or null if no value is found
     * @throws RDFDataException at runtime, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get1static] 
     */
	public static org.ontoware.rdf2go.model.node.Node getRoot_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (org.ontoware.rdf2go.model.node.Node) Base.get_asNode(model, instanceResource, ROOT);
	}
	
    /**
     * Get single value of property Root as an RDF2Go node 
     * @return the single value or null if no value is found
     * @throws RDFDataException, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get2dynamic] 
     */
	public org.ontoware.rdf2go.model.node.Node getRoot_asNode() {
		return (org.ontoware.rdf2go.model.node.Node) Base.get_asNode(this.model, this.getResource(), ROOT);
	}
     /**
     * Get single value of property Root     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return the single value or null if no value is found
     * @throws RDFDataException, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get5static] 
     */
	public static Version getRoot(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (Version) Base.get(model, instanceResource, ROOT, Version.class);
	}
	
    /**
     * Get single value of property Root     * @return the single value or null if no value is found
     * @throws RDFDataException, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get6dynamic] 
     */
	public Version getRoot() {
		return (Version) Base.get(this.model, this.getResource(), ROOT, Version.class);
	}
  
    /**
     * Adds a value to property Root as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add5static] 
     */
	public static void addRoot( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) 
    throws CardinalityException {
		Base.add(model, instanceResource, ROOT, value, 1);
	}
	
    /**
     * Adds a value to property Root as an RDF2Go node 
	 * @param value the value to be added
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add6dynamic] 
     */
	public void addRoot( org.ontoware.rdf2go.model.node.Node value) 
    throws CardinalityException {
		Base.add(this.model, this.getResource(), ROOT, value, 1);
	}
    /**
     * Adds a value to property Root from an instance of Version 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add7static] 
     */
	public static void addRoot(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Version value)
    throws CardinalityException {
		Base.add(model, instanceResource, ROOT, value, 1);
	}
	
    /**
     * Adds a value to property Root from an instance of Version 
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add8dynamic] 
     */
	public void addRoot(Version value) 
    throws CardinalityException {
		Base.add(this.model, this.getResource(), ROOT, value, 1);
	}
 
 

    /**
     * Sets a value of property Root from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setRoot( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, ROOT, value);
	}
	
    /**
     * Sets a value of property Root from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setRoot( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), ROOT, value);
	}
    /**
     * Sets a value of property Root from an instance of Version 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setRoot(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Version value) {
		Base.set(model, instanceResource, ROOT, value);
	}
	
    /**
     * Sets a value of property Root from an instance of Version 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setRoot(Version value) {
		Base.set(this.model, this.getResource(), ROOT, value);
	}
  


    /**
     * Removes a value of property Root as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeRoot( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, ROOT, value);
	}
	
    /**
     * Removes a value of property Root as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeRoot( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), ROOT, value);
	}
    /**
     * Removes a value of property Root given as an instance of Version 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeRoot(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Version value) {
		Base.remove(model, instanceResource, ROOT, value);
	}
	
    /**
     * Removes a value of property Root given as an instance of Version 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeRoot(Version value) {
		Base.remove(this.model, this.getResource(), ROOT, value);
	}
  
    /**
     * Removes all values of property Root     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllRoot( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, ROOT);
	}
	
    /**
     * Removes all values of property Root	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void addRoot() {
		Base.removeAll(this.model, this.getResource(), ROOT);
	}
     /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@739f3f has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasVersion(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, VERSION);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@739f3f has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasVersion() {
		return Base.has(this.model, this.getResource(), VERSION);
	}

     /**
     * Get all values of property Version as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllVersion_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (ClosableIterator<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNode(model, instanceResource, VERSION);
	}
	
    /**
     * Get all values of property Version as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllVersion_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (ReactorResult<org.ontoware.rdf2go.model.node.Node>) Base.getAll_as(model, instanceResource, VERSION, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property Version as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllVersion_asNode() {
		return (ClosableIterator<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNode(this.model, this.getResource(), VERSION);
	}

    /**
     * Get all values of property Version as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllVersion_asNode_() {
		return (ReactorResult<org.ontoware.rdf2go.model.node.Node>) Base.getAll_as(this.model, this.getResource(), VERSION, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property Version     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<Version> getAllVersion(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, VERSION, Version.class);
	}
	
    /**
     * Get all values of property Version as a ReactorResult of Version 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<Version> getAllVersion_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, VERSION, Version.class);
	}

    /**
     * Get all values of property Version     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<Version> getAllVersion() {
		return Base.getAll(this.model, this.getResource(), VERSION, Version.class);
	}

    /**
     * Get all values of property Version as a ReactorResult of Version 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<Version> getAllVersion_as() {
		return Base.getAll_as(this.model, this.getResource(), VERSION, Version.class);
	}
 
    /**
     * Adds a value to property Version as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addVersion( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, VERSION, value);
	}
	
    /**
     * Adds a value to property Version as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addVersion( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), VERSION, value);
	}
    /**
     * Adds a value to property Version from an instance of Version 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addVersion(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Version value) {
		Base.add(model, instanceResource, VERSION, value);
	}
	
    /**
     * Adds a value to property Version from an instance of Version 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addVersion(Version value) {
		Base.add(this.model, this.getResource(), VERSION, value);
	}
  

    /**
     * Sets a value of property Version from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setVersion( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, VERSION, value);
	}
	
    /**
     * Sets a value of property Version from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setVersion( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), VERSION, value);
	}
    /**
     * Sets a value of property Version from an instance of Version 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setVersion(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Version value) {
		Base.set(model, instanceResource, VERSION, value);
	}
	
    /**
     * Sets a value of property Version from an instance of Version 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setVersion(Version value) {
		Base.set(this.model, this.getResource(), VERSION, value);
	}
  


    /**
     * Removes a value of property Version as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeVersion( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, VERSION, value);
	}
	
    /**
     * Removes a value of property Version as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeVersion( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), VERSION, value);
	}
    /**
     * Removes a value of property Version given as an instance of Version 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeVersion(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Version value) {
		Base.remove(model, instanceResource, VERSION, value);
	}
	
    /**
     * Removes a value of property Version given as an instance of Version 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeVersion(Version value) {
		Base.remove(this.model, this.getResource(), VERSION, value);
	}
  
    /**
     * Removes all values of property Version     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllVersion( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, VERSION);
	}
	
    /**
     * Removes all values of property Version	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void addVersion() {
		Base.removeAll(this.model, this.getResource(), VERSION);
	}
 }