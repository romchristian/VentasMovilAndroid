
package py.com.palermo.movil.ventasmovilandroid.response;

import java.util.ArrayList;
import java.util.List;

public class ComposicionPromoResponse {

    protected int codRetorno;

    protected List<ComposicionPromo> composicionesPromo;

    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad codRetorno.
     * 
     */
    public int getCodRetorno() {
        return codRetorno;
    }

    /**
     * Define el valor de la propiedad codRetorno.
     * 
     */
    public void setCodRetorno(int value) {
        this.codRetorno = value;
    }

    /**
     * Gets the value of the composicionesPromo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the composicionesPromo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComposicionesPromo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComposicionPromo }
     * 
     * 
     */
    public List<ComposicionPromo> getComposicionesPromo() {
        if (composicionesPromo == null) {
            composicionesPromo = new ArrayList<ComposicionPromo>();
        }
        return this.composicionesPromo;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
