/*
Author: Grant Metcalf - 217222943
Description: Using the list interface
 */

package za.ac.cput.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

private List<String> gpus = new ArrayList<>();

    public List<String> getGpus() {
        return gpus;
    }

    public void add(String gpu) {
        gpus.add(gpu);
    }

    public void remove(String gpu) {
        gpus.remove(gpu);
    }

    public boolean find(String gpu) {
        return gpus.contains(gpu);
    }
}
