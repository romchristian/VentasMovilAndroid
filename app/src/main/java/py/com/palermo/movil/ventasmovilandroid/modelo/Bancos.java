package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 21/01/2015.
 */
public class Bancos {
    @DatabaseField(id = true, canBeNull = false)
    private int BancoId;
    @DatabaseField(canBeNull = false)
    private String BancoNombre;

    public String getBancoNombre() {
        return BancoNombre;
    }

    public void setBancoNombre(String bancoNombre) {
        BancoNombre = bancoNombre;
    }

    public int getBancoId() {
        return BancoId;
    }

    public void setBancoId(int bancoId) {
        BancoId = bancoId;
    }
}
