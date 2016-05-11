package metisto.digisim;

import static metisto.digisim.Components.wire;

public class HalfAdder {
    private final Wire a = wire();
    private final Wire b = wire();
    private final BinaryGate and = Components.and(a, b);
    private final BinaryGate xor = Components.xor(a, b);

    public HalfAdder a(final Connection connection) {
        a.input(connection);
        return this;
    }

    public HalfAdder b(final Connection connection) {
        b.input(connection);
        return this;
    }

    public Connection sum() {
        return xor;
    }

    public Connection carry() {
        return and;
    }
}
