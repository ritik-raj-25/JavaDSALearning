package BinarySearch.Assignment;

import java.util.Scanner;

public class PerfectSquare {
    public static boolean isPerfectSquare(int n){
        int lo=0, hi=n;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(mid==n/mid){
                if(n%mid==0) return true;
                else return false;
            }
            else if(mid>n/mid) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println(isPerfectSquare(n));
        scan.close();
    }
}