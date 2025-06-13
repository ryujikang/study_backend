package final1;

/*
final 은 변수의 값을 변경하지 못하게 막는다.

변수 : 기본형 변수 & 참조형 변수
- 기본형 변수는 10 , 20 같은 값을 보관
- 참조형 변수는 객체의 참조값을 보관

final 을 기본형 변수에 사용하면 값을 변경할 수 없다.
final 을 참조형 변수에 사용하면 참조값을 변경할 수 없다.
*/

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data(); // data 는 참조값을 담는 변수
//        data = new Data(); // final 변경 불가, 컴파일 오류

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
