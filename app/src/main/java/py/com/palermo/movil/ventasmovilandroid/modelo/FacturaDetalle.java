package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 30/01/2015.
 */
public class FacturaDetalle {

    @DatabaseField(id = true, canBeNull = false)
    public int FacturasCmpId;
    @DatabaseField(id = true, canBeNull = false)
    public int FacturasLinea;
    @DatabaseField(id = true, canBeNull = false)
    public int FacturasNumero;
    @DatabaseField
    int cantidad;
    @DatabaseField
    long facturaPrecios;
    @DatabaseField
    public long FacturasDescuentoPorcentaje;
    @DatabaseField
    public int FacturasImpuestoPorcentaje;
    @DatabaseField
    long facturasLineaSubtotal;
    @DatabaseField
    long facturasLineaDescuento;
    @DatabaseField
    long facturasLineaImpuesto;
    @DatabaseField
    long facturasLineaTotal;
    @DatabaseField
    public int DescuentosId;
    @DatabaseField
    public int FacturasCantidadUMinima;
    @DatabaseField
    public int PreciosID;
    @DatabaseField
    public int ImpuestoId;
    @DatabaseField
    public Producto producto;
    @DatabaseField
    public long FacturaPreciosOriginal;
    @DatabaseField
    public ProductoMedida ProductoUM;
    @DatabaseField
    public int PromoPlm3;
    @DatabaseField
    public int PromoId;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getFacturaPrecios() {
        return facturaPrecios;
    }

    public void setFacturaPrecios(long facturaPrecios) {
        this.facturaPrecios = facturaPrecios;
    }

    public long getFacturasDescuentoPorcentaje() {
        return FacturasDescuentoPorcentaje;
    }

    public void setFacturasDescuentoPorcentaje(long facturasDescuentoPorcentaje) {
        FacturasDescuentoPorcentaje = facturasDescuentoPorcentaje;
    }

    public int getFacturasImpuestoPorcentaje() {
        return FacturasImpuestoPorcentaje;
    }

    public void setFacturasImpuestoPorcentaje(int facturasImpuestoPorcentaje) {
        FacturasImpuestoPorcentaje = facturasImpuestoPorcentaje;
    }

    public int getFacturasLinea() {
        return FacturasLinea;
    }

    public void setFacturasLinea(int facturasLinea) {
        FacturasLinea = facturasLinea;
    }

    public long getFacturasLineaSubtotal() {
        return facturasLineaSubtotal;
    }

    public void setFacturasLineaSubtotal(long facturasLineaSubtotal) {
        this.facturasLineaSubtotal = facturasLineaSubtotal;
    }

    public long getFacturasLineaDescuento() {
        return facturasLineaDescuento;
    }

    public void setFacturasLineaDescuento(long facturasLineaDescuento) {
        this.facturasLineaDescuento = facturasLineaDescuento;
    }

    public long getFacturasLineaImpuesto() {
        return facturasLineaImpuesto;
    }

    public void setFacturasLineaImpuesto(long facturasLineaImpuesto) {
        this.facturasLineaImpuesto = facturasLineaImpuesto;
    }

    public long getFacturasLineaTotal() {
        return facturasLineaTotal;
    }

    public void setFacturasLineaTotal(long facturasLineaTotal) {
        this.facturasLineaTotal = facturasLineaTotal;
    }

    public int getFacturasCmpId() {
        return FacturasCmpId;
    }

    public void setFacturasCmpId(int facturasCmpId) {
        FacturasCmpId = facturasCmpId;
    }

    public int getDescuentosId() {
        return DescuentosId;
    }

    public void setDescuentosId(int descuentosId) {
        DescuentosId = descuentosId;
    }

    public int getFacturasNumero() {
        return FacturasNumero;
    }

    public void setFacturasNumero(int facturasNumero) {
        FacturasNumero = facturasNumero;
    }

    public int getFacturasCantidadUMinima() {
        return FacturasCantidadUMinima;
    }

    public void setFacturasCantidadUMinima(int facturasCantidadUMinima) {
        FacturasCantidadUMinima = facturasCantidadUMinima;
    }

    public int getPreciosID() {
        return PreciosID;
    }

    public void setPreciosID(int preciosID) {
        PreciosID = preciosID;
    }

    public int getImpuestoId() {
        return ImpuestoId;
    }

    public void setImpuestoId(int impuestoId) {
        ImpuestoId = impuestoId;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public long getFacturaPreciosOriginal() {
        return FacturaPreciosOriginal;
    }

    public void setFacturaPreciosOriginal(long facturaPreciosOriginal) {
        FacturaPreciosOriginal = facturaPreciosOriginal;
    }

    public ProductoMedida getProductoUM() {
        return ProductoUM;
    }

    public void setProductoUM(ProductoMedida productoUM) {
        ProductoUM = productoUM;
    }

    public int getPromoPlm3() {
        return PromoPlm3;
    }

    public void setPromoPlm3(int promoPlm3) {
        PromoPlm3 = promoPlm3;
    }

    public int getPromoId() {
        return PromoId;
    }

    public void setPromoId(int promoId) {
        PromoId = promoId;
    }
}
