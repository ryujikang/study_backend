package static1;

// static 키워드
public class Data3 {
    public String name;
    public static int cnt; // static (= 정적변수, 클래스 변수)
    /*
    멤버 변수(필드)의 종류
    - 인스턴스 변수 : static이 붙지 않은 멤버 변수 (인스턴스를 생성해야 사용 가능, 인스턴스에 소속됨)
    - 클래스 변수 : static이 붙은 멤버 변수 (인스턴스와 무관하게 클래스에 바로 접근해서 사용 가능, 클래스 자체에 소속됨)
    */
    
    
    public Data3(String name) {
        this.name = name;
        cnt++;
    }
}
