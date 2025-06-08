package class1;

/*
문제: 학생 정보 출력 프로그램 만들기
당신은 두 명의 학생 정보를 출력하는 프로그램을 작성해야 한다. 각 학생은 이름, 나이, 성적을 가지고 있다.

요구 사항:
1. 첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90입니다.
2. 두 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80입니다.
3. 각 학생의 정보를 다음과 같은 형식으로 출력해야 합니다: "이름: [이름] 나이: [나이] 성적: [성적]"
4. 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 합니다.
*/

public class ClassStart1 {
    public static void main(String[] args) {
        String name1 = "학생1";
        int age1 = 15, score1 = 90;
        System.out.println("이름: " + name1 + ", 나이: " + age1 + ", 성적: " + score1);

        String name2 = "학생2";
        int age2 = 16, score2 = 80;
        System.out.println("이름: " + name1 + ", 나이: " + age1 + ", 성적: " + score1);

    }
}
