package Quiz;

/**
 * Interfaz para las fábricas de productos.
 * Define un método para crear productos.
 */
public interface ProductoFactory {
    /**
     * Crea un producto con el identificador especificado.
     *
     * @param numero El identificador único del producto.
     * @return El producto creado.
     */
    Producto crearProducto(int numero);
}