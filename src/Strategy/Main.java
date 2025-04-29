package Strategy;

public class Main {
    public static void main(String[] args) {
        double precio = 100.0;

        CarritoDeCompra carrito = new CarritoDeCompra(new SinDescuento());
        System.out.println("Precio sin descuento: $" + carrito.calcularPrecioFinal(precio));

        carrito.setEstrategia(new DescuentoVIP());
        System.out.println("Precio con descuento cliente nuevo: $" + carrito.calcularPrecioFinal(precio));

        carrito.setEstrategia(new DescuentoVIP());
        System.out.println("Precio con descuento cliente VIP: $" + carrito.calcularPrecioFinal(precio));
    }
}
