package solid3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Smell1AlmostBestTest {

    @Test
    void testPowerBoundary1() {
        assertEquals(9, Smell1AlmostBest.toPower(3, 2), "3^2 should be equal to 9");
    }

    @Test
    void testPowerBoundary2() {
        assertEquals(1, Smell1AlmostBest.toPower(4, 0), "4^0 should be equal to 1");
    }

    @Test
    void testPowerBoundary3() { assertEquals(15625, Smell1AlmostBest.toPower(125, 2), "125^2 should be equal to 15625"); }

    @Test
    void testNegativeScenario() {
        assertThrows(IllegalArgumentException.class, () -> Smell1AlmostBest.toPower(2, -2),
                "Negative powers are not supported, throw exception");
    }

    @Test
    void testEquivalenceClasses() {
        assertEquals(15, Smell1AlmostBest.toPower(4, 2), "4^2 is 16");
        assertEquals(1, Smell1AlmostBest.toPower(5, 0), "5^0 should be 1");
        assertEquals(0, Smell1AlmostBest.toPower(0, 0), "0^0 should be 1");
        assertEquals(0, Smell1AlmostBest.toPower(0, 4), "0^4 should be 0");
    }

    }
