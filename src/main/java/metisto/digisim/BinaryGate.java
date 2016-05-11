package metisto.digisim;

import java.util.function.BiFunction;

import static metisto.digisim.Components.undefined;

public class BinaryGate implements Connection {
    private Connection a = undefined();
    private Connection b = undefined();
    private final Operators operator;

    public enum Operators {
        AND((a, b) -> a & b),
        OR((a, b) -> a | b),
        XOR((a, b) -> a ^ b);

        final BiFunction<Boolean, Boolean, Boolean> function;

        Operators(final BiFunction<Boolean, Boolean, Boolean> function) {
            this.function = function;
        }
    }

    public BinaryGate(final Operators operator) {
        this.operator = operator;
    }

    public void a(final Connection connection) {
        a = connection;
    }

    public void b(final Connection connection) {
        b = connection;
    }

    public boolean value() {
        return operator.function.apply(a.value(), b.value());
    }
}
