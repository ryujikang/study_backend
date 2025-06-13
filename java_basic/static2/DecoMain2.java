package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // 인스턴스 생성 안함

        System.out.println("before : " + s);
        System.out.println("after : " + deco); // 앞 뒤에 * 을 붙여서 반환
    }
}
