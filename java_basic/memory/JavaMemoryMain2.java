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

/*
스택(LIFO, Last In First Out, 후입선출) 영역
호출 순서 : 1. main() -> 2. method1() -> 3. method2
    ㄴ 2. method1() frame data1=x001 -> 힙 영역에 Data 인스턴스 생성, 참조값을 data1에 보관
종료 순서 : method2() -> method1() -> main

힙 영역 => x001 -> value=10 (Data 인스턴스)
*/

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");

        method1();

        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); // new 사용 -> 힙 영역에 Data 클래스의 인스턴스 생성 (참조값을 data1에 보관)
        method2(data1);                  // Data 인스턴스의 참조값 전달 = method2()의 Data data2 지역변수도 같은 인스턴스 참조
        System.out.println("method1 end");
    } // method1() 종료 -> 스택프레임 제거 (data1도 함께 제거)
      //                    => x001참조값을 가진 Data 인스턴스를 참조하는 곳 없음 (GC, Garbage Collection -> 참조가 모두 사라진 인스턴스를 찾아 메모리에서 제거)

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 end");
    } // method2() 종료 -> 스택프레임 제거 (data2도 함께 제거)
}
