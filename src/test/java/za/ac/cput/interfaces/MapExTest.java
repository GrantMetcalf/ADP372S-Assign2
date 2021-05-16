package za.ac.cput.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapExTest {

    MapEx pcParts;

    @BeforeEach
    void setUp() {
        pcParts = new MapEx();
        pcParts.add(4500, "Intel i5");
        pcParts.add(6000, "Amd r7");
    }

    @Test
    void add() {
        pcParts.add(6500, "Intel i7");
        assertEquals(3, pcParts.getMapSize());
    }

    @Test
    void remove() {
        pcParts.remove(4500);
        assertEquals(1, pcParts.getMapSize());
    }

    @Test
    void find() {
        assertTrue(pcParts.find("Amd r7"));
    }
}