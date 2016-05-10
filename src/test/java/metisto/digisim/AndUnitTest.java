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

    private void checkAnd(final boolean a, final boolean b, final boolean expected) {
        assertEquals(expected, and(fixed(a), fixed(b)).output().value());
    }

    @Test
    public void should_be_dynamic() {
        final And and = and(fixed(true), fixed(true));
        assertEquals(true, and.output().value());
        and.b(fixed(false));
        assertEquals(false, and.output().value());
    }

    @Test
    public void should_work_with_wire() {
        final Wire a = new Wire();
        final Wire b = new Wire();
        final And and = Components.and(a.output(), b.output());

        a.input(fixed(true));
        b.input(fixed(true));
        assertEquals(true, and.output().value());
    }
}
