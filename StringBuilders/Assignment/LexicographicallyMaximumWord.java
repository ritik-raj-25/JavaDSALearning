package StringBuilders.Assignment;

import java.util.ArrayList;

public class  LexicographicallyMaximumWord {
    public static void main(String[] args) {
        String str = "c express powered by coding sena";
        ArrayList<String> al = new ArrayList<>();
        int n = str.length();
        int i = 0;
        int j = 0;
        while(j < n){
            if(str.charAt(j) == ' '){
                al.add(str.substring(i, j));
                i = j+1;
            }
            ++j;
        }
        al.add(str.substring(i, j));
        String mxs = "";
        for(i=0; i<al.size(); ++i){
            if(al.get(i).compareTo(mxs) > 0){
                mxs = al.get(i);
            }
        }
        System.out.println(mxs);
    }
}
