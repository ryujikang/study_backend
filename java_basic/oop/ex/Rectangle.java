package oop.ex;

/*
문제1 - 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기
다음은 직사각형의 넓이(Area), 둘레 길이(Perimeter), 정사각형 여부(square)를 구하는 프로그램이다.

절차 지향 프로그래밍 방식으로 되어 있는 코드를 객체 지향 프로그래밍 방식으로 변경해라.

Rectangle 클래스를 만들어라.
RectangleOopMain 에 해당 클래스를 사용하는 main() 코드를 만들어라.
*/

public class Rectangle {
    int width = 0; // 가로
    int height = 0; // 세로

    void calculateArea() {
        int area = width * height;
        System.out.println("넓이: " + area);
    }

    void calculatePerimeter() {
        int perimeter = 2 * (width + height);
        System.out.println("둘레: " + perimeter);
    }

    void isSquare() {
        boolean isSquare; // 정사각형 여부

        if (width == height) {
            isSquare = true;
        } else isSquare = false;

        System.out.println("정사각형 여부: " + isSquare);
    }

}
