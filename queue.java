import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<String>();
        names.add("james");
        names.add("Charlie");
        names.add("Ron");
        names.add("jammie");
        // access the first element

        String s1 = names.peek();

        System.out.println("first string in the linked list : " + s1);

        // access the element and concurrently remove it also
        // poll method returns the head and deletes it from the queue

        String s2 = names.poll();
        System.out.println(" head of the string : " + s2);

        System.out.println(names);

        // .offer() method is used to insert element at the end of the queue
    }
}
