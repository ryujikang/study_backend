package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // BigData의 멤버변수
        //      - Data data;
        //      - int count;
        bigData.data = new Data();
        // Data의 멤버변수
        //      - int value;
        System.out.println("bigData.count = " + bigData.count); // 0으로 초기화
        System.out.println("bigData.data = " + bigData.data); // 참조 ㅇㅇ
        
        System.out.println("bigData.data.value = " + bigData.data.value); // 0으로 초기화
    }
}
