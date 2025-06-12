package access;

/*
스피커 객체를 만들어보자.
스피커는 음량을 높이고, 내리고, 현재 음량을 확인할 수 있는 단순한 기능을 제공한다.
요구사항 대로 스피커의 음량은 100까지만 증가할 수 있다. 절대 100을 넘어가면 안된다.
*/

public class Speaker {
    private int volume; // 접근 제어자를 private으로 변경, 클래스 외부에서 접근 불가
//    int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void VolumeUp() {
        if (volume >= 100) {
            System.out.println("음량 증가 불가. 최대 음량.");
        } else {
            volume += 10;
            System.out.println("음량 10 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
