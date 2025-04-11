package Quiz;

/**
 * Fábrica para crear productos de tipo Camara.
 */
public class CamaraFactory implements ProductoFactory {
    private String marca; // Marca de la cámara
    private String modelo; // Modelo de la cámara

    /**
     * Construye una nueva fábrica de cámaras.
     *
     * @param marca  La marca de la cámara.
     * @param modelo El modelo de la cámara.
     */
    public CamaraFactory(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Crea un producto de tipo Camara con el identificador especificado.
     *
     * @param numero El identificador único del producto.
     * @return El producto de tipo Camara creado.
     */
    @Override
    public Producto crearProducto(int numero) {
        return new Camara(numero, marca, modelo);
    }
}