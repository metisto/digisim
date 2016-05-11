package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.wire;
import static metisto.digisim.Components.fixed;
import static org.junit.Assert.assertEquals;

public class WireUnitTest {

    @Test
    public void should_return_same_value_as_input() {
        assertEquals(true, wire(fixed(true)).value());
        assertEquals(false, wire(fixed(false)).value());
    }

    @Test
    public void should_be_dynamic() {
        final Wire wire = wire(fixed(true));
        assertEquals(true, wire.value());
        wire.input(fixed(false));
        assertEquals(false, wire.value());
    }
}
