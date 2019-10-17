package exercise28;


import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintJobTest2 extends TestHelper {
    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(-3.4, 2.1, 1.5,-1),//getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid
                Arguments.of(3.4, -2.1, 1.5,-1),//getBucketCount(3.4, -2.1, 1.5); → should return -1 since the height parameter is invalid
                Arguments.of(3.4, 2.1, -1.5,-1),//getBucketCount(3.4, 2.1, -1.5,-1); → should return -1 for invalid area/bucket
                Arguments.of(3.4, 2.1, 1.5,5),//getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
                Arguments.of(7.25, 4.3, 2.35,14)//getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void getBucketCount(double width, double height, double areaPerBucket, int additionalBucket){
            assertEquals(additionalBucket, PaintJob.getBucketCount(width,height,areaPerBucket));
    }
}
