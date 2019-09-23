package exercise8;

public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return 3.14159 * (radius * radius);
    }

    public static double area(double height, double width) {
        if (height < 0 || width < 0) {
            return -1.0;
        }
        return height * width;
    }

}
