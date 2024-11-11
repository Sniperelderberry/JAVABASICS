// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
// Subclass 1
class Dog extends Animal {
    void bark() { System.out.println("The dog barks.");
    }
}
// Subclass 2
class Cat extends Animal {
    void meow() { System.out.println("The cat meows.");
    }
}
// Main class to test the inheritance
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Dog-specific method

        Cat cat = new Cat();
        cat.eat(); // Inherited method
        cat.meow(); // Cat-specific method
    }
}
