// In this case we declare the exception,
// 1. if exception does not occur, the code will be executed fine.
// 2. if the exception occurs, it will be thrown at runtime because 
//    throws does not handle the exception.

package ExceptionHandling;

import java.io.IOException;

class E {
    public void e() throws IOException{
        throw new IOException("Device error...");
        //System.out.println("Device operation performed...");
    }
}

public class ThrowsKeywordAndCheckedException2 {
    public static void main(String[] args) throws IOException{ //declaring checked exception
        E e1 = new E();
        e1.e();
        System.out.println("End of the program...");
    }
}
