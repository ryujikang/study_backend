package array;

// 배열을 사용한 학생의 점수를 출력
public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용 (리팩토링)
        for (int i=0; i<students.length; i++)
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
    }
}
