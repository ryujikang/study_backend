package oop1;

// 메서드도 함께 포함되있는 클래스
public class ValueObject {
    int value = 0; // 멤버 변수, 0으로 자동 초기화

    void add() { // 메서드 추가
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
