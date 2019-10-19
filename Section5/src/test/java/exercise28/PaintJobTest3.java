package exercise28;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintJobTest3 {
    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(3.4,1.5,3),//getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
                Arguments.of(-3.4,1.5,-1),//getBucketCount(-3.4, 1.5); → should return -1 since the wall area is invalid
                Arguments.of(3.4,-1.5,-1),//getBucketCount(3.4, -1.5); → should return -1 since the area/bucket is invalid
                Arguments.of(6.26, 2.2,3),//getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
                Arguments.of(3.26, 0.75,5)//getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void getBucketCount(double areaToCover,double areaPerBucket, int requiredBuckets){
        assertEquals(requiredBuckets, PaintJob.getBucketCount(areaToCover,areaPerBucket));
    }
}
