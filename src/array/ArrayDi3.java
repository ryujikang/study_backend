package array;

// 2차원 배열
public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = { // 2차원 배열 선언 및 생성, 초기화
                {1, 2, 3},
                {4, 5, 6}
        };

        // 반복문 사용
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
