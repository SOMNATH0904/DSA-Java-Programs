package Lecture29_ArrayListInJava;

import java.util.ArrayList;

public class StartArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        // Adding New Element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // Get an element at index i
        System.out.println(l1.get(0)); // 5
        System.out.println(l1.get(1)); // 6

        // Printing with For loop
        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) + " "); // 5 6 7 8
        }
        System.out.println();

        // Printing the Array-List directly
        System.out.println(l1); // [5, 6, 7, 8]

        // Adding element at some index i
        l1.add(1,32);
        System.out.println(l1); // [5, 32, 6, 7, 8]

        // Modifying element at index i
        l1.set(1, 42);
        System.out.println(l1); // [5, 42, 6, 7, 8]

        // Removing an element at index i
        l1.remove(1);
        System.out.println(l1); // [5, 6, 7, 8]

        // Removing an element e (We don't know the index)
        l1.remove(Integer.valueOf(7));
        System.out.println(l1); // [5, 6, 8]
        l1.remove(Integer.valueOf(17)); // 17 is not present just we are seeing what it tells
        System.out.println(l1); // [5, 6, 8] ... // It will give no error
        System.out.println(l1.remove(Integer.valueOf(5))); // It will return boolean value as true as the element 7 is present in the Array-List
        System.out.println(l1.remove(Integer.valueOf(17))); // It will return boolean value as false as the element 17 is not present in the Array-List

        // Checking if an element exist
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans); // true
        boolean ans2 = l1.contains(Integer.valueOf(60));
        System.out.println(ans2); // false

        // If you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("Somnath");
        l.add(5);
        l.add(true);
        System.out.println(l); // [Somnath, 5, true]

    }
}
