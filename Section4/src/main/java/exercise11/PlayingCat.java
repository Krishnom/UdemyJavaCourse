package exercise11;

class PlayingCat {

    public static boolean isCatPlaying(boolean isSummer, int temp)
    {
        return isSummer ? (temp >= 25 && temp <=45) :
                            (temp >= 25 && temp <=35);
    }
}