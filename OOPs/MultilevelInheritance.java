package OOPs;

class _Animal {
    public void eat(){
        System.out.println("Eating...");
    }
}

class _Dog extends _Animal{ 
    public void bark(){
        System.out.println("Barking...");
    }
}

class BabyDog extends _Dog{ //Multilevel inheritance
    public void weep(){
        System.out.println("Weeping...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.bark();
        bd.weep();
    }
}
