package Method;

class Calculator1 {
    int a;  //instance variable
    int b;  //instance variable
    int res; //instance variable

    void add(){   //Method Declaration
        a = 10;
        b = 20;
        res = a + b;
        System.out.println(res);
    }
}

public class NoParametersAndNoReturnValue {  
    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        calc.add();   //Method call or Method Invocation
    }
}