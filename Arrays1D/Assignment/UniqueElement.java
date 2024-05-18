package Arrays1D.Assignment;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 3, 2, 4, 7, 7};
        int n = arr.length;
        int res = 0;;
        for(int i=0; i<n; ++i){
            res = res^arr[i];
        }
        System.out.println("The unique element is "+res);
    }
}
