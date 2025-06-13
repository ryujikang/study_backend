package memory;

/*
자바의 메모리 구조
- 메서드 영역: 클래스 정보를 보관한다. (클래스 정보)
             이 클래스 정보가 붕어빵 틀이다.
- 스택 영역: 실제 프로그램이 실행되는 영역이다. (메서드 실행 시)
           메서드를 실행할 때마다 하나씩 쌓인다.
- 힙 영역: 객체(인스턴스)가 생성되는 영역이다. (new 키워드 사용시, 배열 등)
          new 명령어를 사용하면 이 영역을 사용한다. 쉽게 이야기해서 붕 어빵 틀로부터 생성된 붕어빵이 존재하는 공간이다. 참고로 배열도 이 영역에 생성된다
*/

// 스택(LIFO, Last In First Out, 후입선출) 영역
/*
호출 순서 :
    1. main() frame args[]
    2. method1() frame m1=10, cal=20
    3. method2() frame m2=20
종료 순서 :
    1. method2() frame m2=20
    2. method1() frame m1=10, cal=20
    3. main() frame args[]
*/
public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");

        method1(10);

        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2; // 지역변수 사용

        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
