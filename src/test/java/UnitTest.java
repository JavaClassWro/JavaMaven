import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {
    @Test
    public void shouldAlwaysBeTrue() {
        // given
        Integer a = 10;
        Integer expectedSum = 20;
        // when
        Integer sum = a + a;
        // then
        assertEquals(sum, expectedSum);
    }
}
