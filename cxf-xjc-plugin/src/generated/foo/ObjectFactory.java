//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.13 at 07:36:55 PM CET 
//

package foo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the foo
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Main_QNAME = new QName("a", "main");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: foo
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Numbers }
	 * 
	 */
	public Numbers createNumbers() {
		return new Numbers();
	}

	/**
	 * Create an instance of {@link Main }
	 * 
	 */
	public Main createMain() {
		return new Main();
	}

	/**
	 * Create an instance of {@link Strings }
	 * 
	 */
	public Strings createStrings() {
		return new Strings();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Main }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "a", name = "main")
	public JAXBElement<Main> createMain(Main value) {
		return new JAXBElement<Main>(_Main_QNAME, Main.class, null, value);
	}

}