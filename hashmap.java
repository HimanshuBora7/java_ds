import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> names = new HashMap<>();

        // adding elements to the hashmap
        names.put(1, "java");
        names.put(2, "C");
        names.put(3, "python");
        names.put(4, "javaScript");
        names.put(5, "HTML");
        names.put(5, "Css");

        System.out.println(names);
    }
}
