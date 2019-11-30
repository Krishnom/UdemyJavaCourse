package challenge.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int strength;
    private int health;

    public Monster(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "strength=" + strength +
                ", health=" + health +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void read(List<String> savedObject) {
        if (savedObject != null && (!savedObject.isEmpty())) {
            this.name = savedObject.get(0);
            this.strength = Integer.parseInt(savedObject.get(1));
            this.health = Integer.parseInt(savedObject.get(2));
        }
    }

    @Override
    public List<String> write() {
        ArrayList<String> savePoint = new ArrayList<>();
        savePoint.add(0, name);
        savePoint.add(1, String.valueOf(strength));
        savePoint.add(2, String.valueOf(health));
        return savePoint;
    }
}
