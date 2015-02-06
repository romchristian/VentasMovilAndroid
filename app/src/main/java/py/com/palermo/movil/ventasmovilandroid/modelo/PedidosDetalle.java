package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 30/01/2015.
 */
public class PedidosDetalle {

    @DatabaseField(id = true, canBeNull = false)
    public short PedidosCmpId;
    @DatabaseField(id = true, canBeNull = false)
    public int PedidosNumero;
    @DatabaseField(id = true, canBeNull = false)
    public short PedidosDetalleLinea;
    @DatabaseField(canBeNull = false)
    private Producto producto;
    @DatabaseField(canBeNull = false)
    private ProductoMedida productoUM;
    @DatabaseField(canBeNull = false)
    int productoId;
    @DatabaseField(canBeNull = false)
    long pedidosDetalleCantidad;
    @DatabaseField(canBeNull = false)
    long pedidosDetalleTotal;


    //short productosUM;
    @DatabaseField(canBeNull = false)
    String pedidosDetallePromocion;
    @DatabaseField(canBeNull = false)
    public long PedidosDetalleCantidadUMinima;
    @DatabaseField(canBeNull = false)
    public short ImpuestoId;
    @DatabaseField(canBeNull = false)
    public short ImpuestoPorcentaje;
    @DatabaseField(canBeNull = false)
    public long PedidosDetalleDescuentoPorcentaje;
    @DatabaseField(canBeNull = false)
    public long PedidosDetallePrecio;
    @DatabaseField(canBeNull = false)
    public long PedidosDetallePrecioOriginal;
    @DatabaseField(canBeNull = false)
    public long PedidosDetalleDescuento;
    @DatabaseField(canBeNull = false)
    public long PedidosDetalleImpuestos;
    @DatabaseField(canBeNull = false)
    public long PedidosDetalleKilos;
    @DatabaseField(canBeNull = false)
    public long PedidosDetalleLitros;
    @DatabaseField(canBeNull = false)
    public short PreciosId;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public ProductoMedida getProductoUM() {
        return productoUM;
    }

    public void setProductoUM(ProductoMedida productoUM) {
        this.productoUM = productoUM;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public long getPedidosDetalleCantidad() {
        return pedidosDetalleCantidad;
    }

    public void setPedidosDetalleCantidad(long pedidosDetalleCantidad) {
        this.pedidosDetalleCantidad = pedidosDetalleCantidad;
    }

    public long getPedidosDetalleTotal() {
        return pedidosDetalleTotal;
    }

    public void setPedidosDetalleTotal(long pedidosDetalleTotal) {
        this.pedidosDetalleTotal = pedidosDetalleTotal;
    }

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

    public short getPedidosDetalleLinea() {
        return PedidosDetalleLinea;
    }

    public void setPedidosDetalleLinea(short pedidosDetalleLinea) {
        PedidosDetalleLinea = pedidosDetalleLinea;
    }

    public String getPedidosDetallePromocion() {
        return pedidosDetallePromocion;
    }

    public void setPedidosDetallePromocion(String pedidosDetallePromocion) {
        this.pedidosDetallePromocion = pedidosDetallePromocion;
    }

    public long getPedidosDetalleCantidadUMinima() {
        return PedidosDetalleCantidadUMinima;
    }

    public void setPedidosDetalleCantidadUMinima(long pedidosDetalleCantidadUMinima) {
        PedidosDetalleCantidadUMinima = pedidosDetalleCantidadUMinima;
    }

    public short getImpuestoId() {
        return ImpuestoId;
    }

    public void setImpuestoId(short impuestoId) {
        ImpuestoId = impuestoId;
    }

    public short getImpuestoPorcentaje() {
        return ImpuestoPorcentaje;
    }

    public void setImpuestoPorcentaje(short impuestoPorcentaje) {
        ImpuestoPorcentaje = impuestoPorcentaje;
    }

    public long getPedidosDetalleDescuentoPorcentaje() {
        return PedidosDetalleDescuentoPorcentaje;
    }

    public void setPedidosDetalleDescuentoPorcentaje(long pedidosDetalleDescuentoPorcentaje) {
        PedidosDetalleDescuentoPorcentaje = pedidosDetalleDescuentoPorcentaje;
    }

    public long getPedidosDetallePrecio() {
        return PedidosDetallePrecio;
    }

    public void setPedidosDetallePrecio(long pedidosDetallePrecio) {
        PedidosDetallePrecio = pedidosDetallePrecio;
    }

    public long getPedidosDetallePrecioOriginal() {
        return PedidosDetallePrecioOriginal;
    }

    public void setPedidosDetallePrecioOriginal(long pedidosDetallePrecioOriginal) {
        PedidosDetallePrecioOriginal = pedidosDetallePrecioOriginal;
    }

    public long getPedidosDetalleDescuento() {
        return PedidosDetalleDescuento;
    }

    public void setPedidosDetalleDescuento(long pedidosDetalleDescuento) {
        PedidosDetalleDescuento = pedidosDetalleDescuento;
    }

    public long getPedidosDetalleImpuestos() {
        return PedidosDetalleImpuestos;
    }

    public void setPedidosDetalleImpuestos(long pedidosDetalleImpuestos) {
        PedidosDetalleImpuestos = pedidosDetalleImpuestos;
    }

    public long getPedidosDetalleKilos() {
        return PedidosDetalleKilos;
    }

    public void setPedidosDetalleKilos(long pedidosDetalleKilos) {
        PedidosDetalleKilos = pedidosDetalleKilos;
    }

    public long getPedidosDetalleLitros() {
        return PedidosDetalleLitros;
    }

    public void setPedidosDetalleLitros(long pedidosDetalleLitros) {
        PedidosDetalleLitros = pedidosDetalleLitros;
    }

    public short getPreciosId() {
        return PreciosId;
    }

    public void setPreciosId(short preciosId) {
        PreciosId = preciosId;
    }
}
