package metisto.digisim;

import static metisto.digisim.Components.fixed;

public class Connection {
    private Output output = fixed(false);

    public Output output() {
        return output;
    }

    public Input input() {
        return new Input() {
            public void connectTo(final Output output) {
                Connection.this.output = output;
            }
        };
    }
}
