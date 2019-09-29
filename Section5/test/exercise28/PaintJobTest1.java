package exercise28;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PaintJobTest1 extends ParameterizedTestHelper {

    @Parameterized.Parameters(name="{0}X{1} wall needs {4} new buckets covering {2} area/bucket")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {-3.4,2.1,1.5,2,-1},//getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid
                {-3.4,2.1,1.5,-2,-1},//getBucketCount(-3.4, 2.1, 1.5, -2); → should return -1 since no of available buckets is invalid
                {3.4, 2.1, 1.5, 2,3},//getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
                {2.75, 3.25, 2.5, 1,3},//getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.
        });
    }

    private final double width;
    private final double height;
    private final double areaPerBucket;
    private final int availableBucket;
    private final int additionalBucket;

    public PaintJobTest1(double width, double height, double areaPerBucket, int availableBucket, int additionalBucket) {
        this.width = width;
        this.height = height;
        this.areaPerBucket = areaPerBucket;
        this.availableBucket = availableBucket;
        this.additionalBucket = additionalBucket;
    }


    @Test public void getBucketCount(){
        if(availableBucket==0){
            assertEquals(additionalBucket, PaintJob.getBucketCount(width,height,areaPerBucket));
        }else{
            assertEquals(additionalBucket, PaintJob.getBucketCount(width,height,areaPerBucket,availableBucket));
        }
    }
}