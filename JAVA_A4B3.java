import java.util.HashMap;
import java.util.TreeMap;

public class JAVA_A4B3 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(3, "Pune");
        map.put(1, "Mumbai");
        map.put(4, "Nashik");
        map.put(2, "Nagpur");

        System.out.println("Before Sorting:");
        System.out.println(map);

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println("After Sorting by Keys:");
        System.out.println(sortedMap);
    }
}