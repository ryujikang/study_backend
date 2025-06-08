package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "학생1";
        std1.age = 15;
        std1.grade = 90;

        Student std2 = new Student();
        std2.name = "학생2";
        std2.age = 16;
        std2.grade = 80;

        Student[] stds = new Student[2]; // Student 배열
        stds[0] = std1;
        stds[1] = std2;

        System.out.println("이름: " + stds[0].name + ", 나이: " + stds[0].age + ", 성적: " + stds[0].grade);
        System.out.println("이름: " + stds[1].name + ", 나이: " + stds[1].age + ", 성적: " + stds[1].grade);


    }
}
