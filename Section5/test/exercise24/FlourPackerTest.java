package exercise24;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FlourPackerTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name = "Test{index} Can Meet {2}KG target with {0} 5KG and {1} 2KG? {3}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                        {1, 0, 4, false},//canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
                {1,0,5,true},//canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
                {0,5,4,true},//canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
                {2,2,11,true},//canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
                {-3,2,12,false}//canPack (-3, 2, 12); should return false since bigCount is negative.
                }
        );
    }

    private final int bigBagCount;
    private final int smallBagCount;
    private final int target;
    private final boolean isAchievable;

    public FlourPackerTest(int bigBagCount, int smallBagCount, int target, boolean isAchievable) {
        this.bigBagCount = bigBagCount;
        this.smallBagCount = smallBagCount;
        this.target = target;
        this.isAchievable = isAchievable;
    }

    @Test
    public void canPack() {
        assertEquals(isAchievable, FlourPacker.canPack(bigBagCount,smallBagCount,target));
    }
}