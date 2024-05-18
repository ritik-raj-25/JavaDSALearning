package StringBuilders;

import java.util.Scanner;

public class MaximumFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] freq = new int[26];
        for(int i=0; i<str.length(); ++i){
            ++freq[str.charAt(i)-'a'];
        }
        int maxFreq = 0;
        for(int i=0; i<freq.length; ++i){
            if(maxFreq < freq[i]){
                maxFreq = freq[i];
            }
        }
        for(int i=0; i<freq.length; ++i){
            if(maxFreq == freq[i]){
                System.out.println((char)(i+97)+" "+maxFreq);
            }
        }
        scan.close();
    }
}
