package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

import java.util.Date;

/**
 * Created by jcolman on 29/01/2015.
 */
public class Encuesta {
    @DatabaseField(id = true, canBeNull = false)
    private int EncuestaId;
    @DatabaseField
    private String EncuestaNombre;
    @DatabaseField
    private Date EncuestaInicio;
    @DatabaseField
    private Date EncuestaFin;
    @DatabaseField
    private String EncuestaEstado;

    public int getEncuestaId() {
        return EncuestaId;
    }

    public void setEncuestaId(int encuestaId) {
        EncuestaId = encuestaId;
    }

    public String getEncuestaNombre() {
        return EncuestaNombre;
    }

    public void setEncuestaNombre(String encuestaNombre) {
        EncuestaNombre = encuestaNombre;
    }

    public Date getEncuestaInicio() {
        return EncuestaInicio;
    }

    public void setEncuestaInicio(Date encuestaInicio) {
        EncuestaInicio = encuestaInicio;
    }

    public Date getEncuestaFin() {
        return EncuestaFin;
    }

    public void setEncuestaFin(Date encuestaFin) {
        EncuestaFin = encuestaFin;
    }

    public String getEncuestaEstado() {
        return EncuestaEstado;
    }

    public void setEncuestaEstado(String encuestaEstado) {
        EncuestaEstado = encuestaEstado;
    }
}
