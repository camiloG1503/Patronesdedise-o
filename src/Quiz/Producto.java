package Quiz;

/**
 * Clase base abstracta para representar un producto en el sistema.
 * Cada producto tiene un identificador único.
 */
public abstract class Producto {
    protected int numero; // Identificador único del producto

    /**
     * Construye un nuevo objeto Producto.
     *
     * @param numero El identificador único del producto.
     */
    public Producto(int numero) {
        this.numero = numero;
    }

    /**
     * Método abstracto para mostrar los detalles del producto.
     * Debe ser implementado por las clases derivadas.
     */
    public abstract void mostrarDetalles();
}