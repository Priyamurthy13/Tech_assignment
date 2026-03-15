package assignment2;
public class ReverseString {
    public static void main(String[] args) {
        String str = "Java Programming";
        StringBuilder sb = new StringBuilder(str);

        System.out.println("Reversed: " + sb.reverse());
    }
}
