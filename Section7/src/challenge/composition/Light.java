package challenge.composition;

public class Light {
    private int level;
    private int MIN_LEVEL = 0;
    private int MAX_LEVEL = 10;

    public Light(int level) {
        this.level = level;
    }

    public void turnOn() {
        this.level = MAX_LEVEL;
        System.out.println("Lights turned on");
    }

    public void setMood(String mood) {
        level = mood.length() % 10;
        System.out.println("Lights on  " + mood + " now");
    }

    public void turnOff() {
        System.out.println("Lights turned off");
        level = MIN_LEVEL;
    }

    public void increaseBrightness(int brightnessLevel) {
        if (brightnessLevel < 0) {
            level = 0;
        } else {
            this.level = brightnessLevel % 10;
        }
        System.out.println("Lights are at " + level);
    }
}
