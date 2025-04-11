package Quiz;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.fecha = new Date();
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarPedido() {
        System.out.println("Pedido de: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos");
        for (Producto producto : productos) {
            producto.mostrarDetalles();
        }
    }
}
