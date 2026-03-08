package Assignment1;
// GeometryDemo.java

// 1. The Base Class
class Shape {
    // This will be OVERRIDDEN by specific shapes (Dynamic Polymorphism)
    public void displayArea() {
        System.out.println("Area: Undefined for a generic shape.");
    }

    // METHOD OVERLOADING (Static Polymorphism)
    // Scenario: Calculate area of a rectangle with different inputs
    public void calculateArea(int side) {
        System.out.println("Square Area (side*side): " + (side * side));
    }

    public void calculateArea(int length, int width) {
        System.out.println("Rectangle Area (l*w): " + (length * width));
    }
}

// 2. The Subclass (Demonstrating Inheritance & Overriding)
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // METHOD OVERRIDING: Replacing the base class behavior
    @Override
    public void displayArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Circle Area (πr²): %.2f%n", area);
    }
}

// 3. The Main Entry Point (The only 'public' class)
public class Geometry {
    public static void main(String[] args) {
        System.out.println("--- Testing Static Polymorphism (Overloading) ---");
        Shape myShape = new Shape();
        myShape.calculateArea(5);      // Calls version with 1 int
        myShape.calculateArea(10, 5);  // Calls version with 2 ints

        System.out.println("\n--- Testing Dynamic Polymorphism (Overriding) ---");
        // We treat the Circle as a Shape (Upcasting)
        Shape myCircle = new Circle(7.0);

        // At runtime, Java knows to call the Circle's displayArea()
        myCircle.displayArea();
    }
}