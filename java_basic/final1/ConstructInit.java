package final1;

// final 필드 - 생성자 초기화
public class ConstructInit {
    final int value;

    public ConstructInit(int value) {
        this.value = value; // 생성자를 통해 한번만 초기화 가능
    }
}
