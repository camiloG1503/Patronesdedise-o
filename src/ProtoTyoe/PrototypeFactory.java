package ProtoTyoe;

public class PrototypeFactory {
    public static void main(String[] args) {
        String[] inputs = {"tom", "dick", "harry"};
            for (String type : inputs) {
                Person prototype = Factory.getPrototype(type);
                if (prototype != null) {
                    System.out.println(prototype);
                }
            }
    }
}
