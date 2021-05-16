package za.ac.cput.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetExTest {

    SetEx gpuId;

    @BeforeEach
    void setUp() {
        gpuId = new SetEx();
        gpuId.add(3080);
        gpuId.add(3070);
    }

    @Test
    void add() {
        gpuId.add(3060);
        assertEquals(3, gpuId.getSetSize());
    }

    @Test
    void remove() {
        gpuId.remove(3070);
        assertEquals(1, gpuId.getSetSize());
    }

    @Test
    void find() {
        assertTrue(gpuId.find(3080));
    }
}