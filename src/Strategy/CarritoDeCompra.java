package Strategy;

public class CarritoDeCompra {
    private DescuentoStrategy estrategia;

    public CarritoDeCompra(DescuentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(DescuentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularPrecioFinal(double precioOriginal) {
        return estrategia.aplicarDescuento(precioOriginal);
    }
}
