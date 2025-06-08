package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "학생1";
        std1.age = 15;
        std1.grade = 90;

        Student std2 = new Student();
        std2.name = "학생2";
        std2.age = 16;
        std2.grade = 80;

        Student[] stds = new Student[] { std1, std2 }; // 배열 선언 최적화

        for (int i=0; i<2; i++) {
            System.out.println("이름: " + stds[i].name + ", 나이: " + stds[i].age + ", 성적: " + stds[i].grade);
        }
    }
}
