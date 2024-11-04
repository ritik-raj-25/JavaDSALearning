//In this case we handle the exception, the code will be executed fine whether 
//exception occurs during the program or not.

package ExceptionHandling;

import java.io.IOException;

class M {
    public void m() throws IOException{
        throw new IOException("Device Error...");
    }
}

public class ThrowsKeywordAndCheckedException {
    public static void main(String[] args) {
        M m1 = new M();
        try{
            m1.m();
        }catch(IOException e){
            System.out.println("IOException: "+e.getMessage());
        }
        System.out.println("End of the program...");
    }
}
