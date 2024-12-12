//1. If the superclass method does not declare an exception, 
//   subclass overridden method cannot declare the checked exception but 
//   it can declare unchecked exception.

//2. If the superclass method declares an exception, subclass overridden 
//   method can declare same, subclass exception or no exception but 
//   cannot declare parent exception.

package ExceptionHandling;

class A{
    public void msg1(){
        System.out.println("Parent Class (msg1)");
    }
    public void msg2() throws Exception{
        System.out.println("Parent Class (msg2)");
    }
    public void msg3() throws NumberFormatException {
        System.out.println("Parent Class (msg3)");
    }
    public void msg4() throws RuntimeException { 
        System.out.println("Parent Class (msg4)");
    }
}

class B extends A{
    //case - 1
    @Override
    public void msg1() throws ArithmeticException{ //declaring unchecked exception
        System.out.println("Child Class (msg1)");
    }
    //case - 2
    @Override
    public void msg2() throws ArithmeticException{ //subclass exception(IS-A Relation)
        System.out.println("Child Class (msg2)");
    }
    @Override
    public void msg3() { //no exception
        System.out.println("Child Class (msg3)");
    }
    @Override
    public void msg4() throws RuntimeException{ //same exception
        System.out.println("Child Class (msg4)");
    }
}

public class OverridingAndExceptionHandling {
    public static void main(String[] args) {
        B b = new B();
        b.msg1();
        b.msg2();
        b.msg3();
        b.msg4();
    }
}
