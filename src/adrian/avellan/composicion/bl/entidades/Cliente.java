/**
 * @author: Adrian Avellan
 * @version: 1.0
 *
 *
 */

package adrian.avellan.composicion.bl.entidades;

public class Cliente {

    private String nombreCliente;
    private int id;
    private String genero;
    private String fechaNacimiento;
    private int edad;

    /**
     *
     * @return nombre del cliente que realiza la compra
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     *
     * @param nombreCliente registro del nombre del cliente
     */

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     *
     * @return identificacion del cliente que realiza la compra
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @param id registro de la identificacion del cliente
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return genero de el cliente que reliza la compra
     */

    public String getGenero() {
        return genero;
    }

    /**
     *
     * @param genero registro del genero del cliente
     */

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * @return fehca de nacimiento del cliente que realiza la compra
     */

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     *
     * @param fechaNacimiento registro de la fecha de nacimiento del cliente
     */

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     *
     * @return edad del cliente que realiza la compra
     */

    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad registro de la edad del cliente
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Constructor Vacio
     */

    public Cliente() {
    }

    /**
     * Constructor con parametros necesarios para registrar los datos del cliente que realiza la compra
     * @param nombreCliente
     * @param id
     * @param genero
     * @param fechaNacimiento
     * @param edad
     */

    public Cliente(String nombreCliente, int id, String genero, String fechaNacimiento, int edad) {
        this.nombreCliente = nombreCliente;
        this.id = id;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", id=" + id +
                ", genero='" + genero + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", edad=" + edad +
                '}';
    }
}
