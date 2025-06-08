package ref;

public class Method2 {
    public static void main(String[] args) {
        Student std1 = createStudent("학생1", 15, 90);
        Student std2 = createStudent("학생2", 16, 80);

        printStudent(std1);
        printStudent(std2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student s = new Student();
        s.name = name;
        s.age = age;
        s.grade = grade;

        return s; // 생성한 s의 참조값 전달
    }

    static void printStudent(Student s) {
        System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
    }
}
