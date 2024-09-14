package OOPs;

class DogAnimal { // We need to count the number of objects of this class
    String breed;
    float age;
    int price;

    static int cnt = 0;

    DogAnimal(){
        breed = "Pug";
        age = 4.5f;
        price = 4_500;
        ++cnt;
    }

    DogAnimal(String breed, float age, int price){
        this.breed = breed;
        this.age = age;
        this.price = price;
        ++cnt;
    }
}

public class ObjectCount {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        DogAnimal d1 = new DogAnimal();
        DogAnimal d2 = new DogAnimal("BullDog",6.5f,6500);
        DogAnimal d3 = new DogAnimal();

        System.out.println("Number of objects of DogAnimal class: "+DogAnimal.cnt);
    }
}
