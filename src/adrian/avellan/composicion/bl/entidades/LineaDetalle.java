package adrian.avellan.composicion.bl.entidades;

public class LineaDetalle {

    private Producto productos;

    /**
     *
     * @return linea de productos agregados a la factura
     */

    public Producto getProductos() {
        return productos;
    }

    /**
     *
     * @param productos registro de las lineas con diferentes productos
     */

    public void setProductos(Producto productos) {
        this.productos = productos;
    }

    /**
     * Constructor Vacio
     */
    public LineaDetalle() {
    }

    /**
     * Constructor con parametros necesarios para llenar las lineas de productos
     * @param productos
     */

    public LineaDetalle(Producto productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "LineaDetalle{" +
                "productos=" + productos +
                '}';
    }
}
