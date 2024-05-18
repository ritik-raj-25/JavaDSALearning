package Arrays1D.Assignment;

public class IsPalendrome {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        //solution
        boolean flag = true; //true means palendrome
        while(i < j){
            if(arr[i] != arr[j]){
                flag = false; //false means not palendrome
                break;
            }
            ++i;
            --j;
        }
        if(flag == true){
            System.out.println("The given array is palendrome.");
        }
        else{
            System.out.println("The given array is not palendrome.");
        }
    }
}
