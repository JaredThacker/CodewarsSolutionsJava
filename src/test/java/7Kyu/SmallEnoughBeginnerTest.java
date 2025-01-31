import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SmallEnoughBeginnerTest {

    @Test
    public void basicTests() {
        assertEquals(true, SmallEnoughBeginner.smallEnough(new int[] { 66, 101 }, 200));
        assertEquals(false, SmallEnoughBeginner.smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
        assertEquals(true, SmallEnoughBeginner.smallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
        assertEquals(true, SmallEnoughBeginner.smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }
}
