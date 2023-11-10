package Lecture29_ArrayListInJava;

import java.util.ArrayList;
import java.util.Collections;

public class StringInAscendingAndDescendingOrder {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Welcome");
        list.add("To");
        list.add("College");
        list.add("Wallah");
        System.out.println("Original list : "+list);
        Collections.sort(list);
        System.out.println("Sorted list (Ascending) : "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reversed Sorted list (Descending) : "+list);
    }
}
