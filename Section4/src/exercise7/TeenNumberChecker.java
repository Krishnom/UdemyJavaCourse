package exercise7;

class TeenNumberChecker {

    public static boolean hasTeen(int n1, int n2, int n3) {
        boolean isTeen = false;
        if (isTeen(n1)) {
            isTeen = true;
        } else if (isTeen(n2)) {
            isTeen = true;
        } else if (isTeen(n3)) {
            isTeen = true;
        }
        return isTeen;
    }

    private static boolean isTeen(int num){
        return (num <= 19 && num >=13);
    }
}