package OOPs;

class Animal_ {
    public void eat(){
        System.out.println("Eating...");
    }
}

class Dog_ extends Animal_ {
    public void bark(){
        System.out.println("Barking...");
    }
}

class Cat_ extends Animal { //Hierarchical Inheritance
    public void meow(){
        System.out.println("Meowing...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog_ d1 = new Dog_();
        d1.eat();
        d1.bark();

        Cat_ c1 = new Cat_();
        c1.eat();
        c1.meow();
    }
}
