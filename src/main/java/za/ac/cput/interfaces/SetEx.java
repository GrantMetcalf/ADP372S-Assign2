/*
Author: Grant Metcalf - 217222943
Description: Using the set interface
 */

package za.ac.cput.interfaces;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

    private Set<Integer> gpuId = new HashSet<>();

    public int getSetSize() {
        return gpuId.size();
    }

    public void add(int id) {
        gpuId.add(id);
    }

    public void remove(int id) {
        gpuId.remove(id);
    }

    public boolean find(int id) {
        return gpuId.contains(id);
    }

}