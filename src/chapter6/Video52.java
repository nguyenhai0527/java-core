package chapter6;

public class Video52 {
    public static void main(String[] args) {
        Student student_1 = new Student();
        student_1.name = "Alice";
        student_1.age = 20;

        System.out.println(student_1.name + " is " + student_1.age + " years old.");

        student_1.learnJava();
    }
}
