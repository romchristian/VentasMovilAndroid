package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 30/01/2015.
 */
public class Marcas {
    @DatabaseField(id = true, canBeNull = false)
    private String marcasDescripcion;
    @DatabaseField(canBeNull = false)
    private short marcasId;
    @DatabaseField(canBeNull = false)
    private short MarcasOrden;

    public String getMarcasDescripcion() {
        return marcasDescripcion;
    }

    public void setMarcasDescripcion(String marcasDescripcion) {
        this.marcasDescripcion = marcasDescripcion;
    }

    public short getMarcasId() {
        return marcasId;
    }

    public void setMarcasId(short marcasId) {
        this.marcasId = marcasId;
    }

    public short getMarcasOrden() {
        return MarcasOrden;
    }

    public void setMarcasOrden(short marcasOrden) {
        MarcasOrden = marcasOrden;
    }
}
