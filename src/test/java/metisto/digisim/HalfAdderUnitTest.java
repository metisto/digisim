package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.fixed;
import static metisto.digisim.Components.halfAdder;
import static org.junit.Assert.assertEquals;

public class HalfAdderUnitTest {

    @Test
    public void should_respect_the_half_adder_truth_table() {
        checkHalfAdder(false, false, false, false);
        checkHalfAdder(true, false, true, false);
        checkHalfAdder(false, true, true, false);
        checkHalfAdder(true, true, false, true);
    }

    private void checkHalfAdder(boolean a, boolean b, boolean sum, boolean carry) {
        assertEquals(sum, halfAdder(fixed(a), fixed(b)).sum().value());
        assertEquals(carry, halfAdder(fixed(a), fixed(b)).carry().value());
    }
}
