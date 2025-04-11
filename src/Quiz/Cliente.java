package Quiz;

public class Cliente {
    private String cedula;
    private String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDetalles(){
        System.out.println("Cliente #" + cedula + " - Nombre: " + nombre);
    }
}

