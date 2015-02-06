
package py.com.palermo.movil.ventasmovilandroid.response;

import java.util.ArrayList;
import java.util.List;

public class SaboresResponse {

    protected int codRetorno;
    protected String mensaje;
    protected List<Sabores> sabores;

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

    /**
     * Gets the value of the sabores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sabores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSabores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sabores }
     * 
     * 
     */
    public List<Sabores> getSabores() {
        if (sabores == null) {
            sabores = new ArrayList<Sabores>();
        }
        return this.sabores;
    }

}
