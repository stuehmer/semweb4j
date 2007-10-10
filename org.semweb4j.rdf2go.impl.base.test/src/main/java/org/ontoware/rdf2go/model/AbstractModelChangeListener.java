/*
 * LICENSE INFORMATION
 * Copyright 2005-2007 by FZI (http://www.fzi.de).
 * Licensed under a BSD license (http://www.opensource.org/licenses/bsd-license.php)
 * <OWNER> = Max V�lkel
 * <ORGANIZATION> = FZI Forschungszentrum Informatik Karlsruhe, Karlsruhe, Germany
 * <YEAR> = 2007
 * 
 * Project information at http://semweb4j.org/rdf2go
 */

package org.ontoware.rdf2go.model;

import java.util.Iterator;

abstract class AbstractModelChangeListener implements ModelChangedListener
{
	public void addedStatement(Statement statement)
	{
		NotifyingModelTest.fail();
	}

	public void addedStatements(Iterator<Statement> statements)
	{
		NotifyingModelTest.fail();
	}

	public void performedUpdate(Diff diff)
	{
		NotifyingModelTest.fail();
	}

	public void removedStatement(Statement statement)
	{
		NotifyingModelTest.fail();
	}

	public void removedStatements(Iterator<Statement> statements)
	{
		NotifyingModelTest.fail();
	}
}