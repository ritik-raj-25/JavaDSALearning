package Arrays2D;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {
    public static void main(String[] args) {
        //Declaration 
        List<List<Integer>> l = new ArrayList<>();

        //Adding 1D ArrayList to 2D ArrayList
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = new ArrayList<>();
        b.add(21);
        b.add(22);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(31);
        l.add(a);  //Adding ArrayList a
        l.add(b);  //Adding ArrayList b
        l.add(c);  //Adding ArrayList c
        l.add(d);  //Adding ArrayList d

        //Printing 2D ArrayList
        for(int i=0; i<l.size(); ++i) {
            System.out.println(l.get(i));
        }
        System.out.println();

        for(int i=0; i<l.size(); ++i){
            for(int j=0; j<l.get(i).size(); ++j){
                System.out.print(l.get(i).get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println(l);
        System.out.println();

        //Removing a 1D ArrayList from 2D ArrayList
        l.remove(0);
        System.out.println(l);
        System.out.println();

        //Deleting 2D ArrayList
        l.clear();
        System.out.println(l);
        System.out.println();

        //Convert 1D ArrayList to 1D Array
        Object[] arr = a.toArray();
        for(Object o : arr){  //Printing the array using for each loop
            System.out.print(o+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length; ++i){  //Printing the array using for loop
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
