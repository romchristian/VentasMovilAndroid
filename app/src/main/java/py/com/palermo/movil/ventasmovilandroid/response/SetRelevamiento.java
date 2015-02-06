
package py.com.palermo.movil.ventasmovilandroid.response;

public class SetRelevamiento {

    protected Relevamientos nuevo;
    protected int pocketId;

    /**
     * Obtiene el valor de la propiedad nuevo.
     * 
     * @return
     *     possible object is
     *     {@link Relevamientos }
     *     
     */
    public Relevamientos getNuevo() {
        return nuevo;
    }

    /**
     * Define el valor de la propiedad nuevo.
     * 
     * @param value
     *     allowed object is
     *     {@link Relevamientos }
     *     
     */
    public void setNuevo(Relevamientos value) {
        this.nuevo = value;
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
