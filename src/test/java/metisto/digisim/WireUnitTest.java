package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.connection;
import static metisto.digisim.Components.fixed;
import static org.junit.Assert.assertEquals;

public class WireUnitTest {

    @Test
    public void should_return_same_value_as_input() {
        assertEquals(true, connection(fixed(true)).output().value());
        assertEquals(false, connection(fixed(false)).output().value());
    }

    @Test
    public void should_be_dynamic() {
        final Wire wire = connection(fixed(true));
        final Connection output = wire.output();
        assertEquals(true, output.value());
        wire.input(fixed(false));
        assertEquals(false, output.value());
    }
}
