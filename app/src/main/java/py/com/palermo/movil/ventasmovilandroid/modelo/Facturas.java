package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

import java.util.Date;

/**
 * Created by jcolman on 29/01/2015.
 */
public class Facturas {
    @DatabaseField(id = true, canBeNull = false)
    private int CmpId;
    @DatabaseField(id = true, canBeNull = false)
    private int numero;
    @DatabaseField(id = true, canBeNull = false)
    private short PuntoDeExpedicion;
    @DatabaseField
    private Date fecha;
    @DatabaseField
    private Date Vencimiento;
    @DatabaseField
    private int ClientesId;
    @DatabaseField
    private String TipoComprobante;
    @DatabaseField
    private String TipoPrecio;
    @DatabaseField
    private long Subtotal;
    @DatabaseField
    private long Descuento;
    @DatabaseField
    private long Impuesto;
    @DatabaseField
    private long total;
    @DatabaseField
    private long Pagos;
    @DatabaseField
    private String EstadoDescarga;
    @DatabaseField
    private String EstadoImpresion;
    @DatabaseField
    private String EstadoAnulacion;
    @DatabaseField
    private String Pendientes;
    @DatabaseField
    private short VendedorId;
    @DatabaseField
    private String GpsLat;
    @DatabaseField
    private String GpsLong;

    public int getCmpId() {
        return CmpId;
    }

    public void setCmpId(int cmpId) {
        CmpId = cmpId;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public short getPuntoDeExpedicion() {
        return PuntoDeExpedicion;
    }

    public void setPuntoDeExpedicion(short puntoDeExpedicion) {
        PuntoDeExpedicion = puntoDeExpedicion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        Vencimiento = vencimiento;
    }

    public int getClientesId() {
        return ClientesId;
    }

    public void setClientesId(int clientesId) {
        ClientesId = clientesId;
    }

    public String getTipoComprobante() {
        return TipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        TipoComprobante = tipoComprobante;
    }

    public String getTipoPrecio() {
        return TipoPrecio;
    }

    public void setTipoPrecio(String tipoPrecio) {
        TipoPrecio = tipoPrecio;
    }

    public long getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(long subtotal) {
        Subtotal = subtotal;
    }

    public long getDescuento() {
        return Descuento;
    }

    public void setDescuento(long descuento) {
        Descuento = descuento;
    }

    public long getImpuesto() {
        return Impuesto;
    }

    public void setImpuesto(long impuesto) {
        Impuesto = impuesto;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getPagos() {
        return Pagos;
    }

    public void setPagos(long pagos) {
        Pagos = pagos;
    }

    public String getEstadoDescarga() {
        return EstadoDescarga;
    }

    public void setEstadoDescarga(String estadoDescarga) {
        EstadoDescarga = estadoDescarga;
    }

    public String getEstadoImpresion() {
        return EstadoImpresion;
    }

    public void setEstadoImpresion(String estadoImpresion) {
        EstadoImpresion = estadoImpresion;
    }

    public String getEstadoAnulacion() {
        return EstadoAnulacion;
    }

    public void setEstadoAnulacion(String estadoAnulacion) {
        EstadoAnulacion = estadoAnulacion;
    }

    public String getPendientes() {
        return Pendientes;
    }

    public void setPendientes(String pendientes) {
        Pendientes = pendientes;
    }

    public short getVendedorId() {
        return VendedorId;
    }

    public void setVendedorId(short vendedorId) {
        VendedorId = vendedorId;
    }

    public String getGpsLat() {
        return GpsLat;
    }

    public void setGpsLat(String gpsLat) {
        GpsLat = gpsLat;
    }

    public String getGpsLong() {
        return GpsLong;
    }

    public void setGpsLong(String gpsLong) {
        GpsLong = gpsLong;
    }
}
