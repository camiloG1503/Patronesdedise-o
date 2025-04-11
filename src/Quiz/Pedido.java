package Quiz;

import java.util.*;

/**
 * Representa un pedido realizado por un cliente.
 * Un pedido incluye información del cliente, una lista de productos,
 * la fecha del pedido y el número de tarjeta de crédito asociado.
 */
public class Pedido {
    private Cliente cliente; // Cliente que realiza el pedido
    private List<Producto> productos; // Lista de productos en el pedido
    private Date fecha; // Fecha en que se realizó el pedido
    private int numeroTarjetaCredito; // Número de tarjeta de crédito asociado al pedido

    /**
     * Construye un nuevo objeto Pedido.
     *
     * @param cliente              El cliente que realiza el pedido.
     * @param numeroTarjetaCredito El número de tarjeta de crédito asociado al pedido.
     */
    public Pedido(Cliente cliente, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.fecha = new Date();
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
     * Muestra los detalles del pedido, incluyendo el cliente, la fecha
     * y los detalles de los productos en el pedido.
     */
    public void mostrarPedido() {
        System.out.println("Pedido de: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        for (Producto producto : productos) {
            producto.mostrarDetalles();
        }
    }
}