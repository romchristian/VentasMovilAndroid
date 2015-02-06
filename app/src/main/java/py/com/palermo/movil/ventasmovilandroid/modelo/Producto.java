package py.com.palermo.movil.ventasmovilandroid.modelo;

import com.j256.ormlite.field.DatabaseField;

import java.util.Date;

/**
 * Created by jcolman on 30/01/2015.
 */
public class Producto {
    @DatabaseField(id = true, canBeNull = false)
    private int ProductoId;
    @DatabaseField
    private String productoNombre;
    @DatabaseField
    private int ProductoImpuestoId;
    @DatabaseField
    private int ProductoUnidadiEstandar;
    @DatabaseField
    private long productoCantidadVentdida;
    @DatabaseField
    private float productoDescuentoPorc;
    @DatabaseField
    private int ProductoGrupo;
    @DatabaseField
    private int ProductoImpuestoPorcentaje;
    @DatabaseField
    private int productosStock;
    @DatabaseField
    private short TiposEmpaquesId;
    @DatabaseField
    private short MarcasId;
    @DatabaseField
    private short SaboresId;
    @DatabaseField
    private short EmpaquesId;
    @DatabaseField
    private int PromoPlm3;
    @DatabaseField
    private String codigoBarra;
    @DatabaseField
    private int productoKit;
    @DatabaseField
    private Date productoVigenciaPromo;

    public int getProductoId() {
        return ProductoId;
    }

    public void setProductoId(int productoId) {
        ProductoId = productoId;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public int getProductoImpuestoId() {
        return ProductoImpuestoId;
    }

    public void setProductoImpuestoId(int productoImpuestoId) {
        ProductoImpuestoId = productoImpuestoId;
    }

    public int getProductoUnidadiEstandar() {
        return ProductoUnidadiEstandar;
    }

    public void setProductoUnidadiEstandar(int productoUnidadiEstandar) {
        ProductoUnidadiEstandar = productoUnidadiEstandar;
    }

    public long getProductoCantidadVentdida() {
        return productoCantidadVentdida;
    }

    public void setProductoCantidadVentdida(long productoCantidadVentdida) {
        this.productoCantidadVentdida = productoCantidadVentdida;
    }

    public float getProductoDescuentoPorc() {
        return productoDescuentoPorc;
    }

    public void setProductoDescuentoPorc(float productoDescuentoPorc) {
        this.productoDescuentoPorc = productoDescuentoPorc;
    }

    public int getProductoGrupo() {
        return ProductoGrupo;
    }

    public void setProductoGrupo(int productoGrupo) {
        ProductoGrupo = productoGrupo;
    }

    public int getProductoImpuestoPorcentaje() {
        return ProductoImpuestoPorcentaje;
    }

    public void setProductoImpuestoPorcentaje(int productoImpuestoPorcentaje) {
        ProductoImpuestoPorcentaje = productoImpuestoPorcentaje;
    }

    public int getProductosStock() {
        return productosStock;
    }

    public void setProductosStock(int productosStock) {
        this.productosStock = productosStock;
    }

    public short getTiposEmpaquesId() {
        return TiposEmpaquesId;
    }

    public void setTiposEmpaquesId(short tiposEmpaquesId) {
        TiposEmpaquesId = tiposEmpaquesId;
    }

    public short getMarcasId() {
        return MarcasId;
    }

    public void setMarcasId(short marcasId) {
        MarcasId = marcasId;
    }

    public short getSaboresId() {
        return SaboresId;
    }

    public void setSaboresId(short saboresId) {
        SaboresId = saboresId;
    }

    public short getEmpaquesId() {
        return EmpaquesId;
    }

    public void setEmpaquesId(short empaquesId) {
        EmpaquesId = empaquesId;
    }

    public int getPromoPlm3() {
        return PromoPlm3;
    }

    public void setPromoPlm3(int promoPlm3) {
        PromoPlm3 = promoPlm3;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public int getProductoKit() {
        return productoKit;
    }

    public void setProductoKit(int productoKit) {
        this.productoKit = productoKit;
    }

    public Date getProductoVigenciaPromo() {
        return productoVigenciaPromo;
    }

    public void setProductoVigenciaPromo(Date productoVigenciaPromo) {
        this.productoVigenciaPromo = productoVigenciaPromo;
    }
}
