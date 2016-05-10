package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.fixed;
import static metisto.digisim.Components.fullAdder;
import static org.junit.Assert.assertEquals;

public class FullAdderUnitTest {
    @Test
    public void should_respect_the_half_adder_truth_table() {
        checkFullAdder(false, false, false, false, false);
        checkFullAdder(true, false, false, true, false);
        checkFullAdder(false, true, false, true, false);
        checkFullAdder(true, true, false, false, true);
        checkFullAdder(false, false, true, true, false);
        checkFullAdder(true, false, true, false, true);
        checkFullAdder(false, true, true, false, true);
        checkFullAdder(true, true, true, true, true);
    }

    private void checkFullAdder(final boolean a, final boolean b, final boolean r, final boolean sum, final boolean carry) {
        assertEquals(sum, fullAdder(fixed(a), fixed(b), fixed(r)).sum().value());
        assertEquals(carry, fullAdder(fixed(a), fixed(b), fixed(r)).carry().value());
    }
}
