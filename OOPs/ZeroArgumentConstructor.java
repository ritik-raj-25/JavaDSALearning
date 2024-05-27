package OOPs;

class EmployeeExample{
    //Instance Variable
    String name;
    int age;

    //Zero Argument Constructor
    EmployeeExample(){
        System.out.println("EmployeeExample Constructor Called...");
    }

    //Instance Method
    public void disp(){
        System.out.println("Name is :: "+name);
        System.out.println("Age is  ::"+age);
    }
}

public class ZeroArgumentConstructor {
    public static void main(String[] args) {
        EmployeeExample e1 = new EmployeeExample();
        e1.disp();
    }
}
