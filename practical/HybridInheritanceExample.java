// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Interface 1
interface Flying {
    void fly();
}

// Interface 2
interface Swimming {
    void swim();
}

// Subclass inheriting from Animal and implementing interfaces
class Duck extends Animal implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("The duck flies.");
    }

    @Override
    public void swim() {
        System.out.println("The duck swims.");
    }
}

// Main class to test the hybrid inheritance
public class HybridInheritanceExample {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.eat(); // Inherited method from Animal
        duck.fly(); // Method from Flying interface
        duck.swim(); // Method from Swimming interface
    }
}
