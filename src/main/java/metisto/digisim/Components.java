package metisto.digisim;

public final class Components {

    public static Connection fixed(final boolean value) {
        return new Connection() {
            public boolean value() {
                return value;
            }
        };
    }

    public static Wire connection(Connection connection) {
        Wire wire = new Wire();
        wire.connection(connection);
        return wire;
    }

    static And and(Connection a, Connection b) {
        final And and = new And();
        and.a(a);
        and.b(b);
        return and;
    }

    static Or or(Connection a, Connection b) {
        final Or or = new Or();
        or.a(a);
        or.b(b);
        return or;
    }
}
