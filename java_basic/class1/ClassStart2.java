package class1;

/*
문제: 이전 문제에 배열을 사용하자
이전 문제에 배열을 적용하자. 그래서 학생이 추가되어도 코드 변경을 최소화 해보자.
*/

public class ClassStart2 {
    public static void main(String[] args) {
        String[] names = {"학생1", "학생2"};
        int[] ages = {15, 16}, scores = {90, 80};

        for (int i=0; i<2; i++)
            System.out.println("이름: " + names[i] + ", 나이: " + ages[i] + ", 성적: " + scores[i]);
    }
}
