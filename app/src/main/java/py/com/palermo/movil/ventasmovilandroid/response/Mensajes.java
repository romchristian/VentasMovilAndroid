
package py.com.palermo.movil.ventasmovilandroid.response;

import javax.xml.datatype.XMLGregorianCalendar;


public class Mensajes {

    protected short mensajesDestino;
    protected int mensajesEstado;
    protected XMLGregorianCalendar mensajesFecha;
    protected Integer mensajesId;
    protected Short mensajesMinutosValidez;
    protected short mensajesOrigen;
    protected String mensajesTexto;
    protected Short mensajesTipo;

    /**
     * Obtiene el valor de la propiedad mensajesDestino.
     * 
     */
    public short getMensajesDestino() {
        return mensajesDestino;
    }

    /**
     * Define el valor de la propiedad mensajesDestino.
     * 
     */
    public void setMensajesDestino(short value) {
        this.mensajesDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajesEstado.
     * 
     */
    public int getMensajesEstado() {
        return mensajesEstado;
    }

    /**
     * Define el valor de la propiedad mensajesEstado.
     * 
     */
    public void setMensajesEstado(int value) {
        this.mensajesEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajesFecha.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMensajesFecha() {
        return mensajesFecha;
    }

    /**
     * Define el valor de la propiedad mensajesFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setMensajesFecha(XMLGregorianCalendar value) {
        this.mensajesFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajesId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMensajesId() {
        return mensajesId;
    }

    /**
     * Define el valor de la propiedad mensajesId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMensajesId(Integer value) {
        this.mensajesId = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajesMinutosValidez.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMensajesMinutosValidez() {
        return mensajesMinutosValidez;
    }

    /**
     * Define el valor de la propiedad mensajesMinutosValidez.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMensajesMinutosValidez(Short value) {
        this.mensajesMinutosValidez = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajesOrigen.
     * 
     */
    public short getMensajesOrigen() {
        return mensajesOrigen;
    }

    /**
     * Define el valor de la propiedad mensajesOrigen.
     * 
     */
    public void setMensajesOrigen(short value) {
        this.mensajesOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajesTexto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajesTexto() {
        return mensajesTexto;
    }

    /**
     * Define el valor de la propiedad mensajesTexto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajesTexto(String value) {
        this.mensajesTexto = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajesTipo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMensajesTipo() {
        return mensajesTipo;
    }

    /**
     * Define el valor de la propiedad mensajesTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMensajesTipo(Short value) {
        this.mensajesTipo = value;
    }

}
