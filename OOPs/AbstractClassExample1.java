package OOPs;

abstract class Plane {
    //Exposing set of services offered and hiding the internal implementation
    public abstract void takeOff();
    public abstract void fly();
    public abstract void land();
}

class PassengerPlane extends Plane{
    public void takeOff(){
        System.out.println("Passenger-Plane tookOff...");
    }
    public void fly(){
        System.out.println("Passenger-Plane is flying...");
    }
    public void land(){
        System.out.println("Passenger-Plane is landing...");
    }
}

class CargoPlane extends Plane{
    public void takeOff(){
        System.out.println("Cargo-Plane tookOff...");
    }
    public void fly(){
        System.out.println("Cargo-Plane is flying...");
    }
    public void land(){
        System.out.println("Cargo-Plane is landing...");
    }
}

class FighterPlane extends Plane{
    public void takeOff(){
        System.out.println("Fighter-Plane tookOff...");
    }
    public void fly(){
        System.out.println("Fighter-Plane is flying...");
    }
    public void land(){
        System.out.println("Fighter-Plane is landing...");
    }
}

class Airport {
    //Dynamic Method Dispatch or Runtime polymorphism
    public void allowPlane(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}

public class AbstractClassExample1 {
    public static void main(String[] args) {
        Airport ap = new Airport();
        ap.allowPlane(new PassengerPlane());
        ap.allowPlane(new CargoPlane());
        ap.allowPlane(new FighterPlane());
    }
}
