package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student std1 = new Student(); // Student 클래스
        std1.name = "학생1";
        std1.age = 15;
        std1.grade = 90;

        System.out.println("이름: " + std1.name + ", 나이: " + std1.age + ", 성적: " + std1.grade);

        Student std2 = new Student();
        std2.name = "학생2";
        std2.age = 16;
        std2.grade = 80;

        System.out.println("이름: " + std2.name + ", 나이: " + std2.age + ", 성적: " + std2.grade);


    }
}
