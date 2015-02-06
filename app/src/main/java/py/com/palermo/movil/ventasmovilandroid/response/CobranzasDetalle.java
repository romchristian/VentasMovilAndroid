
package py.com.palermo.movil.ventasmovilandroid.response;

import java.math.BigDecimal;

public class CobranzasDetalle {

    protected Cobranzas cobranzas;

    protected short cobranzasCmpId;

    protected int cobranzasNumero;

    protected BigDecimal cobranzasPago;

    protected short empresasId;
    protected Facturas facturas;

    protected short facturasCmpId;

    protected int facturasNumero;

    protected short facturasPuntoExpedicionNro;

    protected short sucursalesId;

    protected short vendedorId;

    /**
     * Obtiene el valor de la propiedad cobranzas.
     * 
     * @return
     *     possible object is
     *     {@link Cobranzas }
     *     
     */
    public Cobranzas getCobranzas() {
        return cobranzas;
    }

    /**
     * Define el valor de la propiedad cobranzas.
     * 
     * @param value
     *     allowed object is
     *     {@link Cobranzas }
     *     
     */
    public void setCobranzas(Cobranzas value) {
        this.cobranzas = value;
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
     * Obtiene el valor de la propiedad cobranzasPago.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getCobranzasPago() {
        return cobranzasPago;
    }

    /**
     * Define el valor de la propiedad cobranzasPago.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setCobranzasPago(BigDecimal value) {
        this.cobranzasPago = value;
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
     * Obtiene el valor de la propiedad facturas.
     * 
     * @return
     *     possible object is
     *     {@link Facturas }
     *     
     */
    public Facturas getFacturas() {
        return facturas;
    }

    /**
     * Define el valor de la propiedad facturas.
     * 
     * @param value
     *     allowed object is
     *     {@link Facturas }
     *     
     */
    public void setFacturas(Facturas value) {
        this.facturas = value;
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
