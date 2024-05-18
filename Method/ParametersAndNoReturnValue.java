package Method;

class Calculator3 {
    int a;
    int b;
    int res;

    void add(int a, int b){   //Formal Parameters or Parameters
        res = a + b;
        System.out.println(res);
    }
}

public class ParametersAndNoReturnValue {
    public static void main(String[] args) {
        Calculator3 calc = new Calculator3();
        calc.add(10, 20);   //Actual Parameters or Arguments
    }
}
