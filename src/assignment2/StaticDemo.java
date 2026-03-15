package assignment2;
class Student {
    String name;
    static String college = "MIT";

    Student(String name) {
        this.name = name;
    }

    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student.changeCollege("SNPSU");

        Student s1 = new Student("Rithu");
        Student s2 = new Student("Riya");

        s1.display();
        s2.display();
    }
}