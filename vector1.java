import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class vector1 {
    public static void main(String[] args) {
        Vector<String> cars = new Vector<>();

        cars.add("mercedez");
        cars.add("Ford");
        cars.add("BMW");
        System.out.println(cars);

        // sorting it alphabetically using collections framework
        Collections.sort(cars);
        System.out.println(cars);

        // using iterator to loop through the vector

        Iterator<String> iterate = cars.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next()); // if we are not using next method then this will go in an infinite loop
            System.out.print(" , ");
        }

    }
}
