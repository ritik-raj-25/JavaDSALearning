package StringBuilders;

public class ReverseEachWord {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I am Ritik Raj");
        int n = sb.length();
        int i = 0;
        int j = 0;
        while(j < n){
            if(sb.charAt(j) != ' '){
                ++j;
            }
            else if(sb.charAt(j) == ' '){
                reverse(sb, i, j-1);
                i = j+1;
                while(sb.charAt(i) == ' ') {
                    ++i;
                }
                j = i;
            }
        }
        reverse(sb, i, j-1);
        System.out.println(sb);
    }
    public static void reverse(StringBuilder sb, int i, int j){
        while(i < j){
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            ++i;
            --j;
        }
    }
}
