
package py.com.palermo.movil.ventasmovilandroid.response;

public class Bancos {

    protected Integer bancosId;
    protected String bancosNombre;


    public Integer getBancosId() {
        return bancosId;
    }

    /**
     * Define el valor de la propiedad bancosId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBancosId(Integer value) {
        this.bancosId = value;
    }

    /**
     * Obtiene el valor de la propiedad bancosNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBancosNombre() {
        return bancosNombre;
    }

    /**
     * Define el valor de la propiedad bancosNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBancosNombre(String value) {
        this.bancosNombre = value;
    }

}
