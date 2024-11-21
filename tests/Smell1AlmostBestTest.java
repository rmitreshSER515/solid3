package solid3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Smell1AlmostBestTest {

    @Test
    void testPowerZero() {
        assertEquals(1, Smell1AlmostBest.toPower(5, 0), "n^0 should equal 1");
    }

    @Test
    void testPowerOne() {
        assertEquals(5, Smell1AlmostBest.toPower(5, 1), "n^1 should equal n");
    }

    @Test
    void testNegativeBaseEvenPower() {
        assertEquals(4, Smell1AlmostBest.toPower(-2, 2), "(-n)^even should be positive");
    }

    @Test
    void testNegativeBaseOddPower() {
        assertEquals(-8, Smell1AlmostBest.toPower(-2, 3), "(-n)^odd should be negative");
    }

    @Test
    void testCacheHit() {
        assertEquals(8, Smell1AlmostBest.toPower(2, 3));
        assertEquals(8, Smell1AlmostBest.toPower(2, 3), "Cached value should be used");
    }

    @Test
    void testLargePower() {
        assertEquals(0, Smell1AlmostBest.toPower(0, 1000), "0^n should equal 0 for n > 0");
    }

    @Test
    void testNegativePower() {
        assertThrows(IllegalArgumentException.class, () -> Smell1AlmostBest.toPower(2, -1));
    }
}
