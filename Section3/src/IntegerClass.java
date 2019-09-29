public class IntegerClass {

    public static void main(String[] args) {

      byte myByte = 10;
      int myInt = 20;
      short myShort = 50;
      long myLong = 50000L + 10L * (myInt+myByte+myShort);

      double largeDoubleValue = 123456789;
//        System.out.println(myLong);
        System.out.println("Value of "+largeDoubleValue+ " * 1000 in INT is "+(int)(largeDoubleValue * 1000));




    }
}
