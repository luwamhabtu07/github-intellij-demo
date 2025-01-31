public class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        System.out.println("Playing video file: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Video paused.");
    }

    @Override
    public void stop() {
        System.out.println("Video stopped.");
    }
}
