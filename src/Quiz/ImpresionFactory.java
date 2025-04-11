package Quiz;

public class ImpresionFactory implements ProductoFactory {
    private String color;

    public ImpresionFactory(String color) {
        this.color = color;
    }

    @Override
    public Producto crearProducto(int numero) {
        return new Impresion(numero, color);
    }
}

