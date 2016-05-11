package metisto.digisim;

public class HalfAdder {
    private final Wire a = new Wire();
    private final Wire b = new Wire();
    private final BinaryGate and = Components.and(a, b);
    private final BinaryGate xor = Components.xor(a, b);

    public void a(final Connection connection) {
        a.input(connection);
    }

    public void b(final Connection connection) {
        b.input(connection);
    }

    public Connection sum() {
        return xor;
    }

    public Connection carry() {
        return and;
    }
}
