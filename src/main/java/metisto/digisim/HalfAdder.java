package metisto.digisim;

public class HalfAdder {
    private final And and = new And();
    private final Xor xor = new Xor();

    public void a(final Connection connection) {
        and.a(connection);
        xor.a(connection);
    }

    public void b(final Connection connection) {
        and.b(connection);
        xor.b(connection);
    }

    public Connection sum() {
        return xor.output();
    }

    public Connection carry() {
        return and.output();
    }
}
