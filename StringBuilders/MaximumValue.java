package StringBuilders;

public class MaximumValue {
    public static void main(String[] args) {
        String[] arr = {"025", "1", "2", "0025"};
        int n = arr.length;
        String mxs = arr[0];
        for(int i=1; i<n; ++i){
            mxs = max(mxs,arr[i]);
        }
        System.out.println(mxs);
    }
    public static String max(String s, String t) {
        String a = purify(s);
        String b = purify(t);
        if(a.length() > b.length()) return s;
        if(a.length() < b.length()) return t;
        for(int i=0; i<a.length(); ++i) {
            if(a.charAt(i) < b.charAt(i)) return t;
            if(a.charAt(i) > b.charAt(i)) return s;
        }
        if(s.length() > t.length()) return s;
        else return t;
    }
    public static String purify(String str){
        int i = 0;
        while(str.charAt(i) == '0') {
            ++i;
        }
        return str.substring(i);
    }
}