package challenge.interfaces;

import org.junit.jupiter.api.Test;

import java.util.List;

class MonsterTest {

    @Test
    void whenSavedStateIsLoadedPlayerMovesBackToThatState() {
        Player aplayer = new Player("Ethen", 100, "AK-47");
        aplayer.setHealth(94);
        List<String> savedState = aplayer.write(); //save state

        //lets change player's health and weapons
        aplayer.setHealth(10);
        aplayer.setWeapon("AWM");

        aplayer.read(savedState);

    }
}