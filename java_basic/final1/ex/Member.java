package final1.ex;

public class Member {

    private final String id; // final 키워드 사용
    private String name;

    // 생성자
    public Member(String id, String name) {
        this.id = id; // 초기화 후 변경 불가
        this.name = name;
    }

    public void changeData(String id, String name) {
//        this.id = id; // 컴파일 오류
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + ", name: " + name);
    }
}
