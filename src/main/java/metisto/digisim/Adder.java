package metisto.digisim;

import java.util.List;

import static com.google.common.collect.Iterables.getLast;
import static com.google.common.collect.Lists.newArrayList;
import static metisto.digisim.Components.*;

public class Adder {
    private final List<Wire> a = newArrayList();
    private final List<Wire> b = newArrayList();
    private final Wire r = wire(fixed(false));
    private final List<FullAdder> adders = newArrayList();

    public Adder(final int n) {
        Connection currentCarry = r;
        for (int i = 0; i < n; i++) {
            final Wire a = wire();
            final Wire b = wire();
            final FullAdder adder = fullAdder(a, b, currentCarry);
            currentCarry = adder.carry();
            this.a.add(a);
            this.b.add(b);
            adders.add(adder);
        }
    }

    public Adder a(final int index, final Connection connection) {
        a.get(index).input(connection);
        return this;
    }

    public Adder b(final int index, final Connection connection) {
        b.get(index).input(connection);
        return this;
    }

    public Adder r(final Connection connection) {
        r.input(connection);
        return this;
    }

    public Connection sum(final int index) {
        return adders.get(index).sum();
    }

    public int sum() {
        final StringBuilder builder = new StringBuilder();
        for (final FullAdder adder : adders) {
            if (adder.sum().value()) {
                builder.append("1");
            } else {
                builder.append("0");
            }
        }
        return Integer.valueOf(builder.toString(), 2);
    }

    public Connection carry() {
        return getLast(adders).carry();
    }
}
