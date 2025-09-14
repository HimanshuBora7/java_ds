//Linked list here used doubly linked list as its ds
// both arraylist and doubly linked list implements List interface 

import java.util.LinkedList;

public class linkedList1 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("Bmw");

        System.out.print(cars);
    }
}
