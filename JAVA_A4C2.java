import java.util.*;

public class JAVA_A4C2 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Add integer elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);

        // i. Add element at first position
        list.addFirst(5);
        System.out.println("After adding at first: " + list);

        // ii. Delete last element
        list.removeLast();
        System.out.println("After deleting last: " + list);

        // iii. Display size of LinkedList
        System.out.println("Size of LinkedList: " + list.size());
    }
}