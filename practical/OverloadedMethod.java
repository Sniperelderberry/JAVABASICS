public class OverloadedMethod {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadedMethod om = new OverloadedMethod();
        
        System.out.println("Sum of two integers: " + om.add(5, 10));
        System.out.println("Sum of three integers: " + om.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + om.add(5.5, 10.5));
    }
}

