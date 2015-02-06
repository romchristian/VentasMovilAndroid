package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 15/01/2015.
 */
public class CantMaximaPromoCliente {
    @DatabaseField(id = true, canBeNull = false)
    private int productoId;
    @DatabaseField(id = true, canBeNull = false)
    private int clienteId;
    @DatabaseField
    private int cantidad;

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
