// Importing required classes
package Maps;

import java.util.*;

// Main class
public class linkedhashmap {

    // Main driver method
    public static void main(String[] args){

        // Creating an empty HashMap
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();

	// Inserting entries in the Map
	// using put() method
	map.put("Dennis", 33);
        map.put("Charlie", 30);
        map.put("Frank", 45);

		// Iterating over Map
		for (Map.Entry e : map.entrySet()){

			// Printing key-value pairs
			System.out.println(e.getKey() + " "	+ e.getValue());
                }
	}
}

	