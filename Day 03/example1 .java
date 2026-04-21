public class Student {
    String name;
    int age;
    String course;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void show() {
        System.out.println("Name: " + name + " | Age: " + age + " | Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "CSE");
        Student s2 = new Student("Bob", 22, "EEE");
        s1.show();
        s2.show();
    }
}