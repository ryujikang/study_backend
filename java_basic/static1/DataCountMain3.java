package static1;

// 생성된 객체의 수를 세는 단순한 프로그램
// static 미사용 -> counter 객체 공유 (아직 불편함, 별도 클래스 사용, 생성자 매개변수 추가 및 복잡)
public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count= " + Data3.cnt); // cnt 정적변수 접근 방법 : 클래명에 .(dot)을 사용함

        Data3 data2 = new Data3("B");
        System.out.println("B count= " + Data3.cnt);

        Data3 data3 = new Data3("C");
        System.out.println("C count= " + Data3.cnt);

        // 정적 변수 접근 법
        Data3 data4 = new Data3("D");
        System.out.println(data4.cnt); // 인스턴스를 통해서 접근 (인스턴스 변수로 오해 가능)
        System.out.println(Data3.cnt); // 클래스를 통해 바로 접근
    }
}
