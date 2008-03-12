/**
 * generated by http://RDFReactor.semweb4j.org ($Id: CodeGenerator.java 1046 2008-01-26 14:38:26Z max.at.xam.de $) on 12.03.08 12:36
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

/**
 * This class manages access to these properties:
 * <ul>
 *   <li> VersionedModel </li>
 * </ul>
 *
 * This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 12.03.08 12:36
 */
public class Thing extends org.ontoware.rdfreactor.schema.rdfs.Class {

    /** http://www.w3.org/2000/01/rdf-schema#Class */
	public static final URI RDFS_CLASS = new URIImpl("http://www.w3.org/2000/01/rdf-schema#Class", false);

    /** http://purl.org/net/semversion#hasVersionedModel */
	public static final URI VERSIONEDMODEL = new URIImpl("http://purl.org/net/semversion#hasVersionedModel",false);

    /** all property-URIs with this class as domain */
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://purl.org/net/semversion#hasVersionedModel",false) 
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
	protected Thing ( Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
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
	public Thing ( Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
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
	public Thing ( Model model, String uriString, boolean write) throws ModelRuntimeException {
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
	public Thing ( Model model, BlankNode bnode, boolean write ) {
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
	public Thing ( Model model, boolean write ) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Create a new instance of this class in the model. 
	 * That is, create the statement (instanceResource, RDF.type, http://www.w3.org/2000/01/rdf-schema#Class).
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
	public static ReactorResult<? extends Thing> getAllInstance_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, Thing.class );
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
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@5a3923 has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasVersionedModel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, VERSIONEDMODEL);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@5a3923 has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasVersionedModel() {
		return Base.has(this.model, this.getResource(), VERSIONEDMODEL);
	}

     /**
     * Get all values of property VersionedModel as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllVersionedModel_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (ClosableIterator<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNode(model, instanceResource, VERSIONEDMODEL);
	}
	
    /**
     * Get all values of property VersionedModel as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllVersionedModel_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (ReactorResult<org.ontoware.rdf2go.model.node.Node>) Base.getAll_as(model, instanceResource, VERSIONEDMODEL, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property VersionedModel as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllVersionedModel_asNode() {
		return (ClosableIterator<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNode(this.model, this.getResource(), VERSIONEDMODEL);
	}

    /**
     * Get all values of property VersionedModel as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllVersionedModel_asNode_() {
		return (ReactorResult<org.ontoware.rdf2go.model.node.Node>) Base.getAll_as(this.model, this.getResource(), VERSIONEDMODEL, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property VersionedModel     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<VersionedModel> getAllVersionedModel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, VERSIONEDMODEL, VersionedModel.class);
	}
	
    /**
     * Get all values of property VersionedModel as a ReactorResult of VersionedModel 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<VersionedModel> getAllVersionedModel_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, VERSIONEDMODEL, VersionedModel.class);
	}

    /**
     * Get all values of property VersionedModel     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<VersionedModel> getAllVersionedModel() {
		return Base.getAll(this.model, this.getResource(), VERSIONEDMODEL, VersionedModel.class);
	}

    /**
     * Get all values of property VersionedModel as a ReactorResult of VersionedModel 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<VersionedModel> getAllVersionedModel_as() {
		return Base.getAll_as(this.model, this.getResource(), VERSIONEDMODEL, VersionedModel.class);
	}
 
    /**
     * Adds a value to property VersionedModel as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addVersionedModel( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, VERSIONEDMODEL, value);
	}
	
    /**
     * Adds a value to property VersionedModel as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addVersionedModel( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), VERSIONEDMODEL, value);
	}
    /**
     * Adds a value to property VersionedModel from an instance of VersionedModel 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addVersionedModel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, VersionedModel value) {
		Base.add(model, instanceResource, VERSIONEDMODEL, value);
	}
	
    /**
     * Adds a value to property VersionedModel from an instance of VersionedModel 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addVersionedModel(VersionedModel value) {
		Base.add(this.model, this.getResource(), VERSIONEDMODEL, value);
	}
  

    /**
     * Sets a value of property VersionedModel from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setVersionedModel( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, VERSIONEDMODEL, value);
	}
	
    /**
     * Sets a value of property VersionedModel from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setVersionedModel( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), VERSIONEDMODEL, value);
	}
    /**
     * Sets a value of property VersionedModel from an instance of VersionedModel 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setVersionedModel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, VersionedModel value) {
		Base.set(model, instanceResource, VERSIONEDMODEL, value);
	}
	
    /**
     * Sets a value of property VersionedModel from an instance of VersionedModel 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setVersionedModel(VersionedModel value) {
		Base.set(this.model, this.getResource(), VERSIONEDMODEL, value);
	}
  


    /**
     * Removes a value of property VersionedModel as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeVersionedModel( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, VERSIONEDMODEL, value);
	}
	
    /**
     * Removes a value of property VersionedModel as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeVersionedModel( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), VERSIONEDMODEL, value);
	}
    /**
     * Removes a value of property VersionedModel given as an instance of VersionedModel 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeVersionedModel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, VersionedModel value) {
		Base.remove(model, instanceResource, VERSIONEDMODEL, value);
	}
	
    /**
     * Removes a value of property VersionedModel given as an instance of VersionedModel 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeVersionedModel(VersionedModel value) {
		Base.remove(this.model, this.getResource(), VERSIONEDMODEL, value);
	}
  
    /**
     * Removes all values of property VersionedModel     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllVersionedModel( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, VERSIONEDMODEL);
	}
	
    /**
     * Removes all values of property VersionedModel	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void addVersionedModel() {
		Base.removeAll(this.model, this.getResource(), VERSIONEDMODEL);
	}
 }