
package py.com.palermo.movil.ventasmovilandroid.response;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


public class Cobranzas {


    protected Integer clientesId;

    protected short cobranzasCmpId;

    protected List<CobranzasCobros> cobranzascobrosList;

    protected List<CobranzasDetalle> cobranzasdetalleList;


    protected Integer cobranzasEstadoAnulacion;


    protected Integer cobranzasEstadoDescarga;


    protected XMLGregorianCalendar cobranzasFecha;

    protected String cobranzasGpsLat;

    protected String cobranzasGpsLong;

    protected int cobranzasNumero;

    protected BigDecimal cobranzasTotal;

    protected short empresasId;

    protected short sucursalesId;

    protected Integer vendedorId;

    /**
     * Obtiene el valor de la propiedad clientesId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientesId() {
        return clientesId;
    }

    /**
     * Define el valor de la propiedad clientesId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientesId(Integer value) {
        this.clientesId = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasCmpId.
     * 
     */
    public short getCobranzasCmpId() {
        return cobranzasCmpId;
    }

    /**
     * Define el valor de la propiedad cobranzasCmpId.
     * 
     */
    public void setCobranzasCmpId(short value) {
        this.cobranzasCmpId = value;
    }

    /**
     * Gets the value of the cobranzascobrosList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobranzascobrosList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCobranzascobrosList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CobranzasCobros }
     * 
     * 
     */
    public List<CobranzasCobros> getCobranzascobrosList() {
        if (cobranzascobrosList == null) {
            cobranzascobrosList = new ArrayList<CobranzasCobros>();
        }
        return this.cobranzascobrosList;
    }

    /**
     * Gets the value of the cobranzasdetalleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobranzasdetalleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCobranzasdetalleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CobranzasDetalle }
     * 
     * 
     */
    public List<CobranzasDetalle> getCobranzasdetalleList() {
        if (cobranzasdetalleList == null) {
            cobranzasdetalleList = new ArrayList<CobranzasDetalle>();
        }
        return this.cobranzasdetalleList;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasEstadoAnulacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCobranzasEstadoAnulacion() {
        return cobranzasEstadoAnulacion;
    }

    /**
     * Define el valor de la propiedad cobranzasEstadoAnulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCobranzasEstadoAnulacion(Integer value) {
        this.cobranzasEstadoAnulacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasEstadoDescarga.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCobranzasEstadoDescarga() {
        return cobranzasEstadoDescarga;
    }

    /**
     * Define el valor de la propiedad cobranzasEstadoDescarga.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCobranzasEstadoDescarga(Integer value) {
        this.cobranzasEstadoDescarga = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasFecha.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCobranzasFecha() {
        return cobranzasFecha;
    }

    /**
     * Define el valor de la propiedad cobranzasFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setCobranzasFecha(XMLGregorianCalendar value) {
        this.cobranzasFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasGpsLat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobranzasGpsLat() {
        return cobranzasGpsLat;
    }

    /**
     * Define el valor de la propiedad cobranzasGpsLat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobranzasGpsLat(String value) {
        this.cobranzasGpsLat = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasGpsLong.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobranzasGpsLong() {
        return cobranzasGpsLong;
    }

    /**
     * Define el valor de la propiedad cobranzasGpsLong.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobranzasGpsLong(String value) {
        this.cobranzasGpsLong = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasNumero.
     * 
     */
    public int getCobranzasNumero() {
        return cobranzasNumero;
    }

    /**
     * Define el valor de la propiedad cobranzasNumero.
     * 
     */
    public void setCobranzasNumero(int value) {
        this.cobranzasNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasTotal.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getCobranzasTotal() {
        return cobranzasTotal;
    }

    /**
     * Define el valor de la propiedad cobranzasTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setCobranzasTotal(BigDecimal value) {
        this.cobranzasTotal = value;
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
     * Obtiene el valor de la propiedad vendedorId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendedorId() {
        return vendedorId;
    }

    /**
     * Define el valor de la propiedad vendedorId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendedorId(Integer value) {
        this.vendedorId = value;
    }

}
