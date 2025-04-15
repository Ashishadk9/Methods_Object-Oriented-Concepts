
/**
 * Write a description of class Intances here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Dog {
    String name; 
    void bark() {
        System.out.println(name + " says Woof!");
    }
}

public class Intances {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = " husky Buddy";
        myDog.bark(); 
    }
}
