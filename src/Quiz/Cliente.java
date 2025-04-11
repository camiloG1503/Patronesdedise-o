package Quiz;

/**
 * Representa un cliente en el sistema.
 * Cada cliente tiene una cédula única y un nombre.
 */
public class Cliente {
    private String cedula; // Identificador único del cliente
    private String nombre; // Nombre del cliente

    /**
     * Construye un nuevo objeto Cliente.
     *
     * @param cedula La cédula única del cliente.
     * @param nombre El nombre del cliente.
     */
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Muestra los detalles del cliente, incluyendo su cédula y nombre.
     */
    public void mostrarDetalles() {
        System.out.println("Cliente #" + cedula + " - Nombre: " + nombre);
    }
}