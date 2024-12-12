package ExceptionHandling;

public class OverridingFinalizeMethod {
    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {
        try{
            System.out.println("Inside finalize() of OverridingFinalizeMehtod class...");
        }catch(Throwable e){
            throw e;
        }finally{
            System.out.println("Calling finalize() of the Object class...");
            super.finalize(); //finalize() is deprecated(outdated) since version 9
        }
    }
    public static void main(String[] args) throws Throwable{
        OverridingFinalizeMethod obj = new OverridingFinalizeMethod();
        obj.finalize();
    }
}
