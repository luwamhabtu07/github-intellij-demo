public class Main {
    public static void main(String[] args) {
        MediaPlayer audio = new AudioPlayer();
        MediaPlayer video = new VideoPlayer();
        MediaPlayer streaming = new StreamingPlayer();

        // Testing normal cases
        audio.play("Song.mp3");
        audio.pause();
        audio.stop();

        video.play("Movie.mp4");
        video.pause();
        video.stop();

        streaming.play("Live Concert");
        streaming.pause();
        streaming.stop();

        // Edge case: Playing an empty title
        System.out.println("\nTesting Edge Cases:");
        audio.play("");
        video.play(null);
        streaming.play("Extremely long media title that exceeds normal length limitations...");
    }
}
