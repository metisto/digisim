package metisto.digisim;

import static metisto.digisim.Components.fixed;

public class Wire {
    private Connection input = fixed(false);
    private final Connection output = () -> input.value();

    public void input(final Connection connection) {
        input = connection;
    }

    public Connection output() {
        return output;
    }
}
