package adrian.avellan.composicion.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void mostrarMenu(){
        output.println("Tarea Composicion");
        output.println("1. Agregar Factura");
        output.println("2. Listar Facturas");
        output.println("3. Salir");
    }

    public int leerOpcion(){
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public void imprimirMensaje(String mensaje){
        output.println(mensaje);
    }

    public String leerTexto(){
        return input.next();
    }

}
