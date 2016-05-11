package metisto.digisim;

import static metisto.digisim.Components.undefined;

public class Wire implements Connection {
    private Connection input = undefined();

    public void input(final Connection connection) {
        input = connection;
    }

    public boolean value() {
        return input.value();
    }
}
