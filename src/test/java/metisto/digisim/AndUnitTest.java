package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.and;
import static metisto.digisim.Components.fixed;
import static org.junit.Assert.assertEquals;

public class AndUnitTest {

    @Test
    public void should_respect_and_truth_table() {
        checkAnd(true, true, true);
        checkAnd(true, false, false);
        checkAnd(false, true, false);
        checkAnd(false, false, false);
    }

    private void checkAnd(boolean a, boolean b, boolean expected) {
        assertEquals(expected, and(fixed(a), fixed(b)).value());
    }
}
