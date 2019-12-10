package exercise4;
class LeapYear {

    public static boolean isLeapYear(int year){
        boolean leapYear;
        boolean divisibleBy4 = (year % 4 == 0);
        boolean divisibleBy100 = (year % 100 == 0);
        boolean divisibleBy400 = (year % 400 == 0);

        if(year < 1 || year > 9999){
            leapYear = false;
        }else if(divisibleBy4 && !divisibleBy100){
            leapYear = true;
        } else {
            leapYear = divisibleBy400;
        }

        return leapYear;

    }
}