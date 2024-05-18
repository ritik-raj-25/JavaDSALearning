package StringBuilders;

public class CompressString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aabbccc"); 
        StringBuilder ans = new StringBuilder("");
        int n = sb.length();
        int i = 0;
        int j = 0;
        while(j<n){
            if(sb.charAt(j) != sb.charAt(i)){
                ans.append(sb.charAt(j-1));
                if(j-i > 1){
                    ans.append(j-i);
                }
                i = j;
            }
            ++j;
        }
        ans.append(sb.charAt(j-1));
        if(j-i > 1){
            ans.append(j-i);
        }
        System.out.println(ans);
    }
}