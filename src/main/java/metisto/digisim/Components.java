package metisto.digisim;

public final class Components {

    public static Output fixed(final boolean value) {
        return new Output() {
            public boolean value() {
                return value;
            }
        };
    }

    public static Connection connection(Output output) {
        Connection connection = new Connection();
        connection.input().connectTo(output);
        return connection;
    }
}
