package array.ex;

/* 문제 6
* n개의 정수 입력
* 배열 내에서 가장 작은 수와 큰 수 찾기
* */

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력할 숫자의 개수: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println(n + "개의 정수 입력:");
        for (int i=0; i<arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int max, min;
        max = min = arr[0];
        for (int a : arr) {
            if (a > max) max = a;
            if (a < min) min = a;
        }

        System.out.println("최대: " + max + " 최소: " + min);
    }
}
