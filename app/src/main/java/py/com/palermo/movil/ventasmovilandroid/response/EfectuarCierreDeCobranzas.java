
package py.com.palermo.movil.ventasmovilandroid.response;


public class EfectuarCierreDeCobranzas {

    protected int cantCobranzas;
    protected double montoCobrado;
    protected int pocketId;

    /**
     * Obtiene el valor de la propiedad cantCobranzas.
     * 
     */
    public int getCantCobranzas() {
        return cantCobranzas;
    }

    /**
     * Define el valor de la propiedad cantCobranzas.
     * 
     */
    public void setCantCobranzas(int value) {
        this.cantCobranzas = value;
    }

    /**
     * Obtiene el valor de la propiedad montoCobrado.
     * 
     */
    public double getMontoCobrado() {
        return montoCobrado;
    }

    /**
     * Define el valor de la propiedad montoCobrado.
     * 
     */
    public void setMontoCobrado(double value) {
        this.montoCobrado = value;
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
