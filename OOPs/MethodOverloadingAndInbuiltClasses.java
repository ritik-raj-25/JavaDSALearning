package OOPs;

class Sample{
    public void methodOne(String s){
        System.out.println("String version...");
    }
    public void methodOne(Object o){
        System.out.println("Object version...");
    }
}

public class MethodOverloadingAndInbuiltClasses {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.methodOne("Ritik"); //String (exact match)
        s.methodOne(new Object()); //Object (exact match)
        s.methodOne(null); //String(child) -> reference, Object(parent) -> reference
        //                   In this case compiler will give preference to child
    }
}
