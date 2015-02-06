
package py.com.palermo.movil.ventasmovilandroid.response;

public class Destinos {


    protected String destinosDescripcion;

    protected short destinosId;

    protected short empresasId;

    /**
     * Obtiene el valor de la propiedad destinosDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinosDescripcion() {
        return destinosDescripcion;
    }

    /**
     * Define el valor de la propiedad destinosDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinosDescripcion(String value) {
        this.destinosDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad destinosId.
     * 
     */
    public short getDestinosId() {
        return destinosId;
    }

    /**
     * Define el valor de la propiedad destinosId.
     * 
     */
    public void setDestinosId(short value) {
        this.destinosId = value;
    }

    /**
     * Obtiene el valor de la propiedad empresasId.
     * 
     */
    public short getEmpresasId() {
        return empresasId;
    }

    /**
     * Define el valor de la propiedad empresasId.
     * 
     */
    public void setEmpresasId(short value) {
        this.empresasId = value;
    }

}
