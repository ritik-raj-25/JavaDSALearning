package Recursion;

public class Subsets {
    public static void printAllSubsets(int i, String s, String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        printAllSubsets(i+1, s, ans+s.charAt(i)); //include(do not skip a character)
        printAllSubsets(i+1, s, ans); //exclude(skip a character)
    }
    public static void main(String[] args) {
        String s = "abc";
        printAllSubsets(0,s,"");
    }
}