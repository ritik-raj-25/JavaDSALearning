package OOPs;

interface ICalc1 {
    //public abstract
    void add(int a, int b);
}

interface ICalc2 {
    //public abstract
    void sub(int a, int b);
}

interface ICalc3 {
    //public abstract
    void mul(int a, int b);
}

interface ICalc4 extends ICalc1, ICalc2, ICalc3{
    //public abstract
    void div(int a, int b);
}

class CalcImpl implements ICalc4{
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

public class InterfaceExample4 {
    public static void main(String[] args){
        //Loose coupling : ploymorphism 
        ICalc4 c = new CalcImpl();
        c.add(10, 20);
        c.sub(100,20);
        c.mul(10,20);
        c.div(100,20);
    }
}
