package exercise5;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DecimalComparatorTest extends ParameterizedTestHelper {

    @Parameters(name = "Test{index} {0} and {1} results {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {-3.1756, -3.175, true},
                {3.175, 3.176, false},
                {3.0, 3.0, true},
                {-3.123, 3.123, false},
        });
    }

    private double doubleVal1;
    private double doubleVal2;
    private boolean areEqualToThreeDecimals;

    public DecimalComparatorTest(double doubleVal1, double doubleVal2, boolean areEqualToThreeDecimals) {
        this.doubleVal1 = doubleVal1;
        this.doubleVal2 = doubleVal2;
        this.areEqualToThreeDecimals = areEqualToThreeDecimals;
    }

    /**
     * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
     * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
     * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
     * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
     */
    @Test
    public void areEqualByThreeDecimalPlaces() {
        assertEquals(areEqualToThreeDecimals, DecimalComparator.areEqualByThreeDecimalPlaces(doubleVal1, doubleVal2));
    }
}