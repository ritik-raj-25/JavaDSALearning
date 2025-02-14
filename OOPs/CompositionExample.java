//Car and Engine

package OOPs;

class Engine {
    private String type;
    public Engine(String type) {
        this.type = type;
    }
    public void displayInfo(){
        System.out.println("Engine Type: "+type);
    }
}

class Car {
    private String brand;
    private Engine engine;

    public Car(String brand, String engineType) {
        this.brand = brand;
        this.engine = new Engine(engineType); //Composition
    }

    public void displayInfo() {
        System.out.println("Car brand: "+brand);
        engine.displayInfo();
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "V8 Engine");

        car.displayInfo();
    }
}
