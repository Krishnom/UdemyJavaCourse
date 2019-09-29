package exercise5;

class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double no1, double no2)
    {
        //int no1ConvertedToIntUpto3DecimalPoint = no1 * 1000;
        //int no2ConvertedToIntUpto3DecimalPoint = no2 * 1000;
        int no1ToFloat = (int) (no1 * 1000);
        int no2ToFloat = (int) (no2 * 1000);

        return no1ToFloat == no2ToFloat;
    }

}