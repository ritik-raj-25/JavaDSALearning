package BasicSortingAlgorithms.Assignment;

public class AlmostSorted {
    public static void main(String[] args) {
        int[] a = {2,3,1,4};
        int n = a.length;
        for(int i=0; i<n-1; ++i){
            if(a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                ++i;
            }
        }
        boolean flag = true;
        for(int i=0; i<n-1; ++i){
            if(a[i] > a[i+1]){
                flag = false;
                break;
            }
        }
        if(flag == false) System.out.println("NO");
        else System.out.println("YES");
    }
}
