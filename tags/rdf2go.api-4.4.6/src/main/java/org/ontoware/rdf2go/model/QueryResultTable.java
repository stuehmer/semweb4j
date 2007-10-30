/*
 * LICENSE INFORMATION
 * Copyright 2005-2007 by FZI (http://www.fzi.de).
 * Licensed under a BSD license (http://www.opensource.org/licenses/bsd-license.php)
 * <OWNER> = Max Völkel
 * <ORGANIZATION> = FZI Forschungszentrum Informatik Karlsruhe, Karlsruhe, Germany
 * <YEAR> = 2007
 * 
 * Project information at http://semweb4j.org/rdf2go
 */
package org.ontoware.rdf2go.model;

import java.util.Set;

import org.ontoware.aifbcommons.collection.ClosableIterable;

public interface QueryResultTable extends ClosableIterable<QueryRow> {

	/**
	 * Return the set of all variable names useed in the query.
	 * 
	 * @return
	 */
	Set<String> getVariables();

}