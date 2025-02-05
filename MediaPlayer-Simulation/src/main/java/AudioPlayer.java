public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        System.out.println("Playing audio file: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Audio paused.");
    }

    @Override
    public void stop() {
        System.out.println("Audio stopped.");
    }
}
