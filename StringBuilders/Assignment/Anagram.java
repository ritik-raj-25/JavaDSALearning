package StringBuilders.Assignment;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String[] arr = {"ritik", "irtik", "krtii", "ikitr"};
        int n = arr.length;
        boolean flag = true;  //true means strings are in anagram
        for(int i=1; i<n; ++i){
            if(arr[i-1].length() != arr[i].length()){
                flag = false; //false means strings are not in anagram
                break;
            }
            else {
                char[] s = arr[i-1].toCharArray();
                char[] t = arr[i].toCharArray();
                Arrays.sort(s);
                Arrays.sort(t);
                if(!compare(s,t)){
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
    public static boolean compare(char[] s, char[] t){
        for(int i=0; i<s.length; ++i){
            if(s[i] != t[i]){
                return false;
            }
        }
        return true;
    }
}
