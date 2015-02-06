
package py.com.palermo.movil.ventasmovilandroid.response;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;



public class Facturas {


    protected Integer clientesId;

    protected short descuentosProductosId;
    protected short empresasId;
    protected short facturasCmpId;
    protected List<FacturasCobros> facturascobrosList;
    protected BigDecimal facturasDescuento;
    protected List<FacturasDetalle> facturasdetalleList;
    protected String facturasEstadoAnulacion;
    protected String facturasEstadoDescarga;
    protected String facturasEstadoImpresion;
    protected XMLGregorianCalendar facturasFecha;
    protected String facturasGpsLat;
    protected String facturasGpsLong;
    protected BigDecimal facturasImpuesto;
    protected int facturasNumero;
    protected BigDecimal facturasPagos;
    protected String facturasPendientes;
    protected short facturasPuntoExpedicionNro;
    protected BigDecimal facturasSubTotal;
    protected String facturasTipoComprobante;
    protected String facturasTipoPrecio;
    protected BigDecimal facturasTotal;
    protected XMLGregorianCalendar facturasVencimiento;
    protected short sucursalesId;
    protected short vendedorId;

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
     * Obtiene el valor de la propiedad descuentosProductosId.
     * 
     */
    public short getDescuentosProductosId() {
        return descuentosProductosId;
    }

    /**
     * Define el valor de la propiedad descuentosProductosId.
     * 
     */
    public void setDescuentosProductosId(short value) {
        this.descuentosProductosId = value;
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
     * Obtiene el valor de la propiedad facturasCmpId.
     * 
     */
    public short getFacturasCmpId() {
        return facturasCmpId;
    }

    /**
     * Define el valor de la propiedad facturasCmpId.
     * 
     */
    public void setFacturasCmpId(short value) {
        this.facturasCmpId = value;
    }

    /**
     * Gets the value of the facturascobrosList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facturascobrosList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturascobrosList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturasCobros }
     * 
     * 
     */
    public List<FacturasCobros> getFacturascobrosList() {
        if (facturascobrosList == null) {
            facturascobrosList = new ArrayList<FacturasCobros>();
        }
        return this.facturascobrosList;
    }

    /**
     * Obtiene el valor de la propiedad facturasDescuento.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getFacturasDescuento() {
        return facturasDescuento;
    }

    /**
     * Define el valor de la propiedad facturasDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setFacturasDescuento(BigDecimal value) {
        this.facturasDescuento = value;
    }

    /**
     * Gets the value of the facturasdetalleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facturasdetalleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturasdetalleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturasDetalle }
     * 
     * 
     */
    public List<FacturasDetalle> getFacturasdetalleList() {
        if (facturasdetalleList == null) {
            facturasdetalleList = new ArrayList<FacturasDetalle>();
        }
        return this.facturasdetalleList;
    }

    /**
     * Obtiene el valor de la propiedad facturasEstadoAnulacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturasEstadoAnulacion() {
        return facturasEstadoAnulacion;
    }

    /**
     * Define el valor de la propiedad facturasEstadoAnulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturasEstadoAnulacion(String value) {
        this.facturasEstadoAnulacion = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasEstadoDescarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturasEstadoDescarga() {
        return facturasEstadoDescarga;
    }

    /**
     * Define el valor de la propiedad facturasEstadoDescarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturasEstadoDescarga(String value) {
        this.facturasEstadoDescarga = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasEstadoImpresion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturasEstadoImpresion() {
        return facturasEstadoImpresion;
    }

    /**
     * Define el valor de la propiedad facturasEstadoImpresion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturasEstadoImpresion(String value) {
        this.facturasEstadoImpresion = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasFecha.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFacturasFecha() {
        return facturasFecha;
    }

    /**
     * Define el valor de la propiedad facturasFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setFacturasFecha(XMLGregorianCalendar value) {
        this.facturasFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasGpsLat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturasGpsLat() {
        return facturasGpsLat;
    }

    /**
     * Define el valor de la propiedad facturasGpsLat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturasGpsLat(String value) {
        this.facturasGpsLat = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasGpsLong.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturasGpsLong() {
        return facturasGpsLong;
    }

    /**
     * Define el valor de la propiedad facturasGpsLong.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturasGpsLong(String value) {
        this.facturasGpsLong = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getFacturasImpuesto() {
        return facturasImpuesto;
    }

    /**
     * Define el valor de la propiedad facturasImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setFacturasImpuesto(BigDecimal value) {
        this.facturasImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasNumero.
     * 
     */
    public int getFacturasNumero() {
        return facturasNumero;
    }

    /**
     * Define el valor de la propiedad facturasNumero.
     * 
     */
    public void setFacturasNumero(int value) {
        this.facturasNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasPagos.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getFacturasPagos() {
        return facturasPagos;
    }

    /**
     * Define el valor de la propiedad facturasPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setFacturasPagos(BigDecimal value) {
        this.facturasPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasPendientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturasPendientes() {
        return facturasPendientes;
    }

    /**
     * Define el valor de la propiedad facturasPendientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturasPendientes(String value) {
        this.facturasPendientes = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasPuntoExpedicionNro.
     * 
     */
    public short getFacturasPuntoExpedicionNro() {
        return facturasPuntoExpedicionNro;
    }

    /**
     * Define el valor de la propiedad facturasPuntoExpedicionNro.
     * 
     */
    public void setFacturasPuntoExpedicionNro(short value) {
        this.facturasPuntoExpedicionNro = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasSubTotal.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getFacturasSubTotal() {
        return facturasSubTotal;
    }

    /**
     * Define el valor de la propiedad facturasSubTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setFacturasSubTotal(BigDecimal value) {
        this.facturasSubTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasTipoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturasTipoComprobante() {
        return facturasTipoComprobante;
    }

    /**
     * Define el valor de la propiedad facturasTipoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturasTipoComprobante(String value) {
        this.facturasTipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasTipoPrecio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturasTipoPrecio() {
        return facturasTipoPrecio;
    }

    /**
     * Define el valor de la propiedad facturasTipoPrecio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturasTipoPrecio(String value) {
        this.facturasTipoPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasTotal.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getFacturasTotal() {
        return facturasTotal;
    }

    /**
     * Define el valor de la propiedad facturasTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setFacturasTotal(BigDecimal value) {
        this.facturasTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFacturasVencimiento() {
        return facturasVencimiento;
    }

    /**
     * Define el valor de la propiedad facturasVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setFacturasVencimiento(XMLGregorianCalendar value) {
        this.facturasVencimiento = value;
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
     */
    public short getVendedorId() {
        return vendedorId;
    }

    /**
     * Define el valor de la propiedad vendedorId.
     * 
     */
    public void setVendedorId(short value) {
        this.vendedorId = value;
    }

}
