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
package org.ontoware.rdf2go.model.node.impl;

import org.ontoware.rdf2go.SparqlUtil;
import org.ontoware.rdf2go.model.node.DatatypeLiteral;
import org.ontoware.rdf2go.model.node.LanguageTagLiteral;
import org.ontoware.rdf2go.model.node.Node;

public class LanguageTagLiteralImpl extends LiteralImpl implements LanguageTagLiteral {

	private String languageTag;

	private String literalValue;

	public LanguageTagLiteralImpl(String string, String languageTag) {
		assert languageTag != null;
		assert string != null;
		this.languageTag = languageTag;
		this.literalValue = string;
	}

	public String getValue() {
		return literalValue;
	}

	public String getLanguageTag() {
		return languageTag;
	}

	public boolean equals(Object o) {
		return ((o instanceof LanguageTagLiteralImpl)
				&& (this.getValue().equals(((LanguageTagLiteralImpl) o).getValue())) && (this
				.getLanguageTag().equals(((LanguageTagLiteralImpl) o).getLanguageTag())));
	}

	public String toString() {
		return getValue() + " (" + getLanguageTag() + ")";
	}

	public DatatypeLiteral asDatatypeLiteral() throws ClassCastException {
		throw new ClassCastException("Cannot call this on a language tagged literal");
	}

	public LanguageTagLiteral asLanguageTagLiteral() throws ClassCastException {
		return this;
	}

	public int hashCode() {
		return languageTag.hashCode() + literalValue.hashCode();
	}

	public int compareTo( Node other ) {
		if (other instanceof LanguageTagLiteral) {
			LanguageTagLiteral oLit = (LanguageTagLiteral) other;
			
			int diff = this.getValue().compareTo( oLit.getValue() );
			if(diff != 0) return diff;
			else {
				return this.getLanguageTag().compareTo(oLit.getLanguageTag());
			}
		}
		else {
			// sort by type
			return NodeUtils.compareByType(this, other);
		}
	}

	public String toSPARQL()  {
		return "\""+SparqlUtil.sparqlEncode(literalValue)+"\"@"+languageTag;
	}

}
