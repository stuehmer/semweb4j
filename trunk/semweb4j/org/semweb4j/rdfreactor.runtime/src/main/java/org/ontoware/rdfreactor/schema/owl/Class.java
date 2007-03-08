
/**
 * generated by http://RDFReactor.ontoware.org on 08.05.06 18:57
 */
package org.ontoware.rdfreactor.schema.owl;

import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.Resource;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdf2go.vocabulary.OWL;
import org.ontoware.rdfreactor.runtime.RDFDataException;
import org.ontoware.rdfreactor.schema.rdfschema.List;
import org.ontoware.rdfreactor.schema.rdfschema.Property;


/**
 * This class was generated by <a href="http://RDFReactor.ontoware.org">RDFReactor</a> on 08.05.06 18:57
 * This class manages access to these properties:
 * <ul>
 *   <li> OneOf </li>
 *   <li> SubClassOf </li>
 * </ul>
 */
public class Class extends org.ontoware.rdfreactor.schema.rdfschema.Resource {

	public static final Log log = LogFactory.getLog( Class.class );
	
    /** http://www.w3.org/2000/01/rdf-schema#Class */
	public static final URI RDFS_CLASS = OWL.Class;

    /** http://www.w3.org/2002/07/owl#oneOf */
	public static final URI ONEOF = new URIImpl("http://www.w3.org/2002/07/owl#oneOf",false);

    /** http://www.w3.org/2000/01/rdf-schema#subClassOf */
	public static final URI SUBCLASSOF = new URIImpl("http://www.w3.org/2000/01/rdf-schema#subClassOf",false);
	
	// protected constructors needed for inheritance
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier URI, BlankNode or URL that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	protected Class ( Model model, URI classURI, Resource instanceIdentifier, boolean write ) {
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
	public Class ( Model model, Resource instanceIdentifier, boolean write ) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uri URI of this instance
	 */
	public Class ( Model model, URI uri ) {
		this(model, uri, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 */
	public Class ( Model model, BlankNode bnode ) {
		this(model, bnode, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by 
	 * a randomly generated URI.
	 * Creating two wrappers results in different URIs.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 */
	public Class ( Model model ) {
		this(model, RDFS_CLASS, true);
	}

    ///////////////////////////////////////////////////////////////////
    // getters, setters, ...

	/**
	 * @return all instances of this class
	 */
	public Class[] getAllInstances() {
		return (Class[]) getAllInstances(super.model, Class.class);
	}

	/**
	 * @return all instances of this class in the given Model
	 * @param model an RDF2Go model
	 */
	public static Class[] getAllInstances(Model model) {
		return (Class[]) getAllInstances(model, Class.class);
	}

	/**
	 * @return all A's that have a relation 'Domain' to this Class instance
	 */
	public Property[] getAllDomain_Inverse() {
		return (Property[]) getAll_Inverse(Property.DOMAIN, this.getResource(), Property.class);
	}

	/**
	 * add 'Domain'-Inverse
	 */
	public void addDomain_Inverse(Property value) {
		value.add( Property.DOMAIN ,this);
	}


	/**
	 * @return all A's that have a relation 'Range' to this Class instance
	 */
	public Property[] getAllRange_Inverse() {
		return (Property[]) getAll_Inverse(Property.RANGE, this.getResource(), Property.class);
	}

	/**
	 * add 'Range'-Inverse
	 */
	public void addRange_Inverse(Property value) {
		value.add( Property.RANGE ,this);
	}


	/**
	 * @return all A's that have a relation 'SubClassOf' to this Class instance
	 */
	public Class[] getAllSubClassOf_Inverse() {
		return (Class[]) getAll_Inverse(Class.SUBCLASSOF, this.getResource(), Class.class);
	}

	/**
	 * add 'SubClassOf'-Inverse
	 */
	public void addSubClassOf_Inverse(Class value) {
		value.add( Class.SUBCLASSOF ,this);
	}


	/**
	 * @return all A's that have a relation 'AllValuesFrom' to this Class instance
	 */
	public Restriction[] getAllAllValuesFrom_Inverse() {
		return (Restriction[]) getAll_Inverse(Restriction.ALLVALUESFROM, this.getResource(), Restriction.class);
	}

	/**
	 * add 'AllValuesFrom'-Inverse
	 */
	public void addAllValuesFrom_Inverse(Restriction value) {
		value.add( Restriction.ALLVALUESFROM ,this);
	}


	/**
	 * @return all A's that have a relation 'SomeValuesFrom' to this Class instance
	 */
	public Restriction[] getAllSomeValuesFrom_Inverse() {
		return (Restriction[]) getAll_Inverse(Restriction.SOMEVALUESFROM, this.getResource(), Restriction.class);
	}

	/**
	 * add 'SomeValuesFrom'-Inverse
	 */
	public void addSomeValuesFrom_Inverse(Restriction value) {
		value.add( Restriction.SOMEVALUESFROM ,this);
	}



    /**
     * @return the only value. null if none is found
     * @throws RDFDataException, if the property has multiple values
     */
	public List getOneOf() {
		return (List) get(ONEOF, List.class);
	}

	/**
	 * removes all values and sets this one
	 */
	public void setOneOf( List value ) {
		set(ONEOF, value);
	}

 	/**
	 * removes a value
	 */
	public void removeOneOf( List value  ) {
		remove(ONEOF, value);
	}
  
	/**
	 * adds a value
	 */
	public void addOneOf( List value  ) {
		add(ONEOF, value );
	}
 
	/**
	 * returns all values
	 */
	public List[] getAllOneOf() {
		return (List[]) getAll(ONEOF, List.class);
	}
 

    /**
     * @return the only value. null if none is found
     * @throws RDFDataException, if the property has multiple values
     */
	public Class getSubClassOf() {
		return (Class) get(SUBCLASSOF, Class.class);
	}

	/**
	 * removes all values and sets this one
	 */
	public void setSubClassOf( Class value ) {
		set(SUBCLASSOF, value);
	}

 	/**
	 * removes a value
	 */
	public void removeSubClassOf( Class value  ) {
		remove(SUBCLASSOF, value);
	}
  
	/**
	 * adds a value
	 */
	public void addSubClassOf( Class value  ) {
		add(SUBCLASSOF, value );
	}
 
	/**
	 * returns all values
	 */
	public Class[] getAllSubClassOf() {
		return (Class[]) getAll(SUBCLASSOF, Class.class);
	}

    /////
	// ext
	
	/**
	 * @return all 'real' super classes, ignore restrictions
	 * @throws Exception
	 */
	public org.ontoware.rdfreactor.schema.owl.Class[] getAllRealSuperclasses(
			Set<org.ontoware.rdfreactor.schema.owl.Class> wanted)
			throws Exception {
		java.util.List<org.ontoware.rdfreactor.schema.owl.Class> real = new ArrayList<org.ontoware.rdfreactor.schema.owl.Class>();
		for (Class c : getAllSubClassOf()) {
			if (c.isInstanceof(OWL.Restriction)) {
				// do nothing
				log.debug("Restriction as supertype");
			} else if (wanted.contains(c)) {
				real
						.add((org.ontoware.rdfreactor.schema.owl.Class) c
								.castTo(org.ontoware.rdfreactor.schema.owl.Class.class));
			} else
				log.debug("un-wanted class " + c.getResource());
		}
		return real.toArray(new org.ontoware.rdfreactor.schema.owl.Class[0]);
	}

  }

  
  
