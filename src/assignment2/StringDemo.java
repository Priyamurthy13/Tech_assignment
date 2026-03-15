package assignment2;
public class StringDemo {
    public static void main(String[] args) {

        String s = "Java";
        s.concat(" Programming");
        System.out.println("String: " + s); // Immutable

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        System.out.println("StringBuffer: " + sbf);
    }
}
