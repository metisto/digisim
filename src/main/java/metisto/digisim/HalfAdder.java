package metisto.digisim;

public class HalfAdder {
    private final And and = new And();
    private final Xor xor = new Xor();

    public void a(Connection connection) {
        and.a(connection);
        xor.a(connection);
    }

    public void b(Connection connection) {
        and.b(connection);
        xor.b(connection);
    }

    public Connection sum() {
        return xor.connection();
    }

    public Connection carry() {
        return and.connection();
    }
}
