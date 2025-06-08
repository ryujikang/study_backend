package array;

// 배열을 사용한 학생의 점수를 출력
public class Array1Ref3 {
    public static void main(String[] args) {
        // new int[] 생략 가능 (단, 배열 선언과 함께 사용시)
        int[] students = {90, 80, 70, 60, 50};
        
        for (int i=0; i<students.length; i++)
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
    }
}
