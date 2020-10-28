package adrian.avellan.composicion.bl.entidades;

public class Producto {

    private int cantidad;
    private int codigo;
    private String descripcion;
    private double precio;

    /**
     *
     * @return cantidad de productos comprados por el cliente
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad resgitro de la cantidad de productos
     */

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *
     * @return codigo para el producto listado en la factura
     */

    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo registro del codigo del producto
     */

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return descripcion de cada producto en la factura
     */

    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion registro y descripcion del producto listado
     */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return precio de el producto en la factura
     */

    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio resgitro del precio de este producto
     */

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Constructor Vacio
     */

    public Producto() {
    }

    /**
     * Constructor con los parametros necesarios para Detallar cada producto
     * @param cantidad
     * @param codigo
     * @param descripcion
     * @param precio
     */

    public Producto(int cantidad, int codigo, String descripcion, double precio) {
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "cantidad=" + cantidad +
                ", codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
