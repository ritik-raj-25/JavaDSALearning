package OOPs;

class MethodOverloadingExample{
    public void add(int a, float b){
        System.out.println("int-float argument...");
    }
    public void add(float a, int b){
        System.out.println("float-int argument...");
    }
}

public class MethodOverloadingAndAmbiguousMehodCall {
    public static void main(String[] args) {
        MethodOverloadingExample me = new MethodOverloadingExample();
        me.add(10,20.0f); //int-float (exactMatch)
        me.add(10.0f,20); //float-int (exactMatch)

        //CE: Ambiguous method call
        //me.add(10,20); int-int: int-int --> int-float
        //                        int-int --> float-int
        //                        int-int --> float-float
    }
}
