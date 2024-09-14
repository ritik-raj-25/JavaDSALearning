package OOPs;

class Animal__ {
    public void eat(){
        System.out.println("Amimal is eating...");
    }
    public void sleep(){
        System.out.println("Animal__ is sleeping...");
    }
}

class Monkey extends Animal__{
    @override
    public void eat(){
        System.out.println("Monkey steals and eats...");
    }
    @override
    public void sleep(){
        System.out.println("Monkey is sleeping...");
    }
}

class Deer extends Animal__{
    public void eat(){
        System.out.println("Deer graze and eats...");
    }
    public void sleep(){
        System.out.println("Deer is sleeping...");
    }
}

class Lion extends Animal__{
    public void eat(){
        System.out.println("Lion hunts and eats...");
    }
    public void sleep(){
        System.out.println("Lion is sleeping...");
    }
}

class Forest {
    // True Polymorphism 
    public void allowAnimal(Animal__ an){
        an.eat();
        an.sleep();
        System.out.println();
    }
}

public class TruePloymorphism {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        Deer d = new Deer();
        Lion l = new Lion();

        Forest f = new Forest();
        f.allowAnimal(m);
        f.allowAnimal(d);
        f.allowAnimal(l);
    }
}
