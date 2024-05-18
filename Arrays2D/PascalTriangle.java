package Arrays2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int m = scan.nextInt();
        List<List<Integer>> pt = new ArrayList<>(m);
        for(int i=0; i<m; ++i){
            pt.add(new ArrayList<>(i+1));
            for(int j=0; j<=i; ++j){
                if(j==0 || j==i) pt.get(i).add(1);
                else {
                    pt.get(i).add(pt.get(i-1).get(j-1) + pt.get(i-1).get(j));
                }
            }
        }
        System.out.println(pt);
        scan.close();
    }
}
