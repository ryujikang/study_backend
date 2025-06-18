package time_complexity;/*시간 복잡도 유형
* - 빅-오메가(Ω, Omega) : 최선일 때(best case)의 연산 횟수
* - 빅-세타(Θ, Theta) : 보통일 때(average case)의 연산 횟수
* - 빅-오(𝑂, Oh) : 최악일 때(worst case)의 연산 횟수
* 
* 코딩 테스트 => 빅-오(𝑂(n)) 표기법을 기준으로 수행 시간을 계산하는 것을 권장
*               다양한 테스트 케이스를 수행해 모든 케이스를 통과해야만 합격으로 판단됨
*
* 시간 복잡도 순서
* 𝑂(1) < 𝑂(log n) < 𝑂(n) < 𝑂(nlog n) < 𝑂(n^2) < 𝑂(n^3) < 𝑂(2^n) < 𝑂(n!)
* 
* 시간 복잡도 도출 기준
* 1. 상수는 시간 복잡도 계산에서 제외
* 2. 가장 많이 중첩된 반복문의 수행 횟수가 시간 복잡도의 기준이 됨
* */

import java.util.Scanner;

public class Baekjoon2750 {

    // 병합정렬 시작 (main 호출용)
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length]; // 임시 배열 생성

        mergeSort(arr, temp, 0, arr.length-1);
    }

    // 분할
    public static void mergeSort(int[] arr, int[] temp, int start, int end) {
        if (start < end) { // 최소 2개 이상일 때만 분할
            int mid = (start+end)/2;

            mergeSort(arr, temp, start, mid); // 배열 앞부분 정렬
            mergeSort(arr, temp, mid+1, end); // 배열 뒷부분 정렬

            merge(arr, temp, start, mid, end); // 병합
        }
    }

    // 병합
    public static void merge(int[] arr, int[] temp, int start, int mid, int end) {
        for (int i=start; i<=end; i++) {
            temp[i] = arr[i]; // 임시 배열에 복사본 저장
        }

        int part1 = start; // 왼쪽 배열 시작 인덱스
        int part2 = mid+1; // 오른쪽 배열 시작 인덱스

        int index = start; // 병합결과를 저장할 인덱스

        // 양쪽 배열의 시작인덱스 값 비교 => 작은 것부터 arr에 저장
        while (part1 <= mid && part2 <= end) {
            if (temp[part1] <= temp[part2]) { // 왼쪽 배열의 값이 작거나 같으면,
                arr[index] = temp[part1]; // 왼쪽 값 복사
                part1++; // 왼쪽 배열의 시작 인덱스 증가
            } else {
                arr[index] = temp[part2]; // 오른쪽 값 복사
                part2++; // 오른쪽 배열의 시작 인덱스 증가
            }
            index++; // 병합결과 저장할 인덱스 증가
        }

        // 왼쪽 배열에 남은 값들 => arr에 복사
        // 오른쪽 배열이 남았다면?? => 오른쪽 배열의 값은 이미 제자리에 있음
        for (int i=0; i<=mid-part1; i++) {
            arr[index + i] = temp[i + part1];
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); //데이터의 개수 N (1 <= N <= 1,000,000)
        
        int[] arr = new int[N]; //N개의 정수형 배열, 절댓값이 1,000,000보다 작거나 같은 정수(중복 X)
        for (int i=0; i<N; i++) {
            arr[i] = input.nextInt();
        }

        mergeSort(arr);

        // 오름차순 정렬 (버블정렬 -> 적합 X)
//        for (int i=0; i<N-1; i++) {
//            for (int j=0; j<N-1; j++) {
//                if (arr[j+1] < arr[j]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                }
//            }
//        }

        // 결과 출력
        for (int i=0; i<N; i++) {
            System.out.println(arr[i]);
        }
    }
}
