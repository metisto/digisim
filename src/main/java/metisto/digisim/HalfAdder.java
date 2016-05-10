package metisto.digisim;

public class HalfAdder {
    private final Wire a = new Wire();
    private final Wire b = new Wire();
    private final And and = Components.and(a.output(), b.output());
    private final Xor xor = Components.xor(a.output(), b.output());

    public void a(final Connection connection) {
        a.input(connection);
    }

    public void b(final Connection connection) {
        b.input(connection);
    }

    public Connection sum() {
        return xor.output();
    }

    public Connection carry() {
        return and.output();
    }
}
