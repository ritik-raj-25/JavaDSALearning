package OOPs;

class Addition{
    //Var-Args:: 0 to n
    public void add(int... args){ //Method with variable arguments(var-args)
        int sum = 0 ;
        for (int ele : args) {
            sum += ele;
        }
        System.out.println("Sum is :: "+sum);
    }
}

public class VariableArgument {
    public static void main(String[] args) {
        Addition ad = new Addition();
        ad.add();
        ad.add(10);
        ad.add(10,20);
        ad.add(10,20,30);
        ad.add(10,20,30,40);
        ad.add(10,20,30,40,50);
    }
}
