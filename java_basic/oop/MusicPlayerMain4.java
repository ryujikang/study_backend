package oop;

/**
 * 객체 지향
 */

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();

        player.volumeUp();
        player.volumeUp();
        player.volumeDown();

        player.checkStatus();

        player.off();
    }
}
