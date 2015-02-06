package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by jcolman on 15/01/2015.
 */
public class Cliente {
    @DatabaseField(id = true, canBeNull = false)
    private int clientesId;
    @DatabaseField
    private String clientesNombre;
    @DatabaseField
    private String clientesRuc;
    @DatabaseField
    private String clientesPropietario;
    @DatabaseField
    private String clientesTelefono;
    @DatabaseField
    private String clientesDireccion;
    @DatabaseField
    private int ClientesCambiaPrecio;
    @DatabaseField
    private int ClientesContadoId;
    @DatabaseField
    private int ClientesCreditoId;
    @DatabaseField
    private double ClientesLimiteDeCredito;
    @DatabaseField
    private double ClientesSaldo;
    @DatabaseField
    private int ClientesPlazo;
    @DatabaseField
    private int DescuentosId;
    @DatabaseField
    private int CanalesId;
    @DatabaseField
    private int CanalesEstado;
    @DatabaseField
    private String ClientesSinc;
    @DatabaseField
    private int PromoPlm3;
    @DatabaseField
    private String Mayorista;
    @DatabaseField
    private long EncuestaId;
    @DatabaseField
    private int EncuestaEstado;
    @DatabaseField
    private String clientesMensaje;
    @DatabaseField
    public String nombreComercial;

    public int getClientesId() {
        return clientesId;
    }

    public void setClientesId(int clientesId) {
        this.clientesId = clientesId;
    }

    public String getClientesNombre() {
        return clientesNombre;
    }

    public void setClientesNombre(String clientesNombre) {
        this.clientesNombre = clientesNombre;
    }

    public String getClientesRuc() {
        return clientesRuc;
    }

    public void setClientesRuc(String clientesRuc) {
        this.clientesRuc = clientesRuc;
    }

    public String getClientesPropietario() {
        return clientesPropietario;
    }

    public void setClientesPropietario(String clientesPropietario) {
        this.clientesPropietario = clientesPropietario;
    }

    public String getClientesTelefono() {
        return clientesTelefono;
    }

    public void setClientesTelefono(String clientesTelefono) {
        this.clientesTelefono = clientesTelefono;
    }

    public String getClientesDireccion() {
        return clientesDireccion;
    }

    public void setClientesDireccion(String clientesDireccion) {
        this.clientesDireccion = clientesDireccion;
    }

    public int getClientesCambiaPrecio() {
        return ClientesCambiaPrecio;
    }

    public void setClientesCambiaPrecio(int clientesCambiaPrecio) {
        ClientesCambiaPrecio = clientesCambiaPrecio;
    }

    public int getClientesContadoId() {
        return ClientesContadoId;
    }

    public void setClientesContadoId(int clientesContadoId) {
        ClientesContadoId = clientesContadoId;
    }

    public int getClientesCreditoId() {
        return ClientesCreditoId;
    }

    public void setClientesCreditoId(int clientesCreditoId) {
        ClientesCreditoId = clientesCreditoId;
    }

    public double getClientesLimiteDeCredito() {
        return ClientesLimiteDeCredito;
    }

    public void setClientesLimiteDeCredito(double clientesLimiteDeCredito) {
        ClientesLimiteDeCredito = clientesLimiteDeCredito;
    }

    public double getClientesSaldo() {
        return ClientesSaldo;
    }

    public void setClientesSaldo(double clientesSaldo) {
        ClientesSaldo = clientesSaldo;
    }

    public int getClientesPlazo() {
        return ClientesPlazo;
    }

    public void setClientesPlazo(int clientesPlazo) {
        ClientesPlazo = clientesPlazo;
    }

    public int getDescuentosId() {
        return DescuentosId;
    }

    public void setDescuentosId(int descuentosId) {
        DescuentosId = descuentosId;
    }

    public int getCanalesId() {
        return CanalesId;
    }

    public void setCanalesId(int canalesId) {
        CanalesId = canalesId;
    }

    public int getCanalesEstado() {
        return CanalesEstado;
    }

    public void setCanalesEstado(int canalesEstado) {
        CanalesEstado = canalesEstado;
    }

    public String getClientesSinc() {
        return ClientesSinc;
    }

    public void setClientesSinc(String clientesSinc) {
        ClientesSinc = clientesSinc;
    }

    public int getPromoPlm3() {
        return PromoPlm3;
    }

    public void setPromoPlm3(int promoPlm3) {
        PromoPlm3 = promoPlm3;
    }

    public String getMayorista() {
        return Mayorista;
    }

    public void setMayorista(String mayorista) {
        Mayorista = mayorista;
    }

    public long getEncuestaId() {
        return EncuestaId;
    }

    public void setEncuestaId(long encuestaId) {
        EncuestaId = encuestaId;
    }

    public int getEncuestaEstado() {
        return EncuestaEstado;
    }

    public void setEncuestaEstado(int encuestaEstado) {
        EncuestaEstado = encuestaEstado;
    }

    public String getClientesMensaje() {
        return clientesMensaje;
    }

    public void setClientesMensaje(String clientesMensaje) {
        this.clientesMensaje = clientesMensaje;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }



}
