package Recursion;

public class RemoveAllOccurences {
    public static void removeOccurences(int j, String s, char ch, String ans){
        if(j==s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(j)!=ch) ans += s.charAt(j);
        removeOccurences(j+1, s, ch, ans);
    }
    public static void main(String[] args) {
        String s = "Ritik Raj";
        removeOccurences(0,s,'i',"");
    }
}