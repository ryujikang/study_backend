package array;

// 2차원 배열
public class ArrayDi1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 2차원 배열, 2행 3열

        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 1행 2열
        
        // 반복문 사용
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i][0] + " ");
            System.out.print(arr[i][1] + " ");
            System.out.println(arr[i][2]);
        }

    }
}
