package metisto.digisim;

public class And {
    private Output a;
    private Output b;

    public Input a() {
        return new Input() {
            public void connectTo(Output output) {
                a = output;
            }
        };
    }

    public Input b() {
        return new Input() {
            public void connectTo(Output output) {
                b = output;
            }
        };
    }

    public Output output() {
        return new Output() {
            public boolean value() {
                return a.value() && b.value();
            }
        };
    }
}
