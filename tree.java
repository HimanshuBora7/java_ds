
// Tree ds
// Treemap is a key value pair 
import java.util.TreeMap;

public class tree {
    public static void main(String[] args) {
        TreeMap<Integer, String> name = new TreeMap<>();
        // Putting the key value pair in tree

        name.put(1, "one");
        System.out.println(name);

        name.put(2, "two");
        name.put(1, "one");
        name.put(3, "Three");

        System.out.println(name);

        // accessing the elements
        // using entrySet() // it returns set of key value pairs present in the map
        System.out.println("Key/Value mappings: " + name.entrySet());

        // printing keySet()
        System.out.println("Key/Value mappings: " + name.keySet());
        // using .values()
        System.out.println("Key/Value mappings: " + name.values());

        // get() or getOrDefault()
        // get () - return the values associated with the key , returns null if key
        // doesn't exist
        System.out.println(name.get(10));
        // getOrDefault - two arguments r passed one is key and another one is default
        // value which is returned if key doesn't exist
        System.out.println(name.getOrDefault(11, "not found"));

        // Removing TreeMap elements

        // remove(key) -returns and removes the entry associated with the specified key
        // from a TreeMap.
        System.out.println("Key/Value mappings: " + name.entrySet());
        System.out.println("value associated with 3 is removed " + name.remove(3));
        System.out.println("Key/Value mappings: " + name.entrySet());
        System.out.println("Key/Value mappings: " + name);

        // Ceiling,floor,higher and lower methods

        System.out.println("Higher Key: " + name.higherKey(1));
        System.out.println("Higher Entry : " + name.higherEntry(1));
        System.out.println("cieling key : " + name.ceilingKey(0));
        System.out.println("cieling key : " + name.ceilingKey(1));

    }
}
