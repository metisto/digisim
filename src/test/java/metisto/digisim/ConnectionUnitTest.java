package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.fixed;
import static org.junit.Assert.assertEquals;

public class ConnectionUnitTest {

    @Test
    public void should_return_same_value_as_input() {
        Connection connection = new Connection();
        connection.input().connectTo(fixed(true));
        assertEquals(true, connection.output().value());
    }
}
