package array.ex;

/* 문제 5
* 입력받을 숫자의 개수 입력
* 합계와 평균 계산
* */

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력할 숫자의 개수: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        int sum = 0;
        System.out.println(n + "개의 정수 입력:");
        for (int i=0; i<arr.length; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        double aver = (double) sum/arr.length;
        System.out.println("합계: " + sum + ", 평균: " + aver);
    }
}
