package metisto.digisim;

public class And {
    private Connection a;
    private Connection b;

    public void a(final Connection connection) {
        a = connection;
    }

    public void b(final Connection connection) {
        b = connection;
    }

    public Connection connection() {
        return new Connection() {
            public boolean value() {
                return a.value() & b.value();
            }
        };
    }

    public boolean value() {
        return connection().value();
    }
}
