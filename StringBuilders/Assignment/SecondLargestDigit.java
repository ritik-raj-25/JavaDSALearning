package StringBuilders.Assignment;

public class SecondLargestDigit {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("23654");
        int n = sb.length();
        char mxc = '0';
        char smxc = '0';
        for(int i=0; i<n; ++i){
            if(sb.charAt(i) > mxc){
                smxc = mxc;
                mxc = sb.charAt(i);
            }
            else if(sb.charAt(i)!=mxc && sb.charAt(i)>smxc) {
                smxc = sb.charAt(i);
            }
        }
        System.out.println("Second largest character:"+smxc);
    }
}
