package final1;

public class FieldInit {
    // final 필드를 선언과 동시에 초기화하면서 이미 값이 설정 됨 -> 생성자를 통해 초기화 불가
    static final int CONST_VALUE = 10;
    final int value = 10;
}
