package assignment2;
public class GCDemo {
    public static void main(String[] args) {
        GCDemo obj1 = new GCDemo();
        obj1 = null;

        System.gc();
        System.out.println("Garbage Collection Requested");
    }

    protected void finalize() {
        System.out.println("Garbage Collected");
    }
}