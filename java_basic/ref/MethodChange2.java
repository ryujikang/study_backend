package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changePrimitive(dataA); // dataA의 참조값을 넘김
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    static void changePrimitive(Data x) {
        x.value = 20;
    }
}
