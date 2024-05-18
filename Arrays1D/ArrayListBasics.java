package Arrays1D;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(5); 
        //Adding element to the ArrayList
        al.add(0,10); //al[0] = 10
        al.add(1,20);
        al.add(2,30);
        al.add(3,40);
        al.add(4,50);
        //Accessing elements of the ArrayList
        //Method - 1
        for (int i = 0; i<al.size(); ++i) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        //Method - 2
        System.out.println(al);
        //Updating element of the ArrayList
        al.set(2,300);
        System.out.println(al);
        //Adding element to the ArrayList
        al.add(5,60); 
        System.out.println(al);
        //Adding element to the end of the ArrayList
        al.add(70);
        System.out.println(al);
        //Deleting element from the ArrayList
        al.remove(2);
        System.out.println(al);
    }
}
