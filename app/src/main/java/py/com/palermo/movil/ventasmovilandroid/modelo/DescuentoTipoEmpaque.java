package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 26/01/2015.
 */
public class DescuentoTipoEmpaque {
    @DatabaseField(id = true, canBeNull = false)
    private int DescuentosID;
    @DatabaseField(id = true, canBeNull = false)
    private short TipoEmpaqueId;
    @DatabaseField(id = true, canBeNull = false)
    private short ProductoMedidaId;
    @DatabaseField(id = true, canBeNull = false)
    private int DescEmpaqueDesde;
    @DatabaseField(id = true, canBeNull = false)
    private int DescEmpaqueHasta;
    @DatabaseField(canBeNull = false)
    private long DescEmpaquePor;
    @DatabaseField(canBeNull = false)
    private long DescEmpaqueImporte;

    public int getDescuentosID() {
        return DescuentosID;
    }

    public void setDescuentosID(int descuentosID) {
        DescuentosID = descuentosID;
    }

    public short getTipoEmpaqueId() {
        return TipoEmpaqueId;
    }

    public void setTipoEmpaqueId(short tipoEmpaqueId) {
        TipoEmpaqueId = tipoEmpaqueId;
    }

    public short getProductoMedidaId() {
        return ProductoMedidaId;
    }

    public void setProductoMedidaId(short productoMedidaId) {
        ProductoMedidaId = productoMedidaId;
    }

    public int getDescEmpaqueDesde() {
        return DescEmpaqueDesde;
    }

    public void setDescEmpaqueDesde(int descEmpaqueDesde) {
        DescEmpaqueDesde = descEmpaqueDesde;
    }

    public int getDescEmpaqueHasta() {
        return DescEmpaqueHasta;
    }

    public void setDescEmpaqueHasta(int descEmpaqueHasta) {
        DescEmpaqueHasta = descEmpaqueHasta;
    }

    public long getDescEmpaquePor() {
        return DescEmpaquePor;
    }

    public void setDescEmpaquePor(long descEmpaquePor) {
        DescEmpaquePor = descEmpaquePor;
    }

    public long getDescEmpaqueImporte() {
        return DescEmpaqueImporte;
    }

    public void setDescEmpaqueImporte(long descEmpaqueImporte) {
        DescEmpaqueImporte = descEmpaqueImporte;
    }
}
