package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 15/01/2015.
 */
public class Canal {
    @DatabaseField(id = true)
    private int CanalId;
    @DatabaseField
    private String CanalDescripcion;

    public int getCanalId() {
        return CanalId;
    }

    public void setCanalId(int canalId) {
        CanalId = canalId;
    }

    public String getCanalDescripcion() {
        return CanalDescripcion;
    }

    public void setCanalDescripcion(String canalDescripcion) {
        CanalDescripcion = canalDescripcion;
    }
}
