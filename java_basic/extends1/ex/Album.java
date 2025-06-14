package extends1.ex;

public class Album extends Item {
    String artist;

    Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트 : " + artist);
    }
}
