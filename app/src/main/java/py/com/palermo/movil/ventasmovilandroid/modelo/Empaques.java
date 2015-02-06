package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 28/01/2015.
 */
public class Empaques {
    @DatabaseField(id = true, canBeNull = false)
    private short empaquesId;
    @DatabaseField(id = true, canBeNull = false)
    private String empaquesDescripcion;

    @DatabaseField(id = true, canBeNull = false)
    private short EmpaquesOrden;

    public String getEmpaquesDescripcion() {
        return empaquesDescripcion;
    }

    public void setEmpaquesDescripcion(String empaquesDescripcion) {
        this.empaquesDescripcion = empaquesDescripcion;
    }

    public short getEmpaquesId() {
        return empaquesId;
    }

    public void setEmpaquesId(short empaquesId) {
        this.empaquesId = empaquesId;
    }

    public short getEmpaquesOrden() {
        return EmpaquesOrden;
    }

    public void setEmpaquesOrden(short empaquesOrden) {
        EmpaquesOrden = empaquesOrden;
    }
}
