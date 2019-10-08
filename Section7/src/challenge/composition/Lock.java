package challenge.composition;

public class Lock {
    private String type;
    private int levers;
    private boolean isLocked;

    public Lock(String type, int levers) {
        this.type = type;
        this.levers = levers;
        this.isLocked = false;
    }

    public void lock() {
        isLocked = true;
        System.out.println("Locked");
    }

    public void unlock() {
        isLocked = false;
        System.out.println("Unlocked");
    }
}
