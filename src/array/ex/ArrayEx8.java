package array.ex;

/* 문제 8
* 학생 수 입력
* 각 학생 -> 국, 수, 영 점수 입력
* 각 학생의 총점과 평균 계산 (2차원 배열 사용)
* */

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생 수: ");
        int cnt = input.nextInt();

        int[][] std = new int[cnt][3];
        String[] sub = {"국어", "영어", "수학"};

        int[] total = {0, 0, 0, 0};
        double[] aver = new double[4];

        for (int i=0; i<std.length; i++) {
            System.out.println(i+1 + "번째 학생의 성적");
            for (int j=0; j<std[i].length; j++) {
                System.out.print(sub[j] + " 점수: ");
                std[i][j] = input.nextInt();
                total[i] += std[i][j];
            }
            aver[i] = (double) total[i]/std[i].length;
        }

        for (int i=0; i<std.length; i++) {
            System.out.println(i+1 + "번 학생의 총점: " + total[i] + ", 평균: " + aver[i]);
        }

    }
}
