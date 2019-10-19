package exercise28;


import exercise21.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintJobTest1 extends TestHelper {

    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(-3.4,2.1,1.5,2,-1),//getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid
                Arguments.of(-3.4,2.1,1.5,-2,-1),//getBucketCount(-3.4, 2.1, 1.5, -2); → should return -1 since no of available buckets is invalid
                Arguments.of(3.4, 2.1, 1.5, 2,3),//getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
                Arguments.of(2.75, 3.25, 2.5, 1,3)//getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void getBucketCount(double width, double height, double areaPerBucket, int availableBucket, int additionalBucket){
        if(availableBucket==0){
            assertEquals(additionalBucket, PaintJob.getBucketCount(width,height,areaPerBucket));
        }else{
            assertEquals(additionalBucket, PaintJob.getBucketCount(width,height,areaPerBucket,availableBucket));
        }
    }
}