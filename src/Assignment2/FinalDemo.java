package Assignment2;
final class FinalClass {
    final int x = 10;

    final void display() {
        System.out.println("Final Method");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println(obj.x);
        obj.display();
    }
}