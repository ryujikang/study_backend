package final1;

// 만약 프로그램 최대 참여자 수를 현재 1000명에서 2000명으로 변경해야 하면 2곳의 변경 포인트가 발생한다.
// 만약 애플리케이션의 100곳에서 이 숫자를 사용했다면 100곳을 모두 변경해야 한다.
public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000); // 매직 넘버 문제 발생
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > 1000) // 매직 넘버 문제 발생
            System.out.println("대기자 등록");
        else System.out.println("게임 참가");
    }
}
