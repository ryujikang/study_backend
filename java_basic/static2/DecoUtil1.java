package static2;

// 특정 문자열을 꾸며주는 간단한 기능
public class DecoUtil1 {

    // static 사용안함 -> 인스턴스 메소드
    public String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
