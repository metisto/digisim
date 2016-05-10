package metisto.digisim;

import static metisto.digisim.Components.halfAdder;
import static metisto.digisim.Components.or;

public class FullAdder {
    private final Wire a = new Wire();
    private final Wire b = new Wire();
    private final Wire r = new Wire();
    private final HalfAdder first = halfAdder(a.output(), b.output());
    private final HalfAdder second = halfAdder(first.sum(), r.output());
    private final Or or = or(first.carry(), second.carry());

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
        return or.output();
    }
}
