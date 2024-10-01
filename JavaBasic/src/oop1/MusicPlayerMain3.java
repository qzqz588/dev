package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.VolumeUp();
        player.VolumeUp();
        player.VolumeUp();
        player.On();
        player.ShowStatus();
        player.VolumeDown();
        player.Off();
        player.ShowStatus();
    }
}
