
package py.com.palermo.movil.ventasmovilandroid.response;

import java.util.ArrayList;
import java.util.List;

public class SetRespuestas {

    protected List<Respuesta> respuestas;
    protected int pocketId;

    /**
     * Gets the value of the respuestas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respuestas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespuestas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Respuesta }
     * 
     * 
     */
    public List<Respuesta> getRespuestas() {
        if (respuestas == null) {
            respuestas = new ArrayList<Respuesta>();
        }
        return this.respuestas;
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
