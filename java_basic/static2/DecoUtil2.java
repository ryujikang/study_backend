package static2;

// 특정 문자열을 꾸며주는 간단한 기능
public class DecoUtil2 {

    // static 사용 = 클래스 메소드
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
