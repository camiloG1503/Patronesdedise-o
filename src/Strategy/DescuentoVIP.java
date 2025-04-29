package Strategy;

public class DescuentoVIP implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(double precio) {
        return precio * 0.8; // Descuento del 20%
    }
}


