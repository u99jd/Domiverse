package sound;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundPlayer {

    private Clip clip;

    public SoundPlayer(String filePath) {
        try {
            // Load the audio file
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(filePath));

            // Get a clip resource
            clip = AudioSystem.getClip();

            // Open the audio stream
            clip.open(audioStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Play the soundtrack
    public void play() {
        if (clip != null) {
            clip.setFramePosition(0); // Rewind to the beginning
            clip.start();
        }
    }

    // Loop the soundtrack
    public void loop() {
        if (clip != null) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    // Stop the soundtrack
    public void stop() {
        if (clip != null) {
            clip.stop();
        }
    }
}

