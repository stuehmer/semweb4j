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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.exception.SyntaxNotSupportedException;

/**
 * Defines reading and writing to and from readers/writers and streams.
 * 
 * The default syntax for ModelSets is TRiX.
 * 
 * @author voelkel
 * 
 */
public interface ModelSetIO {

	// ///////////////////////////////
	// read/write

	/**
	 * Read from Reader assuming to read a TRiX stream in UTF8 encoding.
	 * 
	 * All Models are created with the corresponding names as defined in the
	 * TRiX stream as needed.
	 * 
	 * For more info on TRiX read:
	 * http://www.hpl.hp.com/techreports/2003/HPL-2003-268.html
	 * 
	 * @param in
	 *            the input to read
	 * @throws IOException
	 *             on IOErrors
	 * @throws ModelRuntimeException
	 *             on RDF serialization errors or model errors
	 */
	public void readFrom(Reader in) throws IOException, ModelRuntimeException;

	/**
	 * Reads assuming the given syntax. Encoding defaults to UTF8.
	 * 
	 * All Models are created with the corresponding names as defined in the
	 * TRiX stream as needed.
	 * 
	 * @param in
	 *            the input to read
	 * @param syntax
	 *            syntax to use
	 * @throws IOException
	 *             on IOErrors
	 * @throws ModelRuntimeException
	 *             on RDF serialization errors or model errors
	 * @throws SyntaxNotSupportedException
	 *             if adapter can't handle the given syntax
	 */
	public void readFrom(Reader in, Syntax syntax) throws IOException,
			ModelRuntimeException, SyntaxNotSupportedException;

	/**
	 * Read from InputStream assuming to read an RDF/XML stream.
	 * 
	 * All Models are created with the corresponding names as defined in the
	 * TRiX stream as needed.
	 * 
	 * For more info on TRiX read:
	 * http://www.hpl.hp.com/techreports/2003/HPL-2003-268.html
	 * 
	 * @param in
	 *            the input to read
	 * @throws IOException
	 *             on IOErrors
	 * @throws ModelRuntimeException
	 *             on RDF serialization errors or model errors
	 */
	public void readFrom(InputStream in) throws IOException, ModelRuntimeException;

	/**
	 * Reads assuming the given syntax. Encoding defaults to UTF8.
	 * 
	 * All Models are created with the corresponding names as defined in the
	 * TRiX stream as needed.
	 * 
	 * @param in
	 *            the input to read
	 * @param syntax
	 *            syntax to use
	 * @throws IOException
	 *             on IOErrors
	 * @throws ModelRuntimeException
	 *             on RDF serialization errors or model errors
	 * @throws SyntaxNotSupportedException
	 *             if adapter can't handle the given syntax
	 */
	public void readFrom(InputStream reader, Syntax syntax) throws IOException,
			ModelRuntimeException, SyntaxNotSupportedException;

	/**
	 * Write to writer in UTF8 and TRiX. For more info on TRiX read:
	 * http://www.hpl.hp.com/techreports/2003/HPL-2003-268.html
	 * 
	 * @param out
	 *            the output to write to
	 * @throws IOException
	 *             on IOErrors
	 * @throws ModelRuntimeException
	 *             on RDF serialization errors or model errors
	 */
	public void writeTo(Writer out) throws IOException, ModelRuntimeException;

	/**
	 * Write the model to the passed writer, using the passed syntax.
	 * 
	 * @param out
	 *            the output to write to
	 * @param syntax
	 *            syntax to use
	 * @throws IOException
	 *             on IOErrors
	 * @throws ModelRuntimeException
	 *             on RDF serialization errors or model errors
	 * @throws SyntaxNotSupportedException
	 *             if adapter can't handle the given syntax
	 */
	public void writeTo(Writer out, Syntax syntax) throws IOException,
			ModelRuntimeException, SyntaxNotSupportedException;

	/**
	 * Writing a TRiX stream in UTF8 encoding For more info on TRiX read:
	 * http://www.hpl.hp.com/techreports/2003/HPL-2003-268.html
	 * 
	 * @param out
	 *            the output to write to
	 * @throws IOException
	 *             on IOErrors
	 * @throws ModelRuntimeException
	 *             on RDF serialization errors or model errors
	 */
	public void writeTo(OutputStream out) throws IOException, ModelRuntimeException;

	/**
	 * Write the model to the passed writer, using the passed syntax.
	 * 
	 * @param out
	 *            the output to write to
	 * @param syntax
	 *            syntax to use
	 * @throws IOException
	 *             on IOErrors
	 * @throws ModelRuntimeException
	 *             on RDF serialization errors or model errors
	 * @throws SyntaxNotSupportedException
	 *             if adapter can't handle the given syntax
	 */
	public void writeTo(OutputStream out, Syntax syntax) throws IOException,
			ModelRuntimeException, SyntaxNotSupportedException;

	/**
	 * Convenience method to export a ModelSet to a String in a given syntax.
	 * @param syntax
	 * @return a String, containing the ModelSet content in the given syntax.
	 * @throws SyntaxNotSupportedException if the syntax is not supported
	 */
	public String serialize( Syntax syntax ) throws SyntaxNotSupportedException;
}
