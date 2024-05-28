package OOPs;

class Calculator{
    public void add(int a, int b){
        System.out.println("int-int argument...");
    }
    public void add(float a, float b){
        System.out.println("float-float argument...");
    }
    public void add(double a, double b){
        System.out.println("double-double argument...");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20); //int-int
        c.add(10.0f,20.0f);//flaot-float
        c.add(10.0,20.0);//double-double
    }
}
