
package py.com.palermo.movil.ventasmovilandroid.response;

import java.util.ArrayList;
import java.util.List;
public class SetFactura {

    protected Facturas cabecera;
    protected List<FacturasDetalle> detalle;
    protected List<FacturasCobros> cobros;
    protected int pocketId;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link Facturas }
     *     
     */
    public Facturas getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link Facturas }
     *     
     */
    public void setCabecera(Facturas value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the detalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturasDetalle }
     * 
     * 
     */
    public List<FacturasDetalle> getDetalle() {
        if (detalle == null) {
            detalle = new ArrayList<FacturasDetalle>();
        }
        return this.detalle;
    }

    /**
     * Gets the value of the cobros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCobros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturasCobros }
     * 
     * 
     */
    public List<FacturasCobros> getCobros() {
        if (cobros == null) {
            cobros = new ArrayList<FacturasCobros>();
        }
        return this.cobros;
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
