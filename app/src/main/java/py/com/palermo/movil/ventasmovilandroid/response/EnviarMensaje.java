
package py.com.palermo.movil.ventasmovilandroid.response;


public class EnviarMensaje {

    protected Mensajes nuevo;
    protected int pocketId;

    /**
     * Obtiene el valor de la propiedad nuevo.
     * 
     * @return
     *     possible object is
     *     {@link Mensajes }
     *     
     */
    public Mensajes getNuevo() {
        return nuevo;
    }

    /**
     * Define el valor de la propiedad nuevo.
     * 
     * @param value
     *     allowed object is
     *     {@link Mensajes }
     *     
     */
    public void setNuevo(Mensajes value) {
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
