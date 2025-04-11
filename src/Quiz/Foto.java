package Quiz;

/**
 * Representa una foto que puede ser añadida a un pedido de impresión.
 * Cada foto está identificada por su nombre de fichero.
 */
class Foto {
    private String fichero; // Nombre del fichero de la foto

    /**
     * Construye un nuevo objeto Foto.
     *
     * @param fichero El nombre del fichero de la foto.
     */
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    /**
     * Obtiene el nombre del fichero de la foto.
     *
     * @return El nombre del fichero de la foto.
     */
    public String getFichero() {
        return fichero;
    }

    /**
     * Imprime los detalles de la foto en la consola.
     */
    public void print() {
        System.out.println("Mostrando foto: " + fichero);
    }
}