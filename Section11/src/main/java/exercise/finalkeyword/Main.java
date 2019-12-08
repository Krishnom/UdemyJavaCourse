package exercise.finalkeyword;

public class Main extends ExampleClass {
    public static void main(String[] args) {
        ExampleClass class1 = new ExampleClass();
        ExampleClass class2 = new ExampleClass();
        ExampleClass class3 = new ExampleClass();

        System.out.println("Total instances of " +
                ExampleClass.class.getSimpleName() +
                " : " + ExampleClass.instanceCount);

        System.out.println(class1.getInstanceNumber());
        System.out.println(class2.getInstanceNumber());
        System.out.println(class3.getInstanceNumber());
    }
}
