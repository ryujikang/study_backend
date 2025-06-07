package array;

// 배열을 사용한 학생의 점수를 출력
public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 정수형 배열 선언
        students = new int[5]; // 배열 생성 - 인덱스는 0부터 시작
        
        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        
        // 변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
