package static1;

// 생성된 객체의 수를 세는 단순한 프로그램
// static 미사용 -> counter 객체 공유 (아직 불편함, 별도 클래스 사용, 생성자 매개변수 추가 및 복잡)
public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Data2 data1 = new Data2("A", counter);
        System.out.println("A count= " + counter.cnt1);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count= " + counter.cnt1);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count= " + counter.cnt1);
    }
}
