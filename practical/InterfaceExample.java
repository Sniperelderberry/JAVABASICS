interface Vehicle {
    void start();
    void stop();
}

interface Electric {
    void charge();
}

class ElectricCar implements Vehicle, Electric {
    public void start() { System.out.println("Car starting"); }
    public void stop() { System.out.println("Car stopping"); }
    public void charge() { System.out.println("Car charging"); }
}

public class InterfaceExample {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar();
        myCar.start();
        myCar.charge();
        myCar.stop();
    }
}

