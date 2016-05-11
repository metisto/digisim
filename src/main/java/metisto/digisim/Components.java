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

    static BinaryGate and(final Connection a, final Connection b) {
        final BinaryGate and = new BinaryGate(BinaryGate.Operators.AND);
        and.a(a);
        and.b(b);
        return and;
    }

    static BinaryGate or(final Connection a, final Connection b) {
        final BinaryGate or = new BinaryGate(BinaryGate.Operators.OR);
        or.a(a);
        or.b(b);
        return or;
    }

    static BinaryGate xor(final Connection a, final Connection b) {
        final BinaryGate xor = new BinaryGate(BinaryGate.Operators.XOR);
        xor.a(a);
        xor.b(b);
        return xor;
    }

    static HalfAdder halfAdder(final Connection a, final Connection b) {
        final HalfAdder halfAdder = new HalfAdder();
        halfAdder.a(a);
        halfAdder.b(b);
        return halfAdder;
    }

    static FullAdder fullAdder(final Connection a, final Connection b, final Connection r) {
        final FullAdder fullAdder = new FullAdder();
        fullAdder.a(a);
        fullAdder.b(b);
        fullAdder.r(r);
        return fullAdder;
    }
}
