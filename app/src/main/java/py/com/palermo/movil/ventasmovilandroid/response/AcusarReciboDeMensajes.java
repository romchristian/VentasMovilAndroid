
package py.com.palermo.movil.ventasmovilandroid.response;

import java.util.ArrayList;
import java.util.List;



public class AcusarReciboDeMensajes {


    protected List<Long> mensajesId;
    protected int pocketId;

    /**
     * Gets the value of the mensajesId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mensajesId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMensajesId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getMensajesId() {
        if (mensajesId == null) {
            mensajesId = new ArrayList<Long>();
        }
        return this.mensajesId;
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
