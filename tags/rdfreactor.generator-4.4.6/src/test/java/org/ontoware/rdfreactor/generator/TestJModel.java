package org.ontoware.rdfreactor.generator;

import junit.framework.TestCase;

import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdfreactor.generator.java.JClass;
import org.ontoware.rdfreactor.generator.java.JModel;
import org.ontoware.rdfreactor.generator.java.JPackage;

public class TestJModel extends TestCase {
	
	public void testMapping() {
		
		JPackage jp = new JPackage("Package");
		JClass root = new JClass(jp,"Rootclass", new URIImpl("urn:java:class.Rootclass"));
		JModel jm = new JModel(root,true);
		
		URI testURI = new URIImpl("urn:test:classX");
		JClass testClass = new JClass(jp,"Testclass", testURI);
		
		jm.addMapping( testURI, testClass );
		
		assertNotNull(jm.getMapping(testURI));
	}

}