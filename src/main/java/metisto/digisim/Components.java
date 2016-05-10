package metisto.digisim;

public final class Components {

    public static Connection fixed(final boolean value) {
        return () -> value;
    }

    public static Wire connection(final Connection input) {
        final Wire wire = new Wire();
        wire.input(input);
        return wire;
    }

    static And and(final Connection a, final Connection b) {
        final And and = new And();
        and.a(a);
        and.b(b);
        return and;
    }

    static Or or(final Connection a, final Connection b) {
        final Or or = new Or();
        or.a(a);
        or.b(b);
        return or;
    }

    static Xor xor(final Connection a, final Connection b) {
        final Xor xor = new Xor();
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
