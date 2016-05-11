package metisto.digisim;

import static metisto.digisim.Components.*;

public class FullAdder {
    private final Wire a = wire();
    private final Wire b = wire();
    private final Wire r = wire();
    private final HalfAdder first = halfAdder(a, b);
    private final HalfAdder second = halfAdder(first.sum(), r);
    private final BinaryGate or = or(first.carry(), second.carry());

    public void a(final Connection connection) {
        a.input(connection);
    }

    public void b(final Connection connection) {
        b.input(connection);
    }

    public void r(final Connection connection) {
        r.input(connection);
    }

    public Connection sum() {
        return second.sum();
    }

    public Connection carry() {
        return or;
    }
}
