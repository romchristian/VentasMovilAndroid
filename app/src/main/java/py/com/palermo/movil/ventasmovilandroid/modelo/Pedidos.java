package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

import java.util.Date;

/**
 * Created by jcolman on 30/01/2015.
 */
public class Pedidos {
    @DatabaseField(id = true, canBeNull = false)
    private short PedidosCmpId;
    @DatabaseField(id = true, canBeNull = false)
    private int PedidosNumero;
    @DatabaseField
    private int ClientesId;
    @DatabaseField
    private Date PedidosFecha;
    @DatabaseField
    private Date PedidosFechaEntrega;
    @DatabaseField
    private Date PedidosFechaDescarga;
    @DatabaseField
    private short VendedorId;
    @DatabaseField
    private String PedidosDescargaEstado;
    @DatabaseField
    private String PedidosEstadoAnulacion;
    @DatabaseField
    private String PedidosTipoComprobante;
    @DatabaseField
    private String PedidosTipoPrecio;
    @DatabaseField
    private int PedidosPreciosId;
    @DatabaseField
    public short MediosPagosId;
    @DatabaseField
    public int DescuentosID;
    @DatabaseField
    public long PedidosTotal;
    @DatabaseField
    public long PedidosPagos;
    @DatabaseField
    public long PedidosSubtotal;
    @DatabaseField
    public long PedidosDescuentos;
    @DatabaseField
    public long PedidosImpuestos;
    @DatabaseField
    public long PedidosLitros;
    @DatabaseField
    public long PedidosKilos;

    public short getPedidosCmpId() {
        return PedidosCmpId;
    }

    public void setPedidosCmpId(short pedidosCmpId) {
        PedidosCmpId = pedidosCmpId;
    }

    public int getPedidosNumero() {
        return PedidosNumero;
    }

    public void setPedidosNumero(int pedidosNumero) {
        PedidosNumero = pedidosNumero;
    }

    public int getClientesId() {
        return ClientesId;
    }

    public void setClientesId(int clientesId) {
        ClientesId = clientesId;
    }

    public Date getPedidosFecha() {
        return PedidosFecha;
    }

    public void setPedidosFecha(Date pedidosFecha) {
        PedidosFecha = pedidosFecha;
    }

    public Date getPedidosFechaEntrega() {
        return PedidosFechaEntrega;
    }

    public void setPedidosFechaEntrega(Date pedidosFechaEntrega) {
        PedidosFechaEntrega = pedidosFechaEntrega;
    }

    public Date getPedidosFechaDescarga() {
        return PedidosFechaDescarga;
    }

    public void setPedidosFechaDescarga(Date pedidosFechaDescarga) {
        PedidosFechaDescarga = pedidosFechaDescarga;
    }

    public short getVendedorId() {
        return VendedorId;
    }

    public void setVendedorId(short vendedorId) {
        VendedorId = vendedorId;
    }

    public String getPedidosDescargaEstado() {
        return PedidosDescargaEstado;
    }

    public void setPedidosDescargaEstado(String pedidosDescargaEstado) {
        PedidosDescargaEstado = pedidosDescargaEstado;
    }

    public String getPedidosEstadoAnulacion() {
        return PedidosEstadoAnulacion;
    }

    public void setPedidosEstadoAnulacion(String pedidosEstadoAnulacion) {
        PedidosEstadoAnulacion = pedidosEstadoAnulacion;
    }

    public String getPedidosTipoComprobante() {
        return PedidosTipoComprobante;
    }

    public void setPedidosTipoComprobante(String pedidosTipoComprobante) {
        PedidosTipoComprobante = pedidosTipoComprobante;
    }

    public String getPedidosTipoPrecio() {
        return PedidosTipoPrecio;
    }

    public void setPedidosTipoPrecio(String pedidosTipoPrecio) {
        PedidosTipoPrecio = pedidosTipoPrecio;
    }

    public int getPedidosPreciosId() {
        return PedidosPreciosId;
    }

    public void setPedidosPreciosId(int pedidosPreciosId) {
        PedidosPreciosId = pedidosPreciosId;
    }

    public short getMediosPagosId() {
        return MediosPagosId;
    }

    public void setMediosPagosId(short mediosPagosId) {
        MediosPagosId = mediosPagosId;
    }

    public int getDescuentosID() {
        return DescuentosID;
    }

    public void setDescuentosID(int descuentosID) {
        DescuentosID = descuentosID;
    }

    public long getPedidosTotal() {
        return PedidosTotal;
    }

    public void setPedidosTotal(long pedidosTotal) {
        PedidosTotal = pedidosTotal;
    }

    public long getPedidosPagos() {
        return PedidosPagos;
    }

    public void setPedidosPagos(long pedidosPagos) {
        PedidosPagos = pedidosPagos;
    }

    public long getPedidosSubtotal() {
        return PedidosSubtotal;
    }

    public void setPedidosSubtotal(long pedidosSubtotal) {
        PedidosSubtotal = pedidosSubtotal;
    }

    public long getPedidosDescuentos() {
        return PedidosDescuentos;
    }

    public void setPedidosDescuentos(long pedidosDescuentos) {
        PedidosDescuentos = pedidosDescuentos;
    }

    public long getPedidosImpuestos() {
        return PedidosImpuestos;
    }

    public void setPedidosImpuestos(long pedidosImpuestos) {
        PedidosImpuestos = pedidosImpuestos;
    }

    public long getPedidosLitros() {
        return PedidosLitros;
    }

    public void setPedidosLitros(long pedidosLitros) {
        PedidosLitros = pedidosLitros;
    }

    public long getPedidosKilos() {
        return PedidosKilos;
    }

    public void setPedidosKilos(long pedidosKilos) {
        PedidosKilos = pedidosKilos;
    }
}
