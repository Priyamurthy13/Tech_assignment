package assignment1;
class Shape1 {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Polymorphism{
    public static void main(String[] args) {

        Shape1 s1 = new Circle1();
        Shape1 s2 = new Rectangle();

        s1.draw();   // Runtime Polymorphism
        s2.draw();
    }
}
