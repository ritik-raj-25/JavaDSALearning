package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            //code that may raise exception
            int res = a/b;
            // if exception occurs, the remaining statement of this try block will not exceute  
            System.out.println(res);
            System.out.println("Rest of the code of try block...");
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("End of the program...");
    }
}
