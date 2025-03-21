package Builder;

public class EjecutarBuilderPattern {
    public static void main(String[] args) {

        //Creacion de objetos
        Converter objDocumento1 = new ASCIIConverter("La odisea");
        Converter objDocumento2 = new PostScriptConverter("La odisea");
        Converter objDocumento3 = new PDFConverter("La odisea");


        Reader objLector1 = new Reader("LINE", objDocumento1);
        Reader objLector2 = new Reader("PARAGRAPH", objDocumento2);
        Reader objLector3 = new Reader("TABLE", objDocumento3);

        objLector1.parseInput();
        objLector2.parseInput();
        objLector3.parseInput();
    }
}
