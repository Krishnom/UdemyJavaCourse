package exercise28;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PaintJobTest2 extends ParameterizedTestHelper {
    @Parameterized.Parameters(name="{0}X{1} wall needs {4} new buckets covering {2} area/bucket")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {-3.4, 2.1, 1.5,-1},//getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid
                {3.4, -2.1, 1.5,-1},//getBucketCount(3.4, -2.1, 1.5); → should return -1 since the height parameter is invalid
                {3.4, 2.1, -1.5,-1},//getBucketCount(3.4, 2.1, -1.5,-1); → should return -1 for invalid area/bucket
                {3.4, 2.1, 1.5,5},//getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
                {7.25, 4.3, 2.35,14}//getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
        });
    }

    double width,height,areaPerBucket;
    int additionalBucket;

    public PaintJobTest2(double width, double height, double areaPerBucket, int additionalBucket) {
        this.width = width;
        this.height = height;
        this.areaPerBucket = areaPerBucket;
        this.additionalBucket = additionalBucket;
    }
    @Test
    public void getBucketCount(){
            assertEquals(additionalBucket, PaintJob.getBucketCount(width,height,areaPerBucket));
    }
}
