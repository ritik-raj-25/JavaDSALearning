package OOPs;

public class StaticBlockNonStaticBlock {
    static{
        System.out.println("1st static block...");
    }
    static{
        System.out.println("2nd static block...");
    }
    static{
        System.out.println("3rd static block...");
    }

    {
        System.out.println("1st non-static block...");
    }
    {
        System.out.println("2nd non-static block...");
    }
    {
        System.out.println("3rd non-static block...");
    }
    StaticBlockNonStaticBlock(){
        System.out.println("Inside constructor...");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Inside main...");
        StaticBlockNonStaticBlock d1 = new StaticBlockNonStaticBlock();
        StaticBlockNonStaticBlock d2 = new StaticBlockNonStaticBlock();
    }
}

// O/P:
// 1st static block...
// 2nd static block...
// 3rd static block...
// Inside main...
// 1st non-static block...
// 2nd non-static block...
// 3rd non-static block...
// Inside constructor...
// 1st non-static block...
// 2nd non-static block...
// 3rd non-static block...
// Inside constructor...
