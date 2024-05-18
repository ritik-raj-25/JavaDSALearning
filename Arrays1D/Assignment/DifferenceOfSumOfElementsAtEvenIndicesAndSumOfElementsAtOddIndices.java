package Arrays1D.Assignment;

public class DifferenceOfSumOfElementsAtEvenIndicesAndSumOfElementsAtOddIndices{
    public static void main(String[] args) {
        int[] arr = {13,4,9,6,1,9,12,14};
        int n = arr.length;
        int sumOdd = 0;
        int sumEven = 0;
        //solution
        for(int i=0; i<n; ++i){
            if(i%2==0){
                sumEven += arr[i];
            }
            else{
                sumOdd += arr[i];
            }
        }
        int diff = sumEven - sumOdd;
        System.out.println("Required difference  = "+diff);
    }
}