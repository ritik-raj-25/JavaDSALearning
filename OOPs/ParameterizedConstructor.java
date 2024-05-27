package OOPs;

class EmployeeParameterized{
    //Instance Variable
    String name;
    int age;

    //Parameterized Constructor
    EmployeeParameterized(String name, int age){
        System.out.println("EmployeeParameterized Constructor Called...");
        this.name = name;
        this.age = age;
    }

    //Instance Method
    public void disp(){
        System.out.println("Name is :: "+name);
        System.out.println("Age is  ::"+age);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        EmployeeParameterized ep = new EmployeeParameterized("Ritik Raj", 20);
        ep.disp();
    }
}
