package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.fixed;
import static metisto.digisim.Components.xor;
import static org.junit.Assert.assertEquals;

public class XorUnitTest {

    @Test
    public void should_return_true_when_inputs_are_different() {
        assertEquals(true, xor(fixed(false), fixed(true)).value());
        assertEquals(true, xor(fixed(true), fixed(false)).value());
    }

    @Test
    public void should_return_false_when_inputs_are_same() {
        assertEquals(false, xor(fixed(true), fixed(true)).value());
        assertEquals(false, xor(fixed(false), fixed(false)).value());
    }
}
