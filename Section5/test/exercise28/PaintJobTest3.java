package exercise28;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PaintJobTest3 extends ParameterizedTestHelper {
    @Parameterized.Parameters(name="{2} buckets covering {1} area per bucket are required for {0} wall area")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {3.4,1.5,3},//getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
                {-3.4,1.5,-1},//getBucketCount(-3.4, 1.5); → should return -1 since the wall area is invalid
                {3.4,-1.5,-1},//getBucketCount(3.4, -1.5); → should return -1 since the area/bucket is invalid
                {6.26, 2.2,3},//getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
                {3.26, 0.75,5}//getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
        });
    }

    private final double areaPerBucket;
    private final double areaToCover;
    private final int requiredBuckets;

    public PaintJobTest3(double areaToCover,double areaPerBucket, int requiredBuckets) {
        this.areaPerBucket = areaPerBucket;
        this.areaToCover = areaToCover;
        this.requiredBuckets = requiredBuckets;
    }

    @Test
    public void getBucketCount(){
        assertEquals(requiredBuckets, PaintJob.getBucketCount(areaToCover,areaPerBucket));
    }
}
