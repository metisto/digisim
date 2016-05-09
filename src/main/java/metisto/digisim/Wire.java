package metisto.digisim;

import static metisto.digisim.Components.fixed;

public class Wire {
    private Connection connection = fixed(false);

    public void connection(final Connection connection) {
        this.connection = connection;
    }

    public Connection connection() {
        return connection;
    }

    public boolean value() {
        return connection().value();
    }
}
