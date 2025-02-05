package map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        // HashMap Example
        Map<Object, String> hashMap = new HashMap<>();
        // WeakHashMap Example
        Map<Object, String> weakHashMap = new WeakHashMap<>();

        // Creating keys
        Object key1 = new String("key1");
        Object key2 = new String("key2");

        // Adding key-value pairs
        hashMap.put(key1, "HashMap Value");
        weakHashMap.put(key2, "WeakHashMap Value");

        // Making keys null
        key1 = null;
        key2 = null;

        // Requesting Garbage Collection
        System.gc();
        Thread.sleep(1000); // Giving GC time to process

        // Checking if keys are still present
        System.out.println("HashMap after GC: " + hashMap);
        System.out.println("WeakHashMap after GC: " + weakHashMap);
    }
}
