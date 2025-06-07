package array.ex;

/* 문제 2
* 5개의 정수 입력
* 순서대로 출력 (,로 구분/마지막 , 제거)
* */

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("5개의 정수 입력:");
        for (int i=0; i<arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("출력");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) System.out.print(", ");
        }
    }
}
