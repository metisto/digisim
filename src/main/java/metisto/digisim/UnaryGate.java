package metisto.digisim;

import java.util.function.Function;

import static metisto.digisim.Components.undefined;

public class UnaryGate implements Connection {
    private Connection input = undefined();
    private final Function<Boolean, Boolean> operator;

    public UnaryGate(final Function<Boolean, Boolean> operator) {
        this.operator = operator;
    }

    public void input(final Connection connection) {
        input = connection;
    }

    public boolean value() {
        return operator.apply(input.value());
    }
}
