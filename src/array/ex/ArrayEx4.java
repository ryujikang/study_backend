package array.ex;

/* 문제 4
* 5개의 정수 입력
* 합계와 평균 계산
* */

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("5개의 정수 입력:");
        for (int i=0; i<arr.length; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        double aver = (double) sum/arr.length;
        System.out.println("합계: " + sum + ", 평균: " + aver);
    }
}
