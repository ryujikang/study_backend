package array;

// 향상된 for문 정의
public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i=0; i<nums.length; i++) {
            int n = nums[i];
            System.out.println(n);
        }

        // 향상된 for문 (for-each문)
        for (int n : nums) {
            System.out.println(n);
        }

        // for-each문 사용 불가한 경우 (index 값 필요)
        for (int i=0; i<nums.length; i++) {
            System.out.println("number" + (i+1) + "번의 결과는: " + nums[i]);
        }
    }
}
