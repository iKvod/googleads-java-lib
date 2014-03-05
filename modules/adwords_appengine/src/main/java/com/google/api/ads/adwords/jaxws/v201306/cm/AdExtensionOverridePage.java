
package com.google.api.ads.adwords.jaxws.v201306.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a page of {@link AdExtensionOverride}s resulting from the query
 *             done by {@link AdExtensionOverrideService}.
 *           
 * 
 * <p>Java class for AdExtensionOverridePage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdExtensionOverridePage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}Page">
 *       &lt;sequence>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/cm/v201306}AdExtensionOverride" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdExtensionOverridePage", propOrder = {
    "entries"
})
public class AdExtensionOverridePage
    extends Page
{

    protected List<AdExtensionOverride> entries;

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtensionOverride }
     * 
     * 
     */
    public List<AdExtensionOverride> getEntries() {
        if (entries == null) {
            entries = new ArrayList<AdExtensionOverride>();
        }
        return this.entries;
    }

}