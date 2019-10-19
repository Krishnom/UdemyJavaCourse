package exercise8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
    /*
    area(5.0); should return 78.53975
    area(-1);  should return -1 since the parameter is negative
    area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
    area(-1.0, 4.0);  should return -1 since first the parameter is negative
     */

    @Test
    public void areaOfCircleIsReturnedWhenOneParameterIsPassed() {
        Assertions.assertEquals(78.53975, AreaCalculator.area(5.0));
    }

    @Test
    public void negativeAreaOfCircleWhenRadiusIsNotValid() {
        Assertions.assertEquals(-1.0, AreaCalculator.area(-1));
    }

    @Test
    public void areaOfRectangleIsReturnedWhenTwoParameterIsPassed() {
        Assertions.assertEquals(20.0, AreaCalculator.area(5.0, 4.0));
    }


    @Test
    public void negativeAreaOfRectangleWhenParametersAreInvalid() {
        Assertions.assertEquals(-1.0, AreaCalculator.area(-1.0, 4.0));
    }

}