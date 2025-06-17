package poly.ex.sender;

/*
문제1: 다중 메시지 발송

한번에 여러 곳에 메시지를 발송하는 프로그램을 개발하자.
다음 코드를 참고해서 클래스를 완성하자

요구사항
- 다형성을 활용하세요.
- Sender 인터페이스를 사용하세요.
- EmailSender , SmsSender , FaceBookSender 를 구현하세요

실행 결과
메일을 발송합니다: 환영합니다!
SMS를 발송합니다: 환영합니다!
페이스북에 발송합니다: 환영합니다!
*/

public class SendMain {

    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
