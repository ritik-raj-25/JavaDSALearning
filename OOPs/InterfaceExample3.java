package OOPs;

interface ICalculator__{
    // public abstract
    void add(int a, int b);
    void sub(int a, int b);
}

class CalculatorAdvanced__{
    public void mul(int a, int b){
        System.out.println("The mul is :: "+(a*b));
    }
    public void div(int a, int b){
        System.out.println("The div is :: "+(a/b));
    }
}

//1. extends
//2. implements
class CalculatorImpl__ extends CalculatorAdvanced__ implements ICalculator{
    public void add(int a, int b){
        System.out.println("The sum is :: "+(a+b));
    }
    public void sub(int a, int b){
        System.out.println("The sub is :: "+(a-b));
    }
}

public class InterfaceExample3 {
    public static void main(String[] args) {
        CalculatorImpl__ calc = new CalculatorImpl__();
        calc.add(10, 20);
        calc.sub(100, 20);
        calc.mul(10, 20);
        calc.div(100, 20);
    }
}
