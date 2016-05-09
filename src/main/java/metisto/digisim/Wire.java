package metisto.digisim;

import static metisto.digisim.Components.fixed;

public class Wire {
    private Connection output = fixed(false);

    public void connection(final Connection connection) {
        output = connection;
    }

    public Connection output() {
        return output;
    }

    public boolean value() {
        return output().value();
    }
}
