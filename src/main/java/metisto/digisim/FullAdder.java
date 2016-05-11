package metisto.digisim;

import static metisto.digisim.Components.*;

public class FullAdder {
    private final Wire a = wire();
    private final Wire b = wire();
    private final Wire r = wire();
    private final HalfAdder first = halfAdder(a, b);
    private final HalfAdder second = halfAdder(first.sum(), r);
    private final BinaryGate or = or(first.carry(), second.carry());

    public FullAdder a(final Connection connection) {
        a.input(connection);
        return this;
    }

    public FullAdder b(final Connection connection) {
        b.input(connection);
        return this;
    }

    public FullAdder r(final Connection connection) {
        r.input(connection);
        return this;
    }

    public Connection sum() {
        return second.sum();
    }

    public Connection carry() {
        return or;
    }
}
