package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.fixed;
import static metisto.digisim.Components.or;
import static org.junit.Assert.assertEquals;

public class OrUnitTest {

    @Test
    public void should_return_true_when_at_least_one_input_is_true() {
        assertEquals(true, or(fixed(false), fixed(true)).value());
        assertEquals(true, or(fixed(true), fixed(false)).value());
        assertEquals(true, or(fixed(true), fixed(true)).value());
    }

    @Test
    public void should_return_false_when_all_input_are_false() {
        assertEquals(false, or(fixed(false), fixed(false)).value());
    }
}
