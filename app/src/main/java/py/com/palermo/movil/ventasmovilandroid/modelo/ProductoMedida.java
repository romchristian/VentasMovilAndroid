package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 30/01/2015.
 */
public class ProductoMedida {
    @DatabaseField(id = true, canBeNull = false)
    private int ProductosId;
    @DatabaseField(id = true, canBeNull = false)
    private short ProductosUM;
    @DatabaseField
    private String productosUMNombre;
    @DatabaseField
    private int ProductosUMCantidad;
    @DatabaseField(canBeNull = false)
    private long ProductosUMLitros;
    @DatabaseField(canBeNull = false)
    private long ProductosUMKilos;

    public int getProductosId() {
        return ProductosId;
    }

    public void setProductosId(int productosId) {
        ProductosId = productosId;
    }

    public short getProductosUM() {
        return ProductosUM;
    }

    public void setProductosUM(short productosUM) {
        ProductosUM = productosUM;
    }

    public String getProductosUMNombre() {
        return productosUMNombre;
    }

    public void setProductosUMNombre(String productosUMNombre) {
        this.productosUMNombre = productosUMNombre;
    }

    public int getProductosUMCantidad() {
        return ProductosUMCantidad;
    }

    public void setProductosUMCantidad(int productosUMCantidad) {
        ProductosUMCantidad = productosUMCantidad;
    }

    public long getProductosUMLitros() {
        return ProductosUMLitros;
    }

    public void setProductosUMLitros(long productosUMLitros) {
        ProductosUMLitros = productosUMLitros;
    }

    public long getProductosUMKilos() {
        return ProductosUMKilos;
    }

    public void setProductosUMKilos(long productosUMKilos) {
        ProductosUMKilos = productosUMKilos;
    }
}
