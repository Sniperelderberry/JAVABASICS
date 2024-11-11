abstract class Animal {
  public static void display() {
    System.out.println("Displaying info about animals");
  }

  abstract void sound();

  abstract void legs();

  public int age;

  abstract int breed(int age);

}
// interface parent2{
// abstract void total();

// }

class dog extends Animal {

  @Override
  int breed(int age) {
    // TODO Auto-generated method stub
    System.out.println("the breed og dog is " + age);
    return age;
  }

  void sound() {
    System.out.println(" barks");
  }

  void legs() {
    System.out.println(" has four legs");
  }

}

/*
 * class snake extends Animal{
 * public String breed;
 * public snake(String breed){
 * this.breed=breed;
 * System.out.println("the snake is "+ breed);
 * }
 * 
 * void sound(){
 * System.out.println("snake hisses");
 * }
 * void legs(){
 * System.out.println("snake has no legs");
 * }
 * 
 * 
 * }
 */

class oops {
  public static void main(String[] args) {
    Animal.display();
    dog d1 = new dog();
    d1.breed(67);

    d1.sound();
    d1.legs();

  }
}