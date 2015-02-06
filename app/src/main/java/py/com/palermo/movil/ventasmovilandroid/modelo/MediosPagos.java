package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 26/01/2015.
 */
public class MediosPagos {

    private int empresasIdField;
    @DatabaseField(id = true, canBeNull = false)
    private int mediosPagosId;
    @DatabaseField
    private String mediosPagosNombreAbr;
    @DatabaseField
    private int mediosPagosTipo;

    private int sucursalesId;

    public int getEmpresasIdField() {
        return empresasIdField;
    }

    public void setEmpresasIdField(int empresasIdField) {
        this.empresasIdField = empresasIdField;
    }

    public int getMediosPagosId() {
        return mediosPagosId;
    }

    public void setMediosPagosId(int mediosPagosId) {
        this.mediosPagosId = mediosPagosId;
    }

    public String getMediosPagosNombreAbr() {
        return mediosPagosNombreAbr;
    }

    public void setMediosPagosNombreAbr(String mediosPagosNombreAbr) {
        this.mediosPagosNombreAbr = mediosPagosNombreAbr;
    }

    public int getMediosPagosTipo() {
        return mediosPagosTipo;
    }

    public void setMediosPagosTipo(int mediosPagosTipo) {
        this.mediosPagosTipo = mediosPagosTipo;
    }

    public int getSucursalesId() {
        return sucursalesId;
    }

    public void setSucursalesId(int sucursalesId) {
        this.sucursalesId = sucursalesId;
    }


}
