package access.b;

// import access.a.DefaultClass1; // 접근 불가
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        
        // default 클래스, 다른 패키지, 접근 불가
//        DefaultClass1 class1 = new DefaultClass1();
//        DefaultClass2 class2 = new DefaultClass2();
    }
}
