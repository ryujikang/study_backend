package final1;

// 만약 프로그램 최대 참여자 수를 변경해야 하면 Constant.MAX_USERS 의 상수 값만 변경하면 된다.
public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS); // 사람이 인지할 수 있는 MAX_USERS 라는 변수명
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) // 사람이 인지할 수 있는 MAX_USERS 라는 변수명
            System.out.println("대기자 등록");
        else System.out.println("게임 참가");
    }
}
