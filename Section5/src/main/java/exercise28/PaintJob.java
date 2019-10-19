package exercise28;

class PaintJob {
    static int getBucketCount(double width, double height, double areaPerBucket, int availableBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || availableBucket < 0) {
            return -1;
        }

        double totalWallArea = width * height;
        double additionalAreaToCover = totalWallArea - (areaPerBucket*availableBucket);

        return (int) Math.ceil(additionalAreaToCover/areaPerBucket);
    }

    static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width,height,areaPerBucket,0);
    }

    static int getBucketCount(double areaToCover, double areaPerBucket) {
        if(areaPerBucket <= 0 || areaToCover <= 0) {
            return -1;
        }
        return (int) Math.ceil(areaToCover/areaPerBucket);
    }
}