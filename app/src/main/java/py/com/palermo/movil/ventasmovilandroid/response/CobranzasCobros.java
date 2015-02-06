
package py.com.palermo.movil.ventasmovilandroid.response;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;



public class CobranzasCobros {


    protected Short bancoId;
    protected Cobranzas cobranzas;

    protected short cobranzasCmpId;

    protected String cobranzasCuentaBanco;


    protected XMLGregorianCalendar cobranzasFechaValor;

    protected int cobranzasLinea;

    protected int cobranzasNumero;

    protected BigDecimal cobranzasValorImporte;

    protected Integer cobranzasValorNumero;

    protected String cobranzasValorObservacion;
    protected XMLGregorianCalendar cobranzasValorVencimiento;

    protected short empresasId;

    protected Short mediosPagosId;

    protected short sucursalesId;

    /**
     * Obtiene el valor de la propiedad bancoId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBancoId() {
        return bancoId;
    }

    /**
     * Define el valor de la propiedad bancoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBancoId(Short value) {
        this.bancoId = value;
    }

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
     * Obtiene el valor de la propiedad cobranzasCuentaBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobranzasCuentaBanco() {
        return cobranzasCuentaBanco;
    }

    /**
     * Define el valor de la propiedad cobranzasCuentaBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobranzasCuentaBanco(String value) {
        this.cobranzasCuentaBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasFechaValor.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCobranzasFechaValor() {
        return cobranzasFechaValor;
    }

    /**
     * Define el valor de la propiedad cobranzasFechaValor.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setCobranzasFechaValor(XMLGregorianCalendar value) {
        this.cobranzasFechaValor = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasLinea.
     * 
     */
    public int getCobranzasLinea() {
        return cobranzasLinea;
    }

    /**
     * Define el valor de la propiedad cobranzasLinea.
     * 
     */
    public void setCobranzasLinea(int value) {
        this.cobranzasLinea = value;
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
     * Obtiene el valor de la propiedad cobranzasValorImporte.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getCobranzasValorImporte() {
        return cobranzasValorImporte;
    }

    /**
     * Define el valor de la propiedad cobranzasValorImporte.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setCobranzasValorImporte(BigDecimal value) {
        this.cobranzasValorImporte = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasValorNumero.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCobranzasValorNumero() {
        return cobranzasValorNumero;
    }

    /**
     * Define el valor de la propiedad cobranzasValorNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCobranzasValorNumero(Integer value) {
        this.cobranzasValorNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasValorObservacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobranzasValorObservacion() {
        return cobranzasValorObservacion;
    }

    /**
     * Define el valor de la propiedad cobranzasValorObservacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobranzasValorObservacion(String value) {
        this.cobranzasValorObservacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cobranzasValorVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCobranzasValorVencimiento() {
        return cobranzasValorVencimiento;
    }

    /**
     * Define el valor de la propiedad cobranzasValorVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setCobranzasValorVencimiento(XMLGregorianCalendar value) {
        this.cobranzasValorVencimiento = value;
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
     * Obtiene el valor de la propiedad mediosPagosId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMediosPagosId() {
        return mediosPagosId;
    }

    /**
     * Define el valor de la propiedad mediosPagosId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMediosPagosId(Short value) {
        this.mediosPagosId = value;
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
