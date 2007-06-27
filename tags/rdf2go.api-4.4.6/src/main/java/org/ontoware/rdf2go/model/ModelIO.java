package org.ontoware.rdf2go.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.exception.SyntaxNotSupportedException;

public interface ModelIO {

	// /////////////////
	// IO

	/**
	 * Read from Reader assuming in UTF8 encoding. Models are read with a
	 * default syntax of RDF/XML
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
	 * When reading TRiX into a Model, the context URI is ignored.
	 *  
	 * @param in
	 *            the input to read
	 * @param syntax
	 *            syntax to use
	 * @throws IOException
	 *             on IOErrors
	 * @throws ModelRuntimeException
	 *             on RDF serialization errors or model errors
	 */
	public void readFrom(Reader in, Syntax syntax) throws IOException,
			ModelRuntimeException;

	/**
	 * Read from InputStream assuming to read an RDF/XML stream.
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
	 * @param in
	 *            the input to read
	 * @param syntax
	 *            syntax to use
	 * @throws IOException
	 *             on IOErrors
	 * @throws ModelRuntimeException
	 *             on RDF serialization errors or model errors
	 */
	public void readFrom(InputStream reader, Syntax syntax) throws IOException,
			ModelRuntimeException;

	/**
	 * Writing an RDF/XML stream in UTF8 encoding
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
	 */
	public void writeTo(Writer out, Syntax syntax) throws IOException,
			ModelRuntimeException;

	/**
	 * Writing an RDF/XML stream in UTF8 encoding
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
	 */
	public void writeTo(OutputStream out, Syntax syntax) throws IOException,
			ModelRuntimeException;
	
	/**
	 * Convenience method to export a Model to a String in a given syntax.
	 * @param syntax
	 * @return a String, containing the Model content in the given syntax.
	 * @throws SyntaxNotSupportedException if the syntax is not supported
	 */
	public String serialize( Syntax syntax ) throws SyntaxNotSupportedException;

}
