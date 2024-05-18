package BasicSortingAlgorithms.Assignment;

import java.util.Arrays;

public class Question9 {
    public static void main(String[] args) {
        int[] a = {5,3,0,7,4};
        int n = a.length;
        Arrays.sort(a);
        int num1 = 0;
        int num2 = 0;
        for(int i=0; i<n; ++i){
            if(i%2==0) num1 = num1*10+a[i];
            else num2 = num2*10+a[i];
        }
        System.out.println(num1+num2);
    }
}
