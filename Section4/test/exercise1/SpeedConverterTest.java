package exercise1;

import common.TestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SpeedConverterTest extends TestHelper {
    @Parameterized.Parameters(name = "{index}: Test with km={0}, miles={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.5, 1},      // toMilesPerHour(1.5); → should return value 1
                {10.25, 6},     // toMilesPerHour(10.25); → should return value 6
                {-5.6, -1},    // toMilesPerHour(-5.6); → should return value -1
                {25.42, 16},    // toMilesPerHour(25.42); → should return value 16
                {75.114, 47},   // toMilesPerHour(75.114); → should return value 47
        });
    }

    private double km;
    private long miles;

    public SpeedConverterTest(double km, long miles) {
        super();
        this.km = km;
        this.miles = miles;
    }

    @Test
    public void printConversionPrintsExpectedString() {
        SpeedConverter.printConversion(km);
        if (km > 0) {
            assertSysout(km + " km/h = " + Math.round(km / SpeedConverter.conversionRate) + " mi/h");
        } else {
            assertSysout("Invalid Value");
        }
    }

    @Test
    public void milesConversionIsAsExpected() {
        assertEquals(miles, SpeedConverter.toMilesPerHour(km));
    }
}