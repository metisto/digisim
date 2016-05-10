package metisto.digisim;

import static metisto.digisim.Components.fixed;

public class Wire implements Connection {
    private Connection input = fixed(false);

    public void input(final Connection connection) {
        input = connection;
    }

    public boolean value() {
        return input.value();
    }
}
