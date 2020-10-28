package adrian.avellan.composicion.controlador;

import adrian.avellan.composicion.bl.entidades.Cliente;
import adrian.avellan.composicion.bl.entidades.Factura;
import adrian.avellan.composicion.bl.entidades.Producto;
import adrian.avellan.composicion.bl.logica.Gestor;
import adrian.avellan.composicion.ui.UI;

import java.util.ArrayList;

public class Controlador {

    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();
    private ArrayList<Factura> facturas = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 3);

    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarFactura();
                break;
            case 2:
                listarFacturas();
                break;
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }
    }

    public void registrarFactura(){

        interfaz.imprimirMensaje("Ingrese el nombre del Cliente ");
        String nombreCliente = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese el id del Cliente ");
        int id = Integer.parseInt(interfaz.leerTexto());

        interfaz.imprimirMensaje("Ingrese el genero del Cliente ");
        String genero = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese la fecha de Nacimiento del Cliente ");
        String fechaNacimiento = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese la edad del Cliente ");
        int edad = Integer.parseInt(interfaz.leerTexto());

        Cliente nuevoCliente = new Cliente(nombreCliente, id, genero, fechaNacimiento, edad);

        interfaz.imprimirMensaje("Ingrese la cantidad del Producto ");
        int cantidad = Integer.parseInt(interfaz.leerTexto());

        interfaz.imprimirMensaje("Ingrese el codigo del producto ");
        int codigo = Integer.parseInt(interfaz.leerTexto());

        interfaz.imprimirMensaje("Descripcion del Producto ");
        String descripcion = interfaz.leerTexto();

        interfaz.imprimirMensaje("Ingrese el precio del Producto ");
        double precio = Double.parseDouble(interfaz.leerTexto());

        Producto nuevoP = new Producto(cantidad, codigo, descripcion, precio);

        Factura nuevaFactura = new Factura();
        nuevaFactura.setNumero(1);
        nuevaFactura.setClientes(nuevoCliente);
        nuevaFactura.getProductos().add(nuevoP);

        System.out.println(nuevaFactura);

        facturas.add(nuevaFactura);


    }

    private void listarFacturas() {
        ArrayList<Factura> lista = facturas;
        interfaz.imprimirMensaje("Lista de Facturas");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }

}
