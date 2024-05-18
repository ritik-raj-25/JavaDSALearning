package BasicSortingAlgorithms;

public class StringBubbleSort {
    public static void main(String[] args) {
        String[] arr = {"pnb","abc","ade","def","ijk","pqr"};
        int n = arr.length;
        for(int i=0; i<n-1; ++i){
            boolean flag = true;
            for(int j=0; j<n-1-i; ++j){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String s = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = s;
                    flag = false;
                }
                if(flag == true) break;
            }
        }
        for(String s : arr) {
            System.out.print(s+" ");
        }
    }
}
