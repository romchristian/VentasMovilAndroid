
package py.com.palermo.movil.ventasmovilandroid.response;

public class EfectuarCierreDeFacturas {

    protected int cantFacturas;
    protected double montoFacturado;
    protected int pocketId;

    /**
     * Obtiene el valor de la propiedad cantFacturas.
     * 
     */
    public int getCantFacturas() {
        return cantFacturas;
    }

    /**
     * Define el valor de la propiedad cantFacturas.
     * 
     */
    public void setCantFacturas(int value) {
        this.cantFacturas = value;
    }

    /**
     * Obtiene el valor de la propiedad montoFacturado.
     * 
     */
    public double getMontoFacturado() {
        return montoFacturado;
    }

    /**
     * Define el valor de la propiedad montoFacturado.
     * 
     */
    public void setMontoFacturado(double value) {
        this.montoFacturado = value;
    }

    /**
     * Obtiene el valor de la propiedad pocketId.
     * 
     */
    public int getPocketId() {
        return pocketId;
    }

    /**
     * Define el valor de la propiedad pocketId.
     * 
     */
    public void setPocketId(int value) {
        this.pocketId = value;
    }

}
