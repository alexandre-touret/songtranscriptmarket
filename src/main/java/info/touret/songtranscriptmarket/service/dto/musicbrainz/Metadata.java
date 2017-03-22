
package info.touret.songtranscriptmarket.service.dto.musicbrainz;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="artist-list">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="artist" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="area" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="begin-area" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="end-area" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="disambiguation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ipi-list" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ipi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="life-span">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="begin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="ended" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="alias-list" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="alias" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="tag-list" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                 &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "artistList"
})
@XmlRootElement(name = "metadata")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Metadata {

    @XmlElement(name = "artist-list", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metadata.ArtistList artistList;
    @XmlAttribute(name = "created")
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar created;

    /**
     * Obtient la valeur de la propriété artistList.
     * 
     * @return
     *     possible object is
     *     {@link Metadata.ArtistList }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metadata.ArtistList getArtistList() {
        return artistList;
    }

    /**
     * Définit la valeur de la propriété artistList.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata.ArtistList }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setArtistList(Metadata.ArtistList value) {
        this.artistList = value;
    }

    /**
     * Obtient la valeur de la propriété created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Définit la valeur de la propriété created.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="artist" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="area" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="begin-area" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="end-area" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="disambiguation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ipi-list" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ipi" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="life-span">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="begin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="ended" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="alias-list" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="alias" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="tag-list" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}long" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}short" />
     *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "artist"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class ArtistList {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Metadata.ArtistList.Artist> artist;
        @XmlAttribute(name = "count")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Short count;
        @XmlAttribute(name = "offset")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Byte offset;

        /**
         * Gets the value of the artist property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artist property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArtist().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Metadata.ArtistList.Artist }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Metadata.ArtistList.Artist> getArtist() {
            if (artist == null) {
                artist = new ArrayList<Metadata.ArtistList.Artist>();
            }
            return this.artist;
        }

        /**
         * Obtient la valeur de la propriété count.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Short getCount() {
            return count;
        }

        /**
         * Définit la valeur de la propriété count.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setCount(Short value) {
            this.count = value;
        }

        /**
         * Obtient la valeur de la propriété offset.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Byte getOffset() {
            return offset;
        }

        /**
         * Définit la valeur de la propriété offset.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setOffset(Byte value) {
            this.offset = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="area" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="begin-area" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="end-area" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="disambiguation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ipi-list" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ipi" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="life-span">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="begin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="ended" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="alias-list" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="alias" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="tag-list" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}long" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "sortName",
            "gender",
            "country",
            "area",
            "beginArea",
            "endArea",
            "disambiguation",
            "ipiList",
            "lifeSpan",
            "aliasList",
            "tagList"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Artist {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String name;
            @XmlElement(name = "sort-name", required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String sortName;
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String gender;
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String country;
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Metadata.ArtistList.Artist.Area area;
            @XmlElement(name = "begin-area")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Metadata.ArtistList.Artist.BeginArea beginArea;
            @XmlElement(name = "end-area")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Metadata.ArtistList.Artist.EndArea endArea;
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String disambiguation;
            @XmlElement(name = "ipi-list")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Metadata.ArtistList.Artist.IpiList ipiList;
            @XmlElement(name = "life-span", required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Metadata.ArtistList.Artist.LifeSpan lifeSpan;
            @XmlElement(name = "alias-list")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Metadata.ArtistList.Artist.AliasList aliasList;
            @XmlElement(name = "tag-list")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Metadata.ArtistList.Artist.TagList tagList;
            @XmlAttribute(name = "id")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String id;
            @XmlAttribute(name = "type")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String type;
            @XmlAttribute(name = "score")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Long score;

            /**
             * Obtient la valeur de la propriété name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getName() {
                return name;
            }

            /**
             * Définit la valeur de la propriété name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtient la valeur de la propriété sortName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getSortName() {
                return sortName;
            }

            /**
             * Définit la valeur de la propriété sortName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setSortName(String value) {
                this.sortName = value;
            }

            /**
             * Obtient la valeur de la propriété gender.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getGender() {
                return gender;
            }

            /**
             * Définit la valeur de la propriété gender.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setGender(String value) {
                this.gender = value;
            }

            /**
             * Obtient la valeur de la propriété country.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getCountry() {
                return country;
            }

            /**
             * Définit la valeur de la propriété country.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setCountry(String value) {
                this.country = value;
            }

            /**
             * Obtient la valeur de la propriété area.
             * 
             * @return
             *     possible object is
             *     {@link Metadata.ArtistList.Artist.Area }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Metadata.ArtistList.Artist.Area getArea() {
                return area;
            }

            /**
             * Définit la valeur de la propriété area.
             * 
             * @param value
             *     allowed object is
             *     {@link Metadata.ArtistList.Artist.Area }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setArea(Metadata.ArtistList.Artist.Area value) {
                this.area = value;
            }

            /**
             * Obtient la valeur de la propriété beginArea.
             * 
             * @return
             *     possible object is
             *     {@link Metadata.ArtistList.Artist.BeginArea }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Metadata.ArtistList.Artist.BeginArea getBeginArea() {
                return beginArea;
            }

            /**
             * Définit la valeur de la propriété beginArea.
             * 
             * @param value
             *     allowed object is
             *     {@link Metadata.ArtistList.Artist.BeginArea }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setBeginArea(Metadata.ArtistList.Artist.BeginArea value) {
                this.beginArea = value;
            }

            /**
             * Obtient la valeur de la propriété endArea.
             * 
             * @return
             *     possible object is
             *     {@link Metadata.ArtistList.Artist.EndArea }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Metadata.ArtistList.Artist.EndArea getEndArea() {
                return endArea;
            }

            /**
             * Définit la valeur de la propriété endArea.
             * 
             * @param value
             *     allowed object is
             *     {@link Metadata.ArtistList.Artist.EndArea }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setEndArea(Metadata.ArtistList.Artist.EndArea value) {
                this.endArea = value;
            }

            /**
             * Obtient la valeur de la propriété disambiguation.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getDisambiguation() {
                return disambiguation;
            }

            /**
             * Définit la valeur de la propriété disambiguation.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setDisambiguation(String value) {
                this.disambiguation = value;
            }

            /**
             * Obtient la valeur de la propriété ipiList.
             * 
             * @return
             *     possible object is
             *     {@link Metadata.ArtistList.Artist.IpiList }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Metadata.ArtistList.Artist.IpiList getIpiList() {
                return ipiList;
            }

            /**
             * Définit la valeur de la propriété ipiList.
             * 
             * @param value
             *     allowed object is
             *     {@link Metadata.ArtistList.Artist.IpiList }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setIpiList(Metadata.ArtistList.Artist.IpiList value) {
                this.ipiList = value;
            }

            /**
             * Obtient la valeur de la propriété lifeSpan.
             * 
             * @return
             *     possible object is
             *     {@link Metadata.ArtistList.Artist.LifeSpan }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Metadata.ArtistList.Artist.LifeSpan getLifeSpan() {
                return lifeSpan;
            }

            /**
             * Définit la valeur de la propriété lifeSpan.
             * 
             * @param value
             *     allowed object is
             *     {@link Metadata.ArtistList.Artist.LifeSpan }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setLifeSpan(Metadata.ArtistList.Artist.LifeSpan value) {
                this.lifeSpan = value;
            }

            /**
             * Obtient la valeur de la propriété aliasList.
             * 
             * @return
             *     possible object is
             *     {@link Metadata.ArtistList.Artist.AliasList }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Metadata.ArtistList.Artist.AliasList getAliasList() {
                return aliasList;
            }

            /**
             * Définit la valeur de la propriété aliasList.
             * 
             * @param value
             *     allowed object is
             *     {@link Metadata.ArtistList.Artist.AliasList }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setAliasList(Metadata.ArtistList.Artist.AliasList value) {
                this.aliasList = value;
            }

            /**
             * Obtient la valeur de la propriété tagList.
             * 
             * @return
             *     possible object is
             *     {@link Metadata.ArtistList.Artist.TagList }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Metadata.ArtistList.Artist.TagList getTagList() {
                return tagList;
            }

            /**
             * Définit la valeur de la propriété tagList.
             * 
             * @param value
             *     allowed object is
             *     {@link Metadata.ArtistList.Artist.TagList }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setTagList(Metadata.ArtistList.Artist.TagList value) {
                this.tagList = value;
            }

            /**
             * Obtient la valeur de la propriété id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getId() {
                return id;
            }

            /**
             * Définit la valeur de la propriété id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtient la valeur de la propriété type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getType() {
                return type;
            }

            /**
             * Définit la valeur de la propriété type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Obtient la valeur de la propriété score.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Long getScore() {
                return score;
            }

            /**
             * Définit la valeur de la propriété score.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setScore(Long value) {
                this.score = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="alias" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "alias"
            })
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class AliasList {

                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected List<Metadata.ArtistList.Artist.AliasList.Alias> alias;

                /**
                 * Gets the value of the alias property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the alias property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAlias().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Metadata.ArtistList.Artist.AliasList.Alias }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public List<Metadata.ArtistList.Artist.AliasList.Alias> getAlias() {
                    if (alias == null) {
                        alias = new ArrayList<Metadata.ArtistList.Artist.AliasList.Alias>();
                    }
                    return this.alias;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public static class Alias {

                    @XmlValue
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String value;
                    @XmlAttribute(name = "sort-name")
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String sortName;

                    /**
                     * Obtient la valeur de la propriété value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Définit la valeur de la propriété value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtient la valeur de la propriété sortName.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    public String getSortName() {
                        return sortName;
                    }

                    /**
                     * Définit la valeur de la propriété sortName.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    public void setSortName(String value) {
                        this.sortName = value;
                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "sortName"
            })
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Area {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String name;
                @XmlElement(name = "sort-name", required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String sortName;
                @XmlAttribute(name = "id")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String id;

                /**
                 * Obtient la valeur de la propriété name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getName() {
                    return name;
                }

                /**
                 * Définit la valeur de la propriété name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Obtient la valeur de la propriété sortName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getSortName() {
                    return sortName;
                }

                /**
                 * Définit la valeur de la propriété sortName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setSortName(String value) {
                    this.sortName = value;
                }

                /**
                 * Obtient la valeur de la propriété id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getId() {
                    return id;
                }

                /**
                 * Définit la valeur de la propriété id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setId(String value) {
                    this.id = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "sortName"
            })
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class BeginArea {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String name;
                @XmlElement(name = "sort-name", required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String sortName;
                @XmlAttribute(name = "id")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String id;

                /**
                 * Obtient la valeur de la propriété name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getName() {
                    return name;
                }

                /**
                 * Définit la valeur de la propriété name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Obtient la valeur de la propriété sortName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getSortName() {
                    return sortName;
                }

                /**
                 * Définit la valeur de la propriété sortName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setSortName(String value) {
                    this.sortName = value;
                }

                /**
                 * Obtient la valeur de la propriété id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getId() {
                    return id;
                }

                /**
                 * Définit la valeur de la propriété id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setId(String value) {
                    this.id = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="sort-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "sortName"
            })
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class EndArea {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String name;
                @XmlElement(name = "sort-name", required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String sortName;
                @XmlAttribute(name = "id")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String id;

                /**
                 * Obtient la valeur de la propriété name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getName() {
                    return name;
                }

                /**
                 * Définit la valeur de la propriété name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Obtient la valeur de la propriété sortName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getSortName() {
                    return sortName;
                }

                /**
                 * Définit la valeur de la propriété sortName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setSortName(String value) {
                    this.sortName = value;
                }

                /**
                 * Obtient la valeur de la propriété id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getId() {
                    return id;
                }

                /**
                 * Définit la valeur de la propriété id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setId(String value) {
                    this.id = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ipi" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ipi"
            })
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class IpiList {

                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected int ipi;

                /**
                 * Obtient la valeur de la propriété ipi.
                 * 
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public int getIpi() {
                    return ipi;
                }

                /**
                 * Définit la valeur de la propriété ipi.
                 * 
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setIpi(int value) {
                    this.ipi = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="begin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="ended" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "begin",
                "end",
                "ended"
            })
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class LifeSpan {

                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String begin;
                @XmlSchemaType(name = "date")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected XMLGregorianCalendar end;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String ended;

                /**
                 * Obtient la valeur de la propriété begin.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getBegin() {
                    return begin;
                }

                /**
                 * Définit la valeur de la propriété begin.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setBegin(String value) {
                    this.begin = value;
                }

                /**
                 * Obtient la valeur de la propriété end.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public XMLGregorianCalendar getEnd() {
                    return end;
                }

                /**
                 * Définit la valeur de la propriété end.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setEnd(XMLGregorianCalendar value) {
                    this.end = value;
                }

                /**
                 * Obtient la valeur de la propriété ended.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getEnded() {
                    return ended;
                }

                /**
                 * Définit la valeur de la propriété ended.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setEnded(String value) {
                    this.ended = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tag"
            })
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class TagList {

                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected List<Metadata.ArtistList.Artist.TagList.Tag> tag;

                /**
                 * Gets the value of the tag property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tag property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTag().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Metadata.ArtistList.Artist.TagList.Tag }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public List<Metadata.ArtistList.Artist.TagList.Tag> getTag() {
                    if (tag == null) {
                        tag = new ArrayList<Metadata.ArtistList.Artist.TagList.Tag>();
                    }
                    return this.tag;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "name"
                })
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public static class Tag {

                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String name;
                    @XmlAttribute(name = "count")
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected Byte count;

                    /**
                     * Obtient la valeur de la propriété name.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    public String getName() {
                        return name;
                    }

                    /**
                     * Définit la valeur de la propriété name.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Obtient la valeur de la propriété count.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    public Byte getCount() {
                        return count;
                    }

                    /**
                     * Définit la valeur de la propriété count.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-10T10:08:35+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    public void setCount(Byte value) {
                        this.count = value;
                    }

                }

            }

        }

    }

}
