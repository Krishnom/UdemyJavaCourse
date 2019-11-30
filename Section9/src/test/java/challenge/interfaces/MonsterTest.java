package challenge.interfaces;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonsterTest {

    @Test
    public void whenSavedStateIsLoadedPlayerMovesBackToThatState() {
        Player player = new Player("Ethen", 100, "AK-47");
        player.setHealth(94);
        List<String> savedState = player.write(); //save state

        //lets change player's health and weapons
        player.setHealth(10);
        player.setWeapon("AWM");
        player.read(savedState);

        assertEquals(94,player.getHealth());
        assertEquals("AK-47",player.getWeapon());
    }
}