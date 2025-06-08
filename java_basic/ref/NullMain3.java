package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // BigData의 멤버변수
        //      - Data data;
        //      - int count;
        System.out.println("bigData.count = " + bigData.count); // 0으로 초기화
        System.out.println("bigData.data = " + bigData.data); // null로 초기화

        System.out.println("bigData.data.value = " + bigData.data.value); // bigData의 data가 참조하는 곳이 없음
    }
}
