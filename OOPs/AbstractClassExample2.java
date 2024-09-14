package OOPs;

abstract class Bird {
    public abstract void fly();
    public abstract void eat();
}

class Sparrow extends Bird {
    public void fly(){
        System.out.println("Sparrow fly @short height...");
    }
    public void eat(){
        System.out.println("Sparrow eat grains...");
    }
}

//abstract class can contain concrete and abstract methods
//concrete methods : A method with implementation
//abstrct methods : A method without implementation

abstract class Eagle extends Bird {
    public void fly(){
        System.out.println("Eagle fly @very very height...");
    }
    public abstract void eat();
}

class GoldenEagle extends Eagle  {
    public void eat(){
        System.out.println("Golden eagel catches prey over the ocean...");
    }
}

class SerpentEagle extends Eagle {
    public void eat(){
        System.out.println("Serpent eagel eats snakes...");
    }
}

class Crow extends Bird {
    public void fly(){
        System.out.println("Crow fly @medium height...");
    }
    public void eat(){
        System.out.println("Crow eat grains...");
    }
}

class Sky {
    public void allowBird(Bird ref){
        ref.eat();
        ref.fly();
        System.out.println();
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {
        Sky s = new Sky();
        s.allowBird(new Crow());
        s.allowBird(new SerpentEagle());
        s.allowBird(new GoldenEagle());
        s.allowBird(new Sparrow());
    }
}
