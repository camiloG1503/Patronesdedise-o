package Builder;

public class PostScriptConverter extends Converter{

    public PostScriptConverter(String document){
        super(document);
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
