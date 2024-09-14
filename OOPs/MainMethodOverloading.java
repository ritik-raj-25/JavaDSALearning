// We can overload main() method.
// JVM calls main() method which receives string array as arguments only.

package OOPs;

public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("String array version...");
        main(4); //int (exact match)
        main("Ritik"); //String (excat match)
    }
    public static void main(String args) {
        System.out.println("String version...");
    }
    public static void main(int args) {
        System.out.println("int version...");
    }
}
