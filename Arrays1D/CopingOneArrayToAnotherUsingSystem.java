package Arrays1D;

public class CopingOneArrayToAnotherUsingSystem {
    public static void main(String[] args) {
        int[] sourceArray = {10, 20, 30, 40, 50};
        int[] destinationArray = new int[5];
        System.arraycopy(sourceArray, 0, destinationArray, 0, destinationArray.length);
        System.out.print("DistinationArray: ");
        for(int ele : destinationArray) {
            System.out.print(ele+" ");
        }
    }
}
