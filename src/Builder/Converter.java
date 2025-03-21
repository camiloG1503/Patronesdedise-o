package Builder;

public class Converter {

    private String document;

    public Converter(String document) {
        this.document = document;
    }

    public void makeLine(){
        System.out.println("Línea con ASCIIConverter");
    }

    public void makeParagraph(){
        System.out.println("Párrafo con ASCIIConverter");
    }

    public void makeTable(){
        System.out.println("Tabla con ASCIIConverter");
    }
}
