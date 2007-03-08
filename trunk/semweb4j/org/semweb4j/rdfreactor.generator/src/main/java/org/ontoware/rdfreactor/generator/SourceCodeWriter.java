package org.ontoware.rdfreactor.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.ontoware.rdfreactor.generator.java.JClass;
import org.ontoware.rdfreactor.generator.java.JModel;
import org.ontoware.rdfreactor.generator.java.JPackage;

/**
 * should use velocity
 * 
 * @author $Author: xamde $
 * @version $Id: SourceCodeWriter.java,v 1.9 2006/07/01 10:35:09 xamde Exp $
 * 
 */
public class SourceCodeWriter {
	// /microreactor/bin/org/ontoware/rdfreactor/generator/class.vm
	public static final String TEMPLATE_CLASS = "class.vm";

	// public static final String TEMPLATE_CLASS =
	// "./org/ontoware/rdfreactor/generator/class.vm";

	private static final Log log = LogFactory.getLog(SourceCodeWriter.class);

	// public static final String TEMPLATE_CLASS =
	// "./org/ontoware/rdfreactor/generator/class.vm";

	/**
	 * uses the default template
	 */
	public static void write(JModel jm, File outdir, String methodnamePrefix)
			throws Exception {
		write(jm, outdir, TEMPLATE_CLASS, methodnamePrefix);
	}

	public static void write(JModel jm, File outdir, String templateName,
			String methodnamePrefix) throws IOException {

		jm.addInverseProperties();
		assert jm.isConsistent() : "java package is not consistent";
		log.info("JModel model: \n" + jm.toString());

		System.out.println(jm.toString() + "\n>>>>>>  written to "
				+ outdir.getAbsolutePath());

		// //////////////
		// template

		log.info("prepare for writing " + jm.getPackages().size()
				+ " packages using template " + templateName);

		VelocityEngine ve = new VelocityEngine();
		VelocityContext context = new VelocityContext();

		// http://jakarta.apache.org/velocity/docs/api/org/apache/velocity/runtime/resource/loader/ClasspathResourceLoader.html
		// Properties velocityProperties = new Properties();
		// velocityProperties.put("resource.loader", "class,classpath");
		// velocityProperties
		// .put("class.resource.loader.class",
		// "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		try {
			ve.setProperty("resource.loader", "class");
			ve
					.setProperty("class.resource.loader.class",
							"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

			// see http://minaret.biz/tips/tomcatLogging.html
			ve.setProperty("runtime.log.logsystem.class",
					"org.apache.velocity.runtime.log.SimpleLog4JLogSystem");

			ve.init();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		assert templateName != null;

		if (!ve.templateExists(templateName))
			throw new RuntimeException("template " + templateName
					+ " does not exist with resource loader "
					+ Velocity.RESOURCE_LOADER);

		Template template;
		try {
			template = ve.getTemplate(templateName);
		} catch (ResourceNotFoundException e) {
			throw new RuntimeException(e);
		} catch (ParseErrorException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		assert template != null;

		context.put("methodnameprefix", methodnamePrefix);
		// for debug only
		Calendar c = Calendar.getInstance();
		context.put("now", SimpleDateFormat.getInstance().format(c.getTime()));
		context.put("root", jm.getRoot());
		log.debug("always write to store? " + jm.getAlwaysWriteToModel());
		context.put("writetostore", jm.getAlwaysWriteToModel());

		for (JPackage jp : jm.getPackages())
			write(context, jp, outdir, template);
	}

	private static void write(VelocityContext context, JPackage jp,
			File outdir, Template template) throws IOException {
		log.info("prepare for writing " + jp.getClasses().size() + " classes");
		File packageOutdir = new File(outdir, jp.getName().replaceAll("\\.",
				"\\/"));
		log.info("Out dir      " + packageOutdir.getAbsolutePath());
		if (!packageOutdir.exists())
			packageOutdir.mkdirs();

		// package
		assert jp.isConsistent();
		context.put("package", jp);
		for (JClass jc : jp.getClasses()) {
			assert jc != null;
			write(jc, packageOutdir, context, template);
		}
	}

	private static void write(JClass jc, File outdir, VelocityContext context,
			Template template) throws IOException {

		assert template != null;
		assert jc != null;
		assert jc.getName() != null;
		assert jc.getSuperclass() != null;
		context.put("class", jc);
		String outfile = outdir + "/" + jc.getName() + ".java";
		log.debug("writing file " + outfile);
		FileWriter fw = new FileWriter(outfile);
		try {
			template.merge(context, fw);
		} catch (ResourceNotFoundException e) {
			throw new RuntimeException(e);
		} catch (ParseErrorException e) {
			throw new RuntimeException(e);
		} catch (MethodInvocationException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		fw.close();

	}
}
