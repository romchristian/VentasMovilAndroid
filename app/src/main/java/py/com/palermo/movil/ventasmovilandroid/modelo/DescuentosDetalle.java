package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 28/01/2015.
 */
public class DescuentosDetalle {
    @DatabaseField(id = true, canBeNull = false)
    private int DescuentosId;
    @DatabaseField(id = true, canBeNull = false)
    private int ProductoId;
    @DatabaseField(id = true, canBeNull = false)
    private short ProductosUM;
    @DatabaseField(canBeNull = false)
    private int DescuentosDetalleInicial;
    @DatabaseField(canBeNull = false)
    private int DescuentosDetalleFinal;
    @DatabaseField(canBeNull = false)
    private long DescuentosDetallePorcentaje;
    @DatabaseField(canBeNull = false)
    private long DescuentosDetalleImporte;

    public int getDescuentosId() {
        return DescuentosId;
    }

    public void setDescuentosId(int descuentosId) {
        DescuentosId = descuentosId;
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

    public int getDescuentosDetalleInicial() {
        return DescuentosDetalleInicial;
    }

    public void setDescuentosDetalleInicial(int descuentosDetalleInicial) {
        DescuentosDetalleInicial = descuentosDetalleInicial;
    }

    public int getDescuentosDetalleFinal() {
        return DescuentosDetalleFinal;
    }

    public void setDescuentosDetalleFinal(int descuentosDetalleFinal) {
        DescuentosDetalleFinal = descuentosDetalleFinal;
    }

    public long getDescuentosDetallePorcentaje() {
        return DescuentosDetallePorcentaje;
    }

    public void setDescuentosDetallePorcentaje(long descuentosDetallePorcentaje) {
        DescuentosDetallePorcentaje = descuentosDetallePorcentaje;
    }

    public long getDescuentosDetalleImporte() {
        return DescuentosDetalleImporte;
    }

    public void setDescuentosDetalleImporte(long descuentosDetalleImporte) {
        DescuentosDetalleImporte = descuentosDetalleImporte;
    }
}
