package Method;

class Calculator2{
    int a;
    int b;
    int res;
    
    int add(){   //Called Method
        a = 10;
        b = 20;
        res = a + b;
        return res;
    }
}

public class NoParametersAndReturnValue {
    public static void main(String[] args) {   //Calling Method
        Calculator2 calc = new Calculator2();
        int sum = calc.add();
        System.out.println(sum);
    }
}
