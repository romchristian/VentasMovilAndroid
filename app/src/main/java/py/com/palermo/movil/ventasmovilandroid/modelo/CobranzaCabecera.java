package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jcolman on 15/01/2015.
 */
public class CobranzaCabecera implements Serializable {

    @DatabaseField(id = true, canBeNull = false)
    private int CobranzasCmpId;
    @DatabaseField(id = true, canBeNull = false)
    private int CobranzasNumero;
    @DatabaseField
    private int ClientesId;
    @DatabaseField
    private Date CobranzasFecha;
    @DatabaseField
    private long CobranzasTotal;
    @DatabaseField
    private int VendedorId;
    @DatabaseField
    private String CobranzaEstadoAnulacion;
    @DatabaseField
    private String CobranzasEstadoDescarga;
    @DatabaseField
    private String GpsLat;
    @DatabaseField
    private String GpsLong;

    public int getCobranzasCmpId() {
        return CobranzasCmpId;
    }

    public void setCobranzasCmpId(int cobranzasCmpId) {
        CobranzasCmpId = cobranzasCmpId;
    }

    public int getCobranzasNumero() {
        return CobranzasNumero;
    }

    public void setCobranzasNumero(int cobranzasNumero) {
        CobranzasNumero = cobranzasNumero;
    }

    public int getClientesId() {
        return ClientesId;
    }

    public void setClientesId(int clientesId) {
        ClientesId = clientesId;
    }

    public Date getCobranzasFecha() {
        return CobranzasFecha;
    }

    public void setCobranzasFecha(Date cobranzasFecha) {
        CobranzasFecha = cobranzasFecha;
    }

    public long getCobranzasTotal() {
        return CobranzasTotal;
    }

    public void setCobranzasTotal(long cobranzasTotal) {
        CobranzasTotal = cobranzasTotal;
    }

    public int getVendedorId() {
        return VendedorId;
    }

    public void setVendedorId(int vendedorId) {
        VendedorId = vendedorId;
    }

    public String getCobranzaEstadoAnulacion() {
        return CobranzaEstadoAnulacion;
    }

    public void setCobranzaEstadoAnulacion(String cobranzaEstadoAnulacion) {
        CobranzaEstadoAnulacion = cobranzaEstadoAnulacion;
    }

    public String getCobranzasEstadoDescarga() {
        return CobranzasEstadoDescarga;
    }

    public void setCobranzasEstadoDescarga(String cobranzasEstadoDescarga) {
        CobranzasEstadoDescarga = cobranzasEstadoDescarga;
    }

    public String getGpsLat() {
        return GpsLat;
    }

    public void setGpsLat(String gpsLat) {
        GpsLat = gpsLat;
    }

    public String getGpsLong() {
        return GpsLong;
    }

    public void setGpsLong(String gpsLong) {
        GpsLong = gpsLong;
    }

}
