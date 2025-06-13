package static1;

// 생성된 객체의 수를 세는 단순한 프로그램
// static 미사용 => 기대한 대로 작동하지 않음
public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count= " + data1.cnt);

        Data1 data2 = new Data1("B");
        System.out.println("B count= " + data2.cnt);

        Data1 data3 = new Data1("C");
        System.out.println("C count= " + data3.cnt);
    }
}
