import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test class for testing the Dec2Hex class.
 */
public class Dec2HexTest {

    /**
     * Tests the convert method of the Dec2Hex class.
     * This method checks different decimal values and their corresponding hexadecimal representations.
     */
    @Test
    public void testConvert() {
        // Test case for converting decimal value 15 to hexadecimal ("F")
        assertEquals("F", Dec2Hex.convert(15));

        // Test case for converting decimal value 26 to hexadecimal ("1A")
        assertEquals("1A", Dec2Hex.convert(26));

        // Test case for converting decimal value 0 to hexadecimal ("0")
        assertEquals("0", Dec2Hex.convert(0));
    }
}
