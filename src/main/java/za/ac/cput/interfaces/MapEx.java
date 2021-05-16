/*
Author: Grant Metcalf - 217222943
Description: Using the map interface
 */

package za.ac.cput.interfaces;

import java.util.TreeMap;
import java.util.Map;

public class MapEx {

    private Map<Integer, String> pcParts = new TreeMap<>();

    public int getMapSize() {
        return pcParts.size();
    }

    public void add (Integer performance, String manufacturer){
        pcParts.put(performance,manufacturer);
    }

    public void remove(Integer performance){
        pcParts.remove(performance);
    }

    public boolean find(String manufacturer){
        return pcParts.containsValue(manufacturer);
    }
}
