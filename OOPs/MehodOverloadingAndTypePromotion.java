package OOPs;

class Example{
    public void number(int a){
        System.out.println("int argument...");
    }
    public void number(float a){
        System.out.println("float argument...");
    }
}

public class MehodOverloadingAndTypePromotion {
    public static void main(String[] args) {
        Example e = new Example();
        e.number('a'); //char: char --> int
        e.number(19L); //long: long -->float
        
        //CE: no suitable method found
        //e.number(10.0); //double
    }
}
