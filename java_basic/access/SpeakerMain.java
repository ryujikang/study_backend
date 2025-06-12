package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(100); // 생성자로 초기 음량 지정
        speaker.showVolume();

        speaker.VolumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        // 필드(멤버변수)에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; // 접근 오류, private
        speaker.showVolume();
    }
}
