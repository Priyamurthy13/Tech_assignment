package Assignment1;
class Animal {
    String name;
    public void eat() {
        System.out.println("This animal is eating...");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking: Woof! Woof!");
    }
    public void display() {
        System.out.println("My name is " + name);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();
        myDog.bark();
        myDog.display();
    }
}
