package Quiz;

/**
 * Clase para la creación de productos en el sistema.
 * Proporciona un método estático para crear diferentes tipos de productos
 * como cámaras e impresiones, basándose en el tipo especificado.
 */
public class ProductoFactory {

    /**
     * Crea un producto basado en el tipo especificado.
     *
     * @param tipo      El tipo de producto a crear ("camara" o "impresion").
     * @param numero    El identificador único del producto.
     * @param atributo1 El primer atributo del producto (marca para cámaras o color para impresiones).
     * @param atributo2 El segundo atributo del producto (modelo para cámaras o vacío para impresiones).
     * @return El producto creado.
     * @throws IllegalArgumentException Si el tipo de producto no es válido.
     */
    public static Producto crearProducto(String tipo, int numero, String atributo1, String atributo2) {
        if (tipo.equalsIgnoreCase("camara")) {
            return new Camara(numero, atributo1, atributo2);
        } else if (tipo.equalsIgnoreCase("impresion")) {
            return new Impresion(numero, atributo1);
        } else {
            throw new IllegalArgumentException("Tipo de producto no válido");
        }
    }
}