package Quiz;

/**
 * Representa un producto de cámara en el sistema.
 * Cada cámara tiene una marca y un modelo.
 */
public class Camara extends Producto {
    private String marca; // Marca de la cámara
    private String modelo; // Modelo de la cámara

    /**
     * Construye un nuevo objeto Camara.
     *
     * @param numero El identificador único del producto.
     * @param marca  La marca de la cámara.
     * @param modelo El modelo de la cámara.
     */
    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Muestra los detalles de la cámara, incluyendo su ID, marca y modelo.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Cámara #" + numero + " - Marca: " + marca + ", Modelo: " + modelo);
    }
}