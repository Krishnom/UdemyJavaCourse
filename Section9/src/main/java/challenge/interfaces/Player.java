package challenge.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public void read(List<String> savedObject) {
        if (savedObject != null && (!savedObject.isEmpty())) {
            this.name = savedObject.get(0);
            this.health = Integer.parseInt(savedObject.get(1));
            this.weapon = savedObject.get(2);
        }
    }

    @Override
    public List<String> write() {
        List<String> savedState = new ArrayList<>();
        savedState.add(0, name);
        savedState.add(1, String.valueOf(health));
        savedState.add(2, weapon);
        return savedState;
    }
}
