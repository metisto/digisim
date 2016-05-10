package metisto.digisim;

import static metisto.digisim.Components.fixed;

public class Xor implements Connection {
    private Connection a = fixed(false);
    private Connection b = fixed(false);

    public void a(final Connection connection) {
        a = connection;
    }

    public void b(final Connection connection) {
        b = connection;
    }

    public boolean value() {
        return a.value() ^ b.value();
    }
}
