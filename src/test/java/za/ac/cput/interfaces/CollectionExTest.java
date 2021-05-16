/*
Author: Grant Metcalf - 217222943
Description: Testing the collection interface
 */

package za.ac.cput.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionExTest {

    CollectionEx cpus;

    @BeforeEach
    void setUp() {
        cpus = new CollectionEx();
        cpus.add("Intel 8700k");
        cpus.add("AMD 3600x");
    }

    @Test
    void add() {
        cpus.add("Intel 9700k");
        assertEquals("Intel 9700k", cpus.getCpus().toArray()[2]);
    }

    @Test
    void remove() {
        cpus.remove("Intel 9700k");
        assertEquals(cpus.getCpus().size(), 2);
        assertFalse(cpus.find("Intel 9700k"));
    }

    @Test
    void find() {
        assertTrue(cpus.find("Intel 8700k"));
    }
}
