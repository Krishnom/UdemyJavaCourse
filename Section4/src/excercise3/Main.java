package excercise3;

public class Main {
    private static boolean isAlive = true;

    public static void setIsAlive(boolean isAlive) {
        Main.isAlive = isAlive;
    }
    public static void main(String[] args) {
        if(BarkingDog.shouldWakeUp(isAlive, 1)){
            System.out.println("Abe uth");
        }else{
            System.out.println("Soja veere");
        }
    }
}
