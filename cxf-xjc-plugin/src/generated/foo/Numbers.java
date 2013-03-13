//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.13 at 07:36:55 PM CET 
//

package foo;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Numbers complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Numbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minInclusive" type="{a}minInclusive"/>
 *         &lt;element name="maxInclusive" type="{a}maxInclusive"/>
 *         &lt;element name="minExclusive" type="{a}minExclusive"/>
 *         &lt;element name="maxExclusive" type="{a}maxExclusive"/>
 *         &lt;element name="minMaxExclusive" type="{a}minMaxExclusive"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Numbers", propOrder = { "minInclusive", "maxInclusive", "minExclusive", "maxExclusive",
		"minMaxExclusive" })
public class Numbers {

	@NotNull
	@DecimalMin("1000")
	protected long minInclusive;
	@NotNull
	@DecimalMax("1000")
	protected long maxInclusive;
	@NotNull
	@DecimalMin("0")
	protected long minExclusive;
	@NotNull
	@DecimalMax("1000")
	protected long maxExclusive;
	@NotNull
	@DecimalMax("1000")
	@DecimalMin("0")
	protected int minMaxExclusive;

	/**
	 * Gets the value of the minInclusive property.
	 * 
	 */
	public long getMinInclusive() {
		return minInclusive;
	}

	/**
	 * Sets the value of the minInclusive property.
	 * 
	 */
	public void setMinInclusive(long value) {
		this.minInclusive = value;
	}

	/**
	 * Gets the value of the maxInclusive property.
	 * 
	 */
	public long getMaxInclusive() {
		return maxInclusive;
	}

	/**
	 * Sets the value of the maxInclusive property.
	 * 
	 */
	public void setMaxInclusive(long value) {
		this.maxInclusive = value;
	}

	/**
	 * Gets the value of the minExclusive property.
	 * 
	 */
	public long getMinExclusive() {
		return minExclusive;
	}

	/**
	 * Sets the value of the minExclusive property.
	 * 
	 */
	public void setMinExclusive(long value) {
		this.minExclusive = value;
	}

	/**
	 * Gets the value of the maxExclusive property.
	 * 
	 */
	public long getMaxExclusive() {
		return maxExclusive;
	}

	/**
	 * Sets the value of the maxExclusive property.
	 * 
	 */
	public void setMaxExclusive(long value) {
		this.maxExclusive = value;
	}

	/**
	 * Gets the value of the minMaxExclusive property.
	 * 
	 */
	public int getMinMaxExclusive() {
		return minMaxExclusive;
	}

	/**
	 * Sets the value of the minMaxExclusive property.
	 * 
	 */
	public void setMinMaxExclusive(int value) {
		this.minMaxExclusive = value;
	}

}