package array;

// 배열을 사용한 학생의 점수를 출력
public class Array1Ref4 {
    public static void main(String[] args) {
        // 배열 선언 및 생성, 초기화
        int[] students = new int[]{90, 80, 70, 60, 50};
        
        for (int i=0; i<students.length; i++)
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
    }
}
