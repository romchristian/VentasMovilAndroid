
package py.com.palermo.movil.ventasmovilandroid.response;

import javax.xml.datatype.XMLGregorianCalendar;

public class Respuesta {

    protected long clienteId;
    protected short empresasId;
    protected long encuestaId;
    protected long opcionId;
    protected long preguntaId;
    protected XMLGregorianCalendar respFecha;
    protected int respValorNumerico;
    protected String respValorTexto;
    protected Long respuestaId;
    protected short sucursalesId;

    /**
     * Obtiene el valor de la propiedad clienteId.
     * 
     */
    public long getClienteId() {
        return clienteId;
    }

    /**
     * Define el valor de la propiedad clienteId.
     * 
     */
    public void setClienteId(long value) {
        this.clienteId = value;
    }

    /**
     * Obtiene el valor de la propiedad empresasId.
     * 
     */
    public short getEmpresasId() {
        return empresasId;
    }

    /**
     * Define el valor de la propiedad empresasId.
     * 
     */
    public void setEmpresasId(short value) {
        this.empresasId = value;
    }

    /**
     * Obtiene el valor de la propiedad encuestaId.
     * 
     */
    public long getEncuestaId() {
        return encuestaId;
    }

    /**
     * Define el valor de la propiedad encuestaId.
     * 
     */
    public void setEncuestaId(long value) {
        this.encuestaId = value;
    }

    /**
     * Obtiene el valor de la propiedad opcionId.
     * 
     */
    public long getOpcionId() {
        return opcionId;
    }

    /**
     * Define el valor de la propiedad opcionId.
     * 
     */
    public void setOpcionId(long value) {
        this.opcionId = value;
    }

    /**
     * Obtiene el valor de la propiedad preguntaId.
     * 
     */
    public long getPreguntaId() {
        return preguntaId;
    }

    /**
     * Define el valor de la propiedad preguntaId.
     * 
     */
    public void setPreguntaId(long value) {
        this.preguntaId = value;
    }

    /**
     * Obtiene el valor de la propiedad respFecha.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRespFecha() {
        return respFecha;
    }

    /**
     * Define el valor de la propiedad respFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setRespFecha(XMLGregorianCalendar value) {
        this.respFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad respValorNumerico.
     * 
     */
    public int getRespValorNumerico() {
        return respValorNumerico;
    }

    /**
     * Define el valor de la propiedad respValorNumerico.
     * 
     */
    public void setRespValorNumerico(int value) {
        this.respValorNumerico = value;
    }

    /**
     * Obtiene el valor de la propiedad respValorTexto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespValorTexto() {
        return respValorTexto;
    }

    /**
     * Define el valor de la propiedad respValorTexto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespValorTexto(String value) {
        this.respValorTexto = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestaId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRespuestaId() {
        return respuestaId;
    }

    /**
     * Define el valor de la propiedad respuestaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRespuestaId(Long value) {
        this.respuestaId = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursalesId.
     * 
     */
    public short getSucursalesId() {
        return sucursalesId;
    }

    /**
     * Define el valor de la propiedad sucursalesId.
     * 
     */
    public void setSucursalesId(short value) {
        this.sucursalesId = value;
    }

}
