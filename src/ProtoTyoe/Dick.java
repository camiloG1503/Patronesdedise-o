package ProtoTyoe;

public class Dick implements Person{
    private final String name = "Dick";

    @Override
    public Person clone() {
        return new Dick();
    }

    @Override
    public String toString() {
        return name;
    }
}

