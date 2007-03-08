
/**
 * generated by http://RDFReactor.ontoware.org on 08.05.06 17:17
 */
package org.ontoware.rdfreactor.schema.rdfschema;

import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.Resource;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;



/**
 * This class was generated by <a href="http://RDFReactor.ontoware.org">RDFReactor</a> on 08.05.06 17:17
 * Schema Comment: The class of XML literal values.
 */
public class XMLLiteral extends org.ontoware.rdfreactor.schema.rdfschema.Resource {

    /** http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral */
	public static final URI RDFS_CLASS = new URIImpl("http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral",false);
	
	// protected constructors needed for inheritance
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier URI, BlankNode or URL that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	protected XMLLiteral ( Model model, URI classURI, Resource instanceIdentifier, boolean write ) {
		super(model, classURI, instanceIdentifier, write);
	}

	// public constructors

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uri URI of this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	public XMLLiteral ( Model model, Resource instanceIdentifier, boolean write ) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uri URI of this instance
	 */
	public XMLLiteral ( Model model, URI uri ) {
		this(model, uri, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 */
	public XMLLiteral ( Model model, BlankNode bnode ) {
		this(model, bnode, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by 
	 * a randomly generated URI.
	 * Creating two wrappers results in different URIs.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 */
	public XMLLiteral ( Model model ) {
		this(model, RDFS_CLASS, true);
	}

    ///////////////////////////////////////////////////////////////////
    // getters, setters, ...

	/**
	 * @return all instances of this class
	 */
	public XMLLiteral[] getAllInstances() {
		return (XMLLiteral[]) getAllInstances(super.model, XMLLiteral.class);
	}
 }

  
  
