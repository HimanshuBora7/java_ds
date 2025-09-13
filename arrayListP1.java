
// wap to add numbers in ArrayList and print them 
import java.util.*;

public class arrayListP1 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(5);
        num.add(25);
        num.add(15);
        num.add(10);

        num.add(35);

        // b4 sorrting
        System.out.println("b4 sorting");
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("After sorting using collections sort");

        Collections.sort(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
        int sum = 0;

        for (int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }
        System.out.println(" sum " + sum);
    }
}
