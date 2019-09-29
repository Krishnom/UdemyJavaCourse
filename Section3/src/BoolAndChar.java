class BoolAndChar {

    public static void main(String[] args) {


        char myUnicodeChar = '\u00A9';

        System.out.println("Unicode char is " + myUnicodeChar);

        String myStrValue = myUnicodeChar + "\u00A6";
        System.out.println(myStrValue);
    }
}
