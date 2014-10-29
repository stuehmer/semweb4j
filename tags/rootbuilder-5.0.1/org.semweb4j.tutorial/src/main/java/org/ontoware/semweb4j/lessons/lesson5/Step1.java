package org.ontoware.semweb4j.lessons.lesson5;

import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.RDF2Go;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.QueryRow;
import org.ontoware.rdf2go.model.Statement;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.Variable;
import org.ontoware.semweb4j.lessons.lesson5.gen.Person;
import org.ontoware.semweb4j.lessons.lesson5.gen.Tag;

public class Step1 {

	private static Model model;

	public static void main(String[] args) throws Exception {
		getRDF2GOModel();
		run();
	}

	private static void getRDF2GOModel() throws ModelRuntimeException {
		model = RDF2Go.getModelFactory().createModel();
		model.open();
	}

	private static void run() throws ModelRuntimeException {
		// use the rdfs class Person from peopletag.rdfs.n3 here
		// via lesson5.gen package (generated by rdfreactor)
		Person max = new Person(model, "http://xam.de/foaf.rdf.xml#i");
		Person konrad = new Person(model);

		max.addName("Max Völkel");
		konrad.addName("Konrad Völkel");
		max.addKnows(konrad);

		Tag java = new Tag(model);
		Tag python = new Tag(model);
		java.addName("Java related");
		python.addName("Python related");
		python.addName("pythonic stuff");

		max.addTag(java);
		konrad.addTag(python);

		System.out.println("the instance model:");
		model.dump();
		System.out.println("-----------------\n\n");

		System.out.println("konrad's tags:");
		for (Tag tag : konrad.getAllTag()) {
			for (String name : tag.getAllName()) {
				System.out.println(name);
			}
		}
		System.out.println("-----------------\n\n");

		URI tag = model.createURI("http://example.com/semweb4j#tag");
		URI name = model.createURI("http://example.com/semweb4j#name");

		System.out.println("all tagging statements:");
		ClosableIterator<? extends Statement> it = model.findStatements(Variable.ANY, tag,
				Variable.ANY);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		it.close();
		
		System.out.println("-----------------\n\n");

		System.out.println("the names of all tags:");
		for (QueryRow row : model.sparqlSelect("SELECT ?name WHERE {?tag <"
				+ name + "> ?name . ?resource <" + tag + "> ?tag}")) {
			System.out.println(row.getLiteralValue("name"));
		}

		// next steps: Using the API, Hacking the API, Modifying the code, generation process
		// those "next steps" are postponed :-D
	}

}
