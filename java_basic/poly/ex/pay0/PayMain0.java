package poly.ex.pay0;

/*
문제2: 결제 시스템 개발

여러분은 기대하던 결제 시스템 개발팀에 입사하게 되었다.
이 팀은 현재 2가지 결제 수단을 지원한다.
앞으로 5개의 결제 수단을 추가로 지원할 예정이다.
새로운 결제수단을 쉽게 추가할 수 있도록, 기존 코드를 리펙토링해라.

요구사항
- OCP 원칙을 지키세요.
- 메서드를 포함한 모든 코드를 변경해도 됩니다. 클래스나 인터페이스를 추가해도 됩니다.
- 단 프로그램을 실행하는 PayMain0 코드는 변경하지 않고, 그대로 유지해야 합니다.
- 리펙토링 후에도 실행 결과는 기존과 같아야 합니다.

실행 결과
결제를 시작합니다: option=kakao, amount=5000
카카오페이 시스템과 연결합니다.
5000원 결제를 시도합니다.
결제가 성공했습니다.
결제를 시작합니다: option=naver, amount=10000
네이버페이 시스템과 연결합니다.
10000원 결제를 시도합니다.
결제가 성공했습니다.
결제를 시작합니다: option=bad, amount=15000
결제 수단이 없습니다.
결제가 실패했습니다.
*/

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}
