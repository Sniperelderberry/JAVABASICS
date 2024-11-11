// Superclass
class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

// Intermediate subclass
class Car extends Vehicle {
    void honk() {
        System.out.println("Car honks.");
    }
}

// Derived subclass
class SportsCar extends Car {
    void accelerate() {
        System.out.println("Sports car accelerates.");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar();
        myCar.start();      // Method from Vehicle
        myCar.honk();       // Method from Car
        myCar.accelerate(); // Method from SportsCar
    }
}
