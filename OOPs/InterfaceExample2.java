package OOPs;

interface ICalculator_{
    // public abstract
    void add(int a, int b);
    void sub(int a, int b);
}

interface IAdvancedCalculator_{
    // public abstract
    void mul(int a, int b);
    void div(int a, int b);
}

// Multiple Inheritance
class CalculatorImpl_ implements ICalculator_, IAdvancedCalculator_ {
    //ICalculator_
    //While overriding we can't reduce the scope of access modifier 
    public void add(int a, int b){
        System.out.println("The sum is :: "+(a+b));
    }
    public void sub(int a, int b){
        System.out.println("The sub is :: "+(a-b));
    }

    //IAdvancedCalculator_
    public void mul(int a, int b){
        System.out.println("The mul is :: "+(a*b));
    }
    public void div(int a, int b){
        System.out.println("The div is :: "+(a/b));
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        //Loose Coupling : polymorphism
        ICalculator_ calc1 = new CalculatorImpl_();
        calc1.add(10, 20);
        calc1.sub(100, 20);

        //Loose Coupling : polymorphism
        IAdvancedCalculator_ calc2 = new CalculatorImpl_();
        calc2.mul(10, 20);
        calc2.div(100, 20);
    }
}
