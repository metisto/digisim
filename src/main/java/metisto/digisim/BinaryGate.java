package metisto.digisim;

import java.util.function.BiFunction;

import static metisto.digisim.Components.undefined;

public class BinaryGate implements Connection {
    private Connection a = undefined();
    private Connection b = undefined();
    private final BiFunction<Boolean, Boolean, Boolean> operator;

    public BinaryGate(final BiFunction<Boolean, Boolean, Boolean> operator) {
        this.operator = operator;
    }

    public void a(final Connection connection) {
        a = connection;
    }

    public void b(final Connection connection) {
        b = connection;
    }

    public boolean value() {
        return operator.apply(a.value(), b.value());
    }
}
