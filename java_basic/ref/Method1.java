package ref;

public class Method1 {
    public static void main(String[] args) {
        Student std1 = new Student(); // Student 클래스
        initStudent(std1, "학생1", 15, 90); // std1의 참조값 전달

        Student std2 = new Student();
        initStudent(std2, "학생2", 16, 80); // std2의 참조값 전달

        printStudent(std1);
        printStudent(std2);
    }

    static void initStudent(Student s, String name, int age, int grade) {
        s.name = name;
        s.age = age;
        s.grade = grade;
    }

    static void printStudent(Student s) {
        System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
    }
}
