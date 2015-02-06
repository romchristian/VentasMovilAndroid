package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 30/01/2015.
 */
public class Precio {
    @DatabaseField(id = true, canBeNull = false)
    private int PreciosDesde;
    @DatabaseField(id = true, canBeNull = false)
    private int PreciosHasta;
    @DatabaseField
    private long PreciosImporte;
    @DatabaseField(id = true, canBeNull = false)
    private short PreciosPreciosID;
    @DatabaseField(id = true, canBeNull = false)
    private int ProductoId;
    @DatabaseField(id = true, canBeNull = false)
    private short ProductosUM;

    public int getPreciosDesde() {
        return PreciosDesde;
    }

    public void setPreciosDesde(int preciosDesde) {
        PreciosDesde = preciosDesde;
    }

    public int getPreciosHasta() {
        return PreciosHasta;
    }

    public void setPreciosHasta(int preciosHasta) {
        PreciosHasta = preciosHasta;
    }

    public long getPreciosImporte() {
        return PreciosImporte;
    }

    public void setPreciosImporte(long preciosImporte) {
        PreciosImporte = preciosImporte;
    }

    public short getPreciosPreciosID() {
        return PreciosPreciosID;
    }

    public void setPreciosPreciosID(short preciosPreciosID) {
        PreciosPreciosID = preciosPreciosID;
    }

    public int getProductoId() {
        return ProductoId;
    }

    public void setProductoId(int productoId) {
        ProductoId = productoId;
    }

    public short getProductosUM() {
        return ProductosUM;
    }

    public void setProductosUM(short productosUM) {
        ProductosUM = productosUM;
    }
}
