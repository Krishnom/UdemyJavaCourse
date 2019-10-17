package exercise24;

import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlourPackerTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 0, 4, false),//canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
                Arguments.of(1,0,5,true),//canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
                Arguments.of(0,5,4,true),//canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
                Arguments.of(2,2,11,true),//canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
                Arguments.of(-3,2,12,false)//canPack (-3, 2, 12); should return false since bigCount is negative.
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void canPack(int bigBagCount, int smallBagCount, int target, boolean isAchievable) {
        assertEquals(isAchievable, FlourPacker.canPack(bigBagCount,smallBagCount,target));
    }
}