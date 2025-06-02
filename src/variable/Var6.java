package variable;

public class Var6 {
    public static void main(String[] args) {
        int a; // 변수 초기화 안하면?
//        System.out.println(a); // 'java:6:28 java: variable a might not have been initialized'
        // 컴파일 에러 (컴파일러가 찾아서 알려줌 == 쉽게 찾을 수 있음 == Good Error)
        // 메모리는 여러 시스템이 함께 사용하는 공간임
        // 어떤 값이 들어있었는지 모름
        // 자바는 변수 초기화를 강제함
        // Var6.class 를 확인하면, 최적화를 시켜서 int a;를 삭제함
    }
}
