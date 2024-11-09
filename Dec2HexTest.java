import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public void testConvert() {
        assertEquals("F", Dec2Hex.convert(15));
        assertEquals("1A", Dec2Hex.convert(26));
        assertEquals("0", Dec2Hex.convert(0));
    }
}
