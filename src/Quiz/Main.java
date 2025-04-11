package Quiz;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente objCliente = new Cliente("115021", "Juan Perez");
        objCliente.mostrarDetalles();

        // Pedido de impresión a blanco y negro
        ProductoFactory fabricaImpresion = new ImpresionFactory("Blanco y Negro");
        Producto impresion = fabricaImpresion.crearProducto(301);

        if (impresion instanceof Impresion) {
            Impresion impresionCast = (Impresion) impresion;
            impresionCast.agregarFoto(new Foto("rick_sanchez.jpg"));
            impresionCast.agregarFoto(new Foto("obama.jpg"));
        }

        // Pedido de cámara
        ProductoFactory fabricaCamara = new CamaraFactory("Nikon", "D3500");
        Producto camara = fabricaCamara.crearProducto(302);

        // Mostrar detalles de los pedidos
        impresion.mostrarDetalles();
        camara.mostrarDetalles();
    }
}
