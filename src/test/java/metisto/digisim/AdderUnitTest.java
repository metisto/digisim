package metisto.digisim;

import org.junit.Test;

import static metisto.digisim.Components.fixed;
import static org.junit.Assert.assertEquals;

public class AdderUnitTest {
    @Test
    public void should_add_on_single_bit_0_plus_0() {
        final Adder adder = new Adder(1).a(0, fixed(false)).b(0, fixed(false));
        assertEquals(false, adder.sum(0).value());
        assertEquals(false, adder.carry().value());
        assertEquals(0, adder.sum());
    }

    @Test
    public void should_add_on_single_bit_1_plus_1() {
        final Adder adder = new Adder(1).a(0, fixed(true)).b(0, fixed(true));
        assertEquals(false, adder.sum(0).value());
        assertEquals(true, adder.carry().value());
        assertEquals(0, adder.sum());
    }

    @Test
    public void should_add_on_multiples_bits_0_plus_0() {
        final Adder adder = new Adder(3);
        adder.a(0, fixed(false)).b(0, fixed(false));
        adder.a(1, fixed(false)).b(1, fixed(false));
        adder.a(2, fixed(false)).b(2, fixed(false));
        assertEquals(false, adder.sum(0).value());
        assertEquals(false, adder.sum(1).value());
        assertEquals(false, adder.sum(2).value());
        assertEquals(false, adder.carry().value());
        assertEquals(0, adder.sum());
    }

    @Test
    public void should_add_on_multiples_bits_1_plus_1() {
        final Adder adder = new Adder(3);
        adder.a(0, fixed(true)).b(0, fixed(true));
        adder.a(1, fixed(false)).b(1, fixed(false));
        adder.a(2, fixed(false)).b(2, fixed(false));
        assertEquals(false, adder.sum(0).value());
        assertEquals(true, adder.sum(1).value());
        assertEquals(false, adder.sum(2).value());
        assertEquals(false, adder.carry().value());
        assertEquals(2, adder.sum());
    }

    @Test
    public void should_add_on_multiples_bits_overflow() {
        final Adder adder = new Adder(3);
        adder.a(0, fixed(true)).b(0, fixed(true));
        adder.a(1, fixed(true)).b(1, fixed(false));
        adder.a(2, fixed(true)).b(2, fixed(false));
        assertEquals(false, adder.sum(0).value());
        assertEquals(false, adder.sum(1).value());
        assertEquals(false, adder.sum(2).value());
        assertEquals(true, adder.carry().value());
        assertEquals(0, adder.sum());
    }
}
