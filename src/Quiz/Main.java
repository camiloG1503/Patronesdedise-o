package Quiz;

/**
 * Clase principal que sirve como punto de entrada para la aplicación.
 * Demuestra la creación de un cliente, productos (cámara e impresión),
 * y un pedido que incluye estos productos.
 */
public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("1503468", "Camilo Gómez");

        // Crear productos usando la fábrica
        Producto camara = ProductoFactory.crearProducto("camara", 1, "Canon", "EOS R5");
        Producto impresion = ProductoFactory.crearProducto("impresion", 2, "Color", "");

        // Agregar fotos al producto de impresión
        if (impresion instanceof Impresion) {
            Impresion imp = (Impresion) impresion;
            imp.agregarFoto(new Foto("rick_sanchez.jpg"));
            imp.agregarFoto(new Foto("morty.jpg"));
        }

        // Crear un pedido y agregar productos
        Pedido pedido = new Pedido(cliente, 123456);
        pedido.agregarProducto(camara);
        pedido.agregarProducto(impresion);

        // Mostrar los detalles del pedido
        pedido.mostrarPedido();
    }
}