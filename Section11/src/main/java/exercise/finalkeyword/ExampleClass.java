package exercise.finalkeyword;

public class ExampleClass {

    public static int instanceCount = 0;
    private final int instanceNumber;

    public ExampleClass() {
        instanceCount++;
        this.instanceNumber = instanceCount;
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
