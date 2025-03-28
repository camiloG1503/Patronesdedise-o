package ProtoTyoe;

public class Tom implements Person {
    private final String name = "Tom";

    public Person clone() {
        return new Tom();
    }

    public String toString() {
        return name;
    }
}
