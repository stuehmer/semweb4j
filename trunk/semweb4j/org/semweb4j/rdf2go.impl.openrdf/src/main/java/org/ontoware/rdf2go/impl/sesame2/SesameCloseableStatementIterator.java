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
package org.ontoware.rdf2go.impl.sesame2;

import org.openrdf.model.Statement;
import org.openrdf.util.iterator.CloseableIterator;

/**
 * closable Iterator over sesame2 Statements, which converts them to rdf2go
 * statements on demand.
 * 
 * In theory this should close itself, when necessary.
 * 
 * 
 * @author Benjamin Heitmann <benjamin.heitmann@deri.org>
 * 
 */
class SesameCloseableStatementIterator extends SesameCloseableIterator<org.openrdf.model.Statement, org.ontoware.rdf2go.model.Statement> {

    /**
     * @param wrapped
     * @param converter
     */
    public SesameCloseableStatementIterator(CloseableIterator<Statement> wrapped) {
        super(wrapped);
    }   
    

    @Override
    public org.ontoware.rdf2go.model.Statement convert(Statement next) {
        return new SesameStatementWrapper(next);
    }
    
    


    
}
