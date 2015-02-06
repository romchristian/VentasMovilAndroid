package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 29/01/2015.
 */
public class Destinos {
    @DatabaseField(id = true, canBeNull = false)
    private int DestinosId;
    @DatabaseField(canBeNull = false)
    private String DestinosDescripcion;

    public int getDestinosId() {
        return DestinosId;
    }

    public void setDestinosId(int destinosId) {
        DestinosId = destinosId;
    }

    public String getDestinosDescripcion() {
        return DestinosDescripcion;
    }

    public void setDestinosDescripcion(String destinosDescripcion) {
        DestinosDescripcion = destinosDescripcion;
    }
}
