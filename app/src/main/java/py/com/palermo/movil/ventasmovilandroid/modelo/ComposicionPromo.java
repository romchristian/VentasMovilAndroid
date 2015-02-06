package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 26/01/2015.
 */
public class ComposicionPromo {
    @DatabaseField(id = true, canBeNull = false)
    private int productoIdKit;
    @DatabaseField(id = true, canBeNull = false)
    private int productoId;
    @DatabaseField(id = true, canBeNull = false)
    private int cantidadProducto;
    @DatabaseField
    private int imprimible;

    public int getProductoIdKit() {
        return productoIdKit;
    }

    public void setProductoIdKit(int productoIdKit) {
        this.productoIdKit = productoIdKit;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getImprimible() {
        return imprimible;
    }

    public void setImprimible(int imprimible) {
        this.imprimible = imprimible;
    }
}
