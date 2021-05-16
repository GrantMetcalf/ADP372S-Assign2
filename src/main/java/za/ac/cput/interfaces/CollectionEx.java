/*
Author: Grant Metcalf - 217222943
Description: An example using the collection interface
 */

package za.ac.cput.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {

    private final Collection<String> cpus = new ArrayList<>();

    public Collection<String> getCpus() {
        return cpus;
    }

    public void add(String cpu) {
        cpus.add(cpu);
    }

    public void remove(String cpu) {
        cpus.remove(cpu);
    }

    public boolean find(String cpu) {
        return cpus.contains(cpu);
    }

}
