package array.ex;

/* 문제 3
* 5개의 정수 입력
* 역순으로 출력 (,로 구분/마지막 , 제거)
* */

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("5개의 정수 입력:");
        for (int i=0; i<arr.length; i++) {
            arr[i] = input.nextInt();
        }


        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(", ");
        }
    }
}
