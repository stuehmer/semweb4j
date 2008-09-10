package org.ontoware.aifbcommons.xml;

import java.io.IOException;
import java.io.InputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.junit.Assert;
import org.junit.Test;
import org.xmlpull.v1.XmlPullParserException;


/**
 * @author mvo
 *
 */
public class XMLUtilsTest {

	@Test
	public void testXmldecode() throws DocumentException, IOException, XmlPullParserException {
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream in =  classloader.getResourceAsStream("sample-wikipage-in.xml");
		
		Document doc = XMLUtils.getAsXML( in );
		
		String xml = doc.asXML();
		
		String encoded = XMLUtils.xmlencode( xml );
		
		String decoded = XMLUtils.xmldecode( encoded );
		
		Assert.assertEquals( xml, decoded );
	}

}