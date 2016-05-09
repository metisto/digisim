package metisto.digisim;

public class And {
    private Connection a;
    private Connection b;
    private final Connection output = () -> a.value() & b.value();

    public void a(final Connection connection) {
        a = connection;
    }

    public void b(final Connection connection) {
        b = connection;
    }

    public Connection output() {
        return output;
    }
}
