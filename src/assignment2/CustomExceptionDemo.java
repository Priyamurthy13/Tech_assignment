package assignment2;
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    static void check(int num) throws MyException {
        if (num < 0)
            throw new MyException("Number is negative");
        else
            System.out.println("Valid number");
    }

    public static void main(String[] args) {
        try {
            check(-5);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}