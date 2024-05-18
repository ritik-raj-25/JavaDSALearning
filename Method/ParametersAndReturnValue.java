package Method;

class Calculator4 {
    int res;

    int add(int a, int b){ 
        res = a + b;
        return res;    //When return statement is executed, immediately from the same point, the control exits the method with the value being returned.
    }
}

public class ParametersAndReturnValue {
    public static void main(String[] args) {
        Calculator4 calc = new Calculator4();
        int sum = calc.add(10, 20);
        System.out.println(sum);
    }
}
