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
        final Wire wire = wire();
        wire.input(input);
        return wire;
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
        final BinaryGate and = and();
        and.a(a);
        and.b(b);
        return and;
    }

    public static BinaryGate or() {
        return new BinaryGate((a, b) -> a | b);
    }

    public static BinaryGate or(final Connection a, final Connection b) {
        final BinaryGate or = or();
        or.a(a);
        or.b(b);
        return or;
    }

    public static BinaryGate xor() {
        return new BinaryGate((a, b) -> a ^ b);
    }

    public static BinaryGate xor(final Connection a, final Connection b) {
        final BinaryGate xor = xor();
        xor.a(a);
        xor.b(b);
        return xor;
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
