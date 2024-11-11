// Parent class
class Vehicle1 {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

// Child class
class Car extends Vehicle1 {
    void honk() {
        System.out.println("Car honks.");
    }
}

// Main class to demonstrate inheritance
public class SingleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Calling method from the parent class
        car.honk(); // Calling method from the child class
    }
}
