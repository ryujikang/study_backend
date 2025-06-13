package static1;

// static 키워드
public class Data2 {
    public String name;

    // counter 객체를 공유 -> 필요할 때마다 카운트 값 증가
    public Data2(String name, Counter counter) {
        this.name = name;
        counter.cnt1++;
    }
}
