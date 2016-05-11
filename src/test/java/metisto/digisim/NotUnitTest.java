package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.fixed;
import static metisto.digisim.Components.not;
import static org.junit.Assert.assertEquals;

public class NotUnitTest {

    @Test
    public void should_respect_and_truth_table() {
        checkNot(true, false);
        checkNot(false, true);
    }

    private void checkNot(final boolean input, final boolean expected) {
        assertEquals(expected, not(fixed(input)).value());
    }
}
