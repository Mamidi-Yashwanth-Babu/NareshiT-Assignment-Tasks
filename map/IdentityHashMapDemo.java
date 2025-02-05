package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        // HashMap Example
        Map<String, String> hashMap = new HashMap<>();
        // IdentityHashMap Example
        Map<String, String> identityHashMap = new IdentityHashMap<>();

        // Creating keys with same value but different references
        String key1 = new String("Java");
        String key2 = new String("Java");

        // Adding key-value pairs
        hashMap.put(key1, "HashMap Value 1");
        hashMap.put(key2, "HashMap Value 2");

        identityHashMap.put(key1, "IdentityHashMap Value 1");
        identityHashMap.put(key2, "IdentityHashMap Value 2");

        // Displaying the contents of both maps
        System.out.println("HashMap: " + hashMap);
        System.out.println("IdentityHashMap: " + identityHashMap);
    }
}
