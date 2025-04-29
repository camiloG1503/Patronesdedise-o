package Strategy;

public class SinDescuento implements DescuentoStrategy {

    public double aplicarDescuento(double precio) {
        return precio; // Sin descuento
    }
}
