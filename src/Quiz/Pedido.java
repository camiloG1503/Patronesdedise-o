package Quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un pedido realizado por un cliente.
 * Un pedido puede contener múltiples productos.
 */
public class Pedido {
    private Cliente cliente; // Cliente que realiza el pedido
    private List<Producto> productos; // Lista de productos en el pedido

    /**
     * Construye un nuevo objeto Pedido.
     *
     * @param cliente El cliente que realiza el pedido.
     */
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un producto al pedido.
     *
     * @param producto El producto a agregar.
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Muestra los detalles del pedido, incluyendo los detalles del cliente
     * y de los productos en el pedido.
     */
    public void mostrarDetalles() {
        System.out.println("Detalles del Pedido:");
        cliente.mostrarDetalles();
        for (Producto producto : productos) {
            producto.mostrarDetalles();
        }
    }
}