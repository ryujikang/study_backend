package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco); // 앞 뒤에 * 을 붙여서 반환
        // deco() 메서드를 호출하기 위해서는 DecoUtil1 의 인스턴스를 먼저 생성해야 한다
        // 멤버 변수도 없고, 단순히 기능만 제공
    }
}
