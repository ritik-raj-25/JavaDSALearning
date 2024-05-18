package StringBuilders;

public class BuildinMethods {
    public static void main(String[] args) {
        // setCharAt() --> used to update the string builder
        StringBuilder sb = new StringBuilder("College");
        sb.setCharAt(4, 'a');
        System.out.println(sb);

        // append() --> used to append int, char, float, double, String, StringBuilder, char array(int array does not get appended correctly), etc to the StringBuilder.
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = new StringBuilder("xyz");
        a.append(b);
        System.out.println(a);

        // deleteCharAt() --> used to delete a character from a particular index
        StringBuilder c = new StringBuilder("Care");
        c.deleteCharAt(3);
        System.out.println(c);

        // delete(i,j) --> used to delete characters from index i to j-1
        StringBuilder d = new StringBuilder("abcxyxd");
        d.delete(3, 6);
        System.out.println(d); 

        // insert() --> used to insert int, char, float, double, String, StringBuilder, char array(int array does not get inserted correctly), etc to the StringBuilder. 
        StringBuilder e = new StringBuilder("abcxyz");
        e.insert(3,'p');
        System.out.println(e);

        // reverse() --> used to reverse a string builder
        StringBuilder f = new StringBuilder("abcdef");
        f.reverse();
        System.out.println(f);
    }
}
