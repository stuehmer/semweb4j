/**
 * generated by http://RDFReactor.semweb4j.org ($Id: CodeGenerator.java 785 2007-05-31 15:47:01Z voelkel $) on 29.10.07 19:33
 */
package gen.rangexsdint;

import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdf2go.exception.ModelRuntimeException;

import org.ontoware.rdfreactor.runtime.RDFDataException;


/**
 * 
 *  
 * This class manages access to these properties:
 * <ul>
 *   <li> Aprop </li>
 * </ul>
 *
 * This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 29.10.07 19:33
 */
public class Aclass extends Thing {

    /** http://example.com#Aclass */
	public static final URI RDFS_CLASS = new URIImpl("http://example.com#Aclass", false);

    /** http://example.com#Aprop */
	public static final URI APROP = new URIImpl("http://example.com#Aprop",false);

    /** all property-URIs with this class as domain */
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://example.com#Aprop",false) 
    };

	
	// protected constructors needed for inheritance
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.semweb4j.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier Resource that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	protected Aclass ( Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, classURI, instanceIdentifier, write);
	}

	// public constructors

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param instanceIdentifier an RDF2Go Resource identifying this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	public Aclass ( Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uri URI of this instance
	 */
	public Aclass ( Model model, URI uri ) {
		this(model, uri, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uriString A URI of this instance, represented as a String
	 * @throws ModelRuntimeException if URI syntax is wrong
	 */
	public Aclass ( Model model, String uriString ) throws ModelRuntimeException {
		this(model, new URIImpl(uriString), true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 */
	public Aclass ( Model model, BlankNode bnode ) {
		this(model, bnode, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by 
	 * a randomly generated URI.
	 * Creating two wrappers results in different URIs.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 */
	public Aclass ( Model model ) {
		this(model, model.newRandomUniqueURI(), true);
	}


    ///////////////////////////////////////////////////////////////////
    // getters, setters, ...

	/**
	 * @param model RDF2Go model
	 * @param uri instance identifier
	 * @return an instance of Aclass or null if none existst
	 * @throws Exception if Model causes problems
	 */
	public static Aclass getInstance(Model model, URI uri) throws Exception {
		return (Aclass) getInstance(model, uri, Aclass.class);
	}

	/**
	 * @param model
	 * @param uri
	 * @return true if uri is an instance of this class in the model
	 */
	public static boolean hasInstance(Model model, URI uri) {
		return hasInstance(model, uri, RDFS_CLASS);
	}

	/**
	 * @return all instances of this class
	 */
	public Aclass[] getAllInstances() {
		return (Aclass[]) getAllInstances(super.model, Aclass.class);
	}

	/**
	 * @return all instances of this class in the given Model
	 * @param model an RDF2Go model
	 */
	public static Aclass[] getAllInstances(Model model) {
		return (Aclass[]) getAllInstances(model, Aclass.class);
	}


    /**
     * Schema Comment: 
     * @return the only value. null if none is found
     * @throws RDFDataException, if the property has multiple values
     */
	public java.lang.Integer getAprop() {
		return (java.lang.Integer) get(APROP, java.lang.Integer.class);
	}

	/**
	 * removes all values and sets this one
	 * @param value the value to be set
     * Schema Comment: 
	 */
	public void setAprop( java.lang.Integer value ) {
		set(APROP, value);
	}

	/**
	 * removes current value(s)
     * Schema Comment: 
	 */
	public void removeAprop() {
		removeAll(APROP);
	}
 	/**
	 * removes a value
	 * @param value the value to be removed
     * Schema Comment: 
	 */
	public void removeAprop( java.lang.Integer value  ) {
		remove(APROP, value);
	}

	/**
	 * removes all values
     * Schema Comment: 
	 */
	public void removeAllAprop() {
		removeAll(APROP);
	}
 
	/**
	 * @param value
	 * @return true if the model contains a statement (this, APROP, value)
	 */
	public boolean hasAprop( java.lang.Integer value) {
		return hasValue(APROP, value);
	}

	/**
	 * @return true if the model contains a statement (this, APROP, *)
	 */
	public boolean hasAprop() {
		return hasValue(APROP);
	}

 
	/**
	 * adds a value
	 * @param value the value to be added
     * Schema Comment: 
	 */
	public void addAprop( java.lang.Integer value  ) {
		add(APROP, value );
	}

	/**
	 * @return all values
     * Schema Comment: 
	 */
	public java.lang.Integer[] getAllAprop() {
		return (java.lang.Integer[]) getAll(APROP, java.lang.Integer.class);
	}
   
}

  
  
