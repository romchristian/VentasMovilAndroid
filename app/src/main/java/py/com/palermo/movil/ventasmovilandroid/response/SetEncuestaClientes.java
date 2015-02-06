
package py.com.palermo.movil.ventasmovilandroid.response;

public class SetEncuestaClientes {

    protected long encuestaId;
    protected String clave;

    /**
     * Obtiene el valor de la propiedad encuestaId.
     * 
     */
    public long getEncuestaId() {
        return encuestaId;
    }

    /**
     * Define el valor de la propiedad encuestaId.
     * 
     */
    public void setEncuestaId(long value) {
        this.encuestaId = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

}
