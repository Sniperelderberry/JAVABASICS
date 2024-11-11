class CopyConstructorExample {
    private String name; // Name of the person
    private int age;     // Age of the person

    // Constructor to initialize name and age
    public CopyConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor that creates a new object as a copy of another
    public CopyConstructorExample(CopyConstructorExample another) {
        this(another.name, another.age); // Call the main constructor
    }

    // Method to display the person's details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an original object
        CopyConstructorExample original = new CopyConstructorExample("Sukhdeep", 21);
        
        // Create a copy of the original object
        CopyConstructorExample copy = new CopyConstructorExample(original);
        
        // Display details of both objects
        original.display();
        copy.display();
    }
}
