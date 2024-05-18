package Arrays1D.Assignment;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 12, 5, 1, 3, 6, 4, 2, 4, 2};
        int n = arr.length;
        boolean flag = true; // true means 1st non-repeating element
        for(int i=0; i<n; ++i){
            flag = true;
            for(int j=0; j<n; ++j){
                if(i != j && arr[i] == arr[j]) {
                    flag = false; // false means repeating element
                    break;
                }
            }
            if(flag == true){
                System.out.println("First non-repeating element is "+arr[i]);
                break;
            }
        }
    }
}
