public class Main2 {
    public static void main(String[] args) {
        MediaPlayerImpl audioPlayer = new MediaPlayerImpl();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("avi", "movie.avi");
    }
}
