package Quiz;

/**
 * Fábrica para crear productos de tipo Impresion.
 */
public class ImpresionFactory implements ProductoFactory {
    private String color; // Tipo de color de la impresión

    /**
     * Construye una nueva fábrica de impresiones.
     *
     * @param color El tipo de color de la impresión.
     */
    public ImpresionFactory(String color) {
        this.color = color;
    }

    /**
     * Crea un producto de tipo Impresion con el identificador especificado.
     *
     * @param numero El identificador único del producto.
     * @return El producto de tipo Impresion creado.
     */
    @Override
    public Producto crearProducto(int numero) {
        return new Impresion(numero, color);
    }
}