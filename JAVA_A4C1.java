import java.util.*;

public class JAVA_A4C1 {
    public static void main(String[] args) {

        // Create a LinkedList of colours
        LinkedList<String> colours = new LinkedList<>();

        colours.add("Red");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Orange");

        // i. Display using Iterator
        System.out.println("Colours using Iterator:");
        Iterator<String> itr = colours.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // ii. Display in reverse using ListIterator
        System.out.println("\nColours in Reverse Order:");
        ListIterator<String> litr = colours.listIterator(colours.size());

        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        // iii. Insert Pink and Green between Blue and Yellow
        LinkedList<String> newColours = new LinkedList<>();
        newColours.add("Pink");
        newColours.add("Green");

        colours.addAll(2, newColours);

        System.out.println("\nFinal List:");
        System.out.println(colours);
    }
}
