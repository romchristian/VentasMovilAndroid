package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 29/01/2015.
 */
public class Descuentos {
    @DatabaseField(id = true, canBeNull = false)
    private int DescuentosID;
    @DatabaseField(canBeNull = false)
    private String DescuentosDescripcion;
    @DatabaseField(canBeNull = false)
    private int DescuentosTipo;

    public int getDescuentosID() {
        return DescuentosID;
    }

    public void setDescuentosID(int descuentosID) {
        DescuentosID = descuentosID;
    }

    public String getDescuentosDescripcion() {
        return DescuentosDescripcion;
    }

    public void setDescuentosDescripcion(String descuentosDescripcion) {
        DescuentosDescripcion = descuentosDescripcion;
    }

    public int getDescuentosTipo() {
        return DescuentosTipo;
    }

    public void setDescuentosTipo(int descuentosTipo) {
        DescuentosTipo = descuentosTipo;
    }
}
