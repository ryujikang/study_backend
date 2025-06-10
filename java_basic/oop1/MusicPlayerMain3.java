package oop1;
/*
절차 지향 프로그래밍2 - 데이터 묶음
앞서 작성한 코드에 클래스를 도입하자.
MusicPlayerData 라는 클래스를 만들고,
음악 플레이어에 사용되는 데이터들을 여기에 묶어서 멤버 변수로 사용하자
*/
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);
        volumeUp(data);
        volumeDown(data);

        checkStatus(data);

        off(data);
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어 시작");
    }
    
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    static void checkStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
