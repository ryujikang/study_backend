package array;

// 2차원 배열
public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        int n = 1;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j] = n++; // 배열 초기화
            }
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
