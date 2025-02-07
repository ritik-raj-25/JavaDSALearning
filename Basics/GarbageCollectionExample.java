package Basics;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        System.out.println("Requestiong garbage collection...");
        System.gc(); //suggest JVM to start garbage collection
        System.out.println("Garbage collection requested.");
    }
}
