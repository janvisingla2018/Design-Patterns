public class AdapterMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beep.mp3");
        audioPlayer.play("mp4", "beep.mp4");
        audioPlayer.play("vlc", "beep.vlc");
    }
}
