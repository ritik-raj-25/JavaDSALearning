package OOPs;

interface ICalculator {
    // public abstract
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}

class CalculatorImpl implements ICalculator {
    //While overriding we can't reduce the scope of access modifier 
    public void add(int a, int b){
        System.out.println("The sum is :: "+(a+b));
    }
    public void sub(int a, int b){
        System.out.println("The sub is :: "+(a-b));
    }
    public void mul(int a, int b){
        System.out.println("The mul is :: "+(a*b));
    }
    public void div(int a, int b){
        System.out.println("The div is :: "+(a/b));
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        //Loose Coupling : polymorphism
        ICalculator calc = new CalculatorImpl();
        calc.add(10, 20);
        calc.sub(100, 20);
        calc.mul(10, 20);
        calc.div(100, 20);
    }
}