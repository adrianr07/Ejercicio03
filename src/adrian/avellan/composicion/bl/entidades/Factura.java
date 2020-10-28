/**
 * @author: Adrian Avellan
 * @version: 1.0
 *
 *
 */

package adrian.avellan.composicion.bl.entidades;

import java.util.ArrayList;

public class Factura {

    private int numero;
    private Cliente clientes;
    private ArrayList<Producto> productos;

    /**
     *
     * @return numero de la factura registrada por la compra
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero registro del numero de la factura
     */

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     *
     * @return datos del cliente que realizo la compra
     */

    public Cliente getClientes() {
        return clientes;
    }

    /**
     *
     * @param clientes registro del cliente
     */

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    /**
     *
     * @return productos comprados por el cliente
     */

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     *
     * @param productos registro de los productos comprados por el cliente
     */

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Constructor Vacio
     */

    public Factura() {
    }

    /**
     * Constructor con parametros necesarios para registrar la factura al realizar la compra
     * @param numero
     * @param clientes
     * @param productos
     */

    public Factura(int numero, Cliente clientes, ArrayList<Producto> productos) {
        this.numero = numero;
        this.clientes = clientes;
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numero=" + numero +
                ", clientes=" + clientes +
                ", productos=" + productos +
                '}';
    }
}
