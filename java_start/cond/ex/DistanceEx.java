package cond.ex;

/* 문제 2
* "거리에 따른 운송 수단 선택하기"
*
* 주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
* - 거리가 1km 이하이면: "도보"
* - 거리가 10km 이하이면: "자전거"
* - 거리가 100km 이하이면: "자동차"
* - 거리가 100km 초과이면: "비행기"
*
* 거리는 변수(int distance)로 지정하고, 해당 변수를 기반으로 운송 수단을 출력하자.
*
* 출력 예시
* > distance: 1
* > 출력: 도보를 이용하세요.
* */

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 5; // 거리 단위 = km

        String move;
        if (distance <= 1) move = "도보";
        else if (distance <= 10) move = "자전거";
        else if (distance <= 100) move = "자동차";
        else move = "비행기";

        System.out.println("distance: " + distance);
        System.out.println(move + "를 이용하세요.");
    }
}
