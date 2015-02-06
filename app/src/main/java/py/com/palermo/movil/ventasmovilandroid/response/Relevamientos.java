
package py.com.palermo.movil.ventasmovilandroid.response;


import javax.xml.datatype.XMLGregorianCalendar;

public class Relevamientos {

    protected int clientesId;
    protected short empresasId;
    protected Integer motivosNoVentasId;
    protected Short relevamientosEstadoDescarga;
    protected XMLGregorianCalendar relevamientosFecha;
    protected short sucursalesId;
    protected short vendedoresId;

    /**
     * Obtiene el valor de la propiedad clientesId.
     * 
     */
    public int getClientesId() {
        return clientesId;
    }

    /**
     * Define el valor de la propiedad clientesId.
     * 
     */
    public void setClientesId(int value) {
        this.clientesId = value;
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
     * Obtiene el valor de la propiedad motivosNoVentasId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMotivosNoVentasId() {
        return motivosNoVentasId;
    }

    /**
     * Define el valor de la propiedad motivosNoVentasId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMotivosNoVentasId(Integer value) {
        this.motivosNoVentasId = value;
    }

    /**
     * Obtiene el valor de la propiedad relevamientosEstadoDescarga.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRelevamientosEstadoDescarga() {
        return relevamientosEstadoDescarga;
    }

    /**
     * Define el valor de la propiedad relevamientosEstadoDescarga.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRelevamientosEstadoDescarga(Short value) {
        this.relevamientosEstadoDescarga = value;
    }

    /**
     * Obtiene el valor de la propiedad relevamientosFecha.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRelevamientosFecha() {
        return relevamientosFecha;
    }

    /**
     * Define el valor de la propiedad relevamientosFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setRelevamientosFecha(XMLGregorianCalendar value) {
        this.relevamientosFecha = value;
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

    /**
     * Obtiene el valor de la propiedad vendedoresId.
     * 
     */
    public short getVendedoresId() {
        return vendedoresId;
    }

    /**
     * Define el valor de la propiedad vendedoresId.
     * 
     */
    public void setVendedoresId(short value) {
        this.vendedoresId = value;
    }

}
