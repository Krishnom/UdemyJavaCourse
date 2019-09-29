package exercise8;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class AreaCalculatorTest {
    /*
    area(5.0); should return 78.53975
    area(-1);  should return -1 since the parameter is negative
    area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
    area(-1.0, 4.0);  should return -1 since first the parameter is negative
     */

    @Test public void areaOfCircleIsReturnedWhenOneParameterIsPassed(){
        assertEquals(78.53975, AreaCalculator.area(5.0));
    }

    @Test public void negativeAreaOfCircleWhenRadiusIsNotValid(){
        assertEquals(-1.0, AreaCalculator.area(-1));
    }

    @Test public void areaOfRectangleIsReturnedWhenTwoParameterIsPassed(){
        assertEquals(20.0, AreaCalculator.area(5.0,4.0));
    }


    @Test public void negativeAreaOfRectangleWhenParametersAreInvalid(){
        assertEquals(-1.0, AreaCalculator.area(-1.0,4.0));
    }

}