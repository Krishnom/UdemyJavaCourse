package exercise11;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PlayingCatTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name="Test{index}: IsSummer={0} Temperature={1} then cat playing={2}")
            public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {true,10,false},
                {false,36,false},
                {false,35,true}
        });
    }
    /*
    isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
    isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
    isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
     */

    private final boolean isSummer;
    private final int temperature;
    private final boolean willCatPlay;

    public PlayingCatTest(boolean isSummer, int temperature, boolean willCatPlay) {
        this.isSummer = isSummer;
        this.temperature = temperature;
        this.willCatPlay = willCatPlay;
    }

    @Test
    public void isCatPlaying() {
        assertEquals(willCatPlay,PlayingCat.isCatPlaying(isSummer, temperature));
    }
}