package exercise.static_initializer;

public class SIBExample {
    //This variable will be like constant
    public static final String howYouDoin;

    static {
        howYouDoin = "How you doing dear?";
        System.out.println("First static block called");
    }

    static {
        System.out.println("Second static init block called");
    }

    public SIBExample() {
        //Below will be compile error
//        howYouDoin = "dfdfd";
        System.out.println("Constructor called");
    }

    public static String getString() {
        return "SIBExample{" +
                howYouDoin +
                "}";
    }


}
