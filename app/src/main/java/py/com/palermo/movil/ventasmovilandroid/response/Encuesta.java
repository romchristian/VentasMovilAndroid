
package py.com.palermo.movil.ventasmovilandroid.response;

import javax.xml.datatype.XMLGregorianCalendar;

public class Encuesta {


    protected String encuestaEstado;


    protected XMLGregorianCalendar encuestaFin;

    protected Long encuestaId;


    protected XMLGregorianCalendar encuestaInicio;

    protected String encuestaNombre;

    /**
     * Obtiene el valor de la propiedad encuestaEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncuestaEstado() {
        return encuestaEstado;
    }

    /**
     * Define el valor de la propiedad encuestaEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncuestaEstado(String value) {
        this.encuestaEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad encuestaFin.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEncuestaFin() {
        return encuestaFin;
    }

    /**
     * Define el valor de la propiedad encuestaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setEncuestaFin(XMLGregorianCalendar value) {
        this.encuestaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad encuestaId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEncuestaId() {
        return encuestaId;
    }

    /**
     * Define el valor de la propiedad encuestaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEncuestaId(Long value) {
        this.encuestaId = value;
    }

    /**
     * Obtiene el valor de la propiedad encuestaInicio.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEncuestaInicio() {
        return encuestaInicio;
    }

    /**
     * Define el valor de la propiedad encuestaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setEncuestaInicio(XMLGregorianCalendar value) {
        this.encuestaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad encuestaNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncuestaNombre() {
        return encuestaNombre;
    }

    /**
     * Define el valor de la propiedad encuestaNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncuestaNombre(String value) {
        this.encuestaNombre = value;
    }

}
