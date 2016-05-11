package metisto.digisim;

public final class Components {

    public static Connection undefined() {
        return () -> {
            throw new RuntimeException("undefined");
        };
    }

    public static Connection fixed(final boolean value) {
        return () -> value;
    }

    public static Wire wire() {
        return new Wire();
    }

    public static Wire wire(final Connection input) {
        return wire().input(input);
    }

    public static Connection not(final Connection input) {
        final UnaryGate not = not();
        not.input(input);
        return not;
    }

    public static UnaryGate not() {
        return new UnaryGate((a -> !a));
    }

    public static BinaryGate and() {
        return new BinaryGate((a, b) -> a & b);
    }

    public static BinaryGate and(final Connection a, final Connection b) {
        return and().a(a).b(b);
    }

    public static BinaryGate or() {
        return new BinaryGate((a, b) -> a | b);
    }

    public static BinaryGate or(final Connection a, final Connection b) {
        return or().a(a).b(b);
    }

    public static BinaryGate xor() {
        return new BinaryGate((a, b) -> a ^ b);
    }

    public static BinaryGate xor(final Connection a, final Connection b) {
        return xor().a(a).b(b);
    }

    public static HalfAdder halfAdder(final Connection a, final Connection b) {
        final HalfAdder halfAdder = new HalfAdder();
        halfAdder.a(a);
        halfAdder.b(b);
        return halfAdder;
    }

    public static FullAdder fullAdder(final Connection a, final Connection b, final Connection r) {
        final FullAdder fullAdder = new FullAdder();
        fullAdder.a(a);
        fullAdder.b(b);
        fullAdder.r(r);
        return fullAdder;
    }
}
