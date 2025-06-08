package array;

// 2차원 배열
public class ArrayDi0 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 2차원 배열, 2행 3열

        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 1행 2열

        // 0행 출력
        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.println(arr[0][2]);
        
        // 1행 출력
        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.println(arr[1][2]);
    }
}
