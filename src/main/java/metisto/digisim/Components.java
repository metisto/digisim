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
        return not().input(input);
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

    private static HalfAdder halfAdder() {
        return new HalfAdder();
    }

    public static HalfAdder halfAdder(final Connection a, final Connection b) {
        return halfAdder().a(a).b(b);
    }

    private static FullAdder fullAdder() {
        return new FullAdder();
    }

    public static FullAdder fullAdder(final Connection a, final Connection b, final Connection r) {
        return fullAdder().a(a).b(b).r(r);
    }
}
