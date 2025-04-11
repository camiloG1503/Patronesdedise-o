package Quiz;

public class CamaraFactory implements ProductoFactory {
    private String marca;
    private String modelo;

    public CamaraFactory(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public Producto crearProducto(int numero) {
        return new Camara(numero, marca, modelo);
    }
}
