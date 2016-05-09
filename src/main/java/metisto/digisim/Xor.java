package metisto.digisim;

import static metisto.digisim.Components.fixed;

public class Xor {
    private Connection a = fixed(false);
    private Connection b = fixed(false);
    private final Connection output = () -> a.value() ^ b.value();

    public void a(final Connection connection) {
        a = connection;
    }

    public void b(final Connection connection) {
        b = connection;
    }

    public Connection output() {
        return output;
    }
}
