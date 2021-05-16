package za.ac.cput.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListExTest {

    ListEx gpus;

    @BeforeEach
    void setUp() {
        gpus = new ListEx();
        gpus.add("Nvidia 3070");
        gpus.add("AMD 6800");
    }

    @Test
    void add() {
        gpus.add("Nvidia 3080");
        assertEquals("Nvidia 3080", gpus.getGpus().toArray()[2]);
    }

    @Test
    void remove() {
        gpus.remove("Nvidia 3080");
        assertEquals(gpus.getGpus().size(), 2);
        assertFalse(gpus.find("Nvidia 3080"));
    }

    @Test
    void find() {
        assertTrue(gpus.find("Nvidia 3070"));
    }
}