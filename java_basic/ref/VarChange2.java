package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        Data dataB = dataA; // A, B 모두 같은 곳을 참조함

        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataA.value = 20; // A 변경
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); // B값도 같이 변경

        dataB.value = 30; // B 변경
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // A값도 같이 변경
        System.out.println("dataB.value = " + dataB.value);
    }
}
