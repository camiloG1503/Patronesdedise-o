package Strategy;

public class DescuentoPrimeraVez implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(double precio) {
        return precio * 0.9; // Descuento del 10%
    }
}
