package array.ex;

/* 문제 1
* 배열로 변경
* */

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {90, 80, 70, 60, 50};

        int total = 0;
        for (int n : arr)
            total += n;
        double aver = (double) total/arr.length;

        System.out.println("점수 총합: "+ total + "\n점수 평균: " + aver);
    }
}
