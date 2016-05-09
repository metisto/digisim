package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.and;
import static metisto.digisim.Components.fixed;
import static org.junit.Assert.assertEquals;

public class AndUnitTest {

    @Test
    public void should_return_true_when_all_input_are_true() {
        assertEquals(true, and(fixed(true), fixed(true)).value());
    }

    @Test
    public void should_return_false_when_at_least_one_input_is_false() {
        assertEquals(false, and(fixed(false), fixed(true)).value());
        assertEquals(false, and(fixed(true), fixed(false)).value());
        assertEquals(false, and(fixed(false), fixed(false)).value());
    }

}
