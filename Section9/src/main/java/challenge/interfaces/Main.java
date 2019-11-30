package challenge.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Krishnom", 100, "Desert Eagle");

        List<String> state1 = saveState(player);
        player.setWeapon("AK-47");
        player.setHealth(18);
        List<String> state2 = saveState(player);

        player.setHealth(80);
        player.setWeapon("AWM");

        System.out.println(player);
        loadState(player, state1);
        System.out.println(player);
        loadState(player, state2);
        System.out.println(player);


        Monster monster = new Monster("Vampire", 200, 100);

        //Monster got attacked
        monster.setHealth(80);
        monster.setStrength(160);
        state1 = saveState(monster);

        //Monster got a fatal attack
        monster.setHealth(10);
        monster.setStrength(0);
        state2 = saveState(monster);

        loadState(monster, state1);
        System.out.println(monster);
        loadState(monster, state2);
        System.out.println(monster);

    }

    private static void loadState(ISaveable saveable, List<String> state1) {
        saveable.read(state1);
    }

    private static List<String> saveState(ISaveable saveableObject) {
        if (saveableObject != null) {
            System.out.println("Saving state " + saveableObject.toString());
            return saveableObject.write();
        } else {
            System.out.println("Cannot save state for this object");
            return null;
        }
    }


}
