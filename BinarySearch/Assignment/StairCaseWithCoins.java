package BinarySearch.Assignment;

import java.util.Scanner;

public class StairCaseWithCoins {
    public static int arrangeCoins(long n) {
        long lo=1, hi=n;
        long ans=0;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(mid*(mid+1)/2 <= n){
                ans=mid;
                lo = mid+1; 
            }
            else hi = mid-1;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println(arrangeCoins(n));
        scan.close();
    }
}