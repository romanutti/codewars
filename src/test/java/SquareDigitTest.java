import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareDigitTest {
    @Test
    public void test() {
        assertEquals(364910, new SquareDigit().squareDigits(6710));
    }

}