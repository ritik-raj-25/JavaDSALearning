package Arrays1D.Assignment;

public class UpdateElementsAtEvenAndOddIndices {
    public static void main(String[] args) {
        int[] arr = {13,4,9,6,1,9,12,14};
        int n = arr.length;
        System.out.print("Elements of array before updation: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //solution
        for(int i=0; i<n; ++i){
            if(i%2==0){
                arr[i] += 10;
            }
            else{
                arr[i] *= 2;
            }
        }
        System.out.print("Elements of array after updation: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
