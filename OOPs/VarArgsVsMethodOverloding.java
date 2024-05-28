package OOPs;

class Demo{
    //Exact Match :: One-Argument
    public void methodOne(int i){
        System.out.println("General Method...");
    }
    //Var-Args :: 0 .... n
    public void methodOne(int... i){
        System.out.println("Var-Args Method...");
    }
}

public class VarArgsVsMethodOverloding {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.methodOne(); //Var-Args
        d.methodOne(10); //General Method (exact match)
        d.methodOne(10,20); //Var-Args
    }
}
