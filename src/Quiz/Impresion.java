package Quiz;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class Impresion extends Producto {
    private String color;
    private List<Foto> fotos;

    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<>();
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Impresión #" + numero + " - Color: " + color);
        for (Foto foto : fotos) {
            System.out.println("  Foto: " + foto.getFichero());
        }
    }
}

