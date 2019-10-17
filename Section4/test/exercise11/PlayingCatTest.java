package exercise11;

import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayingCatTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(true, 10, false),
                Arguments.of(false, 36, false),
                Arguments.of(false, 35, true)
        );
    }
    /*
    isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
    isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
    isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
     */

    @ParameterizedTest
    @MethodSource("data")
    public void isCatPlaying(boolean isSummer, int temperature, boolean willCatPlay) {
        assertEquals(willCatPlay, PlayingCat.isCatPlaying(isSummer, temperature));
    }
}