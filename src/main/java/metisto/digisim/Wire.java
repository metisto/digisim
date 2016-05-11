package metisto.digisim;

import static metisto.digisim.Components.undefined;

public class Wire implements Connection {
    private Connection input = undefined();

    public Wire input(final Connection connection) {
        input = connection;
        return this;
    }

    public boolean value() {
        return input.value();
    }
}
