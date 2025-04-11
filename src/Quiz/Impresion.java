package Quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un pedido de impresión en el sistema.
 * Un pedido de impresión incluye un tipo de color y una lista de fotos a imprimir.
 */
public class Impresion extends Producto {
    private String color; // Tipo de color de la impresión (e.g., "Blanco y Negro", "Color")
    private List<Foto> fotos; // Lista de fotos incluidas en el pedido de impresión

    /**
     * Construye un nuevo objeto Impresion.
     *
     * @param numero El identificador único del pedido de impresión.
     * @param color  El tipo de color de la impresión.
     */
    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<>();
    }

    /**
     * Agrega una foto al pedido de impresión.
     *
     * @param foto La foto a agregar.
     */
    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    /**
     * Muestra los detalles del pedido de impresión, incluyendo su ID, tipo de color
     * y la lista de fotos.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Impresión #" + numero + " - Color: " + color);
        for (Foto foto : fotos) {
            System.out.println("  Foto: " + foto.getFichero());
        }
    }
}