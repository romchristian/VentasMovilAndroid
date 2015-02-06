package py.com.palermo.movil.ventasmovilandroid.modelo;

import java.util.Date;

/**
 * Created by jcolman on 19/01/2015.
 */
public class CobroDetalle {
    private int FacturasCmpId;
    private int FacturasNumero;
    private int FacturasValorLinea;
    private MediosPagos tipo;

    private int facturasValorNumero ;
    private Date FactuasValorFecha;
    private Bancos banco;
    private String FacturasCuentaBancoNro;
    private String observacion;
    private Date factuasValorVencimiento;
    private long FacturasValorImporte;
    public short VendedorId;


    public int getFacturasCmpId() {
        return FacturasCmpId;
    }

    public void setFacturasCmpId(int facturasCmpId) {
        FacturasCmpId = facturasCmpId;
    }

    public int getFacturasNumero() {
        return FacturasNumero;
    }

    public void setFacturasNumero(int facturasNumero) {
        FacturasNumero = facturasNumero;
    }

    public int getFacturasValorLinea() {
        return FacturasValorLinea;
    }

    public void setFacturasValorLinea(int facturasValorLinea) {
        FacturasValorLinea = facturasValorLinea;
    }

    public MediosPagos getTipo() {
        return tipo;
    }

    public void setTipo(MediosPagos tipo) {
        this.tipo = tipo;
    }

    public int getFacturasValorNumero() {
        return facturasValorNumero;
    }

    public void setFacturasValorNumero(int facturasValorNumero) {
        this.facturasValorNumero = facturasValorNumero;
    }

    public Date getFactuasValorFecha() {
        return FactuasValorFecha;
    }

    public void setFactuasValorFecha(Date factuasValorFecha) {
        FactuasValorFecha = factuasValorFecha;
    }

    public Bancos getBanco() {
        return banco;
    }

    public void setBanco(Bancos banco) {
        this.banco = banco;
    }

    public String getFacturasCuentaBancoNro() {
        return FacturasCuentaBancoNro;
    }

    public void setFacturasCuentaBancoNro(String facturasCuentaBancoNro) {
        FacturasCuentaBancoNro = facturasCuentaBancoNro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFactuasValorVencimiento() {
        return factuasValorVencimiento;
    }

    public void setFactuasValorVencimiento(Date factuasValorVencimiento) {
        this.factuasValorVencimiento = factuasValorVencimiento;
    }

    public long getFacturasValorImporte() {
        return FacturasValorImporte;
    }

    public void setFacturasValorImporte(long facturasValorImporte) {
        FacturasValorImporte = facturasValorImporte;
    }

    public short getVendedorId() {
        return VendedorId;
    }

    public void setVendedorId(short vendedorId) {
        VendedorId = vendedorId;
    }
}
