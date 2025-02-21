package com.assignment.question;

import com.assignment.question.decoder.AudioDecoder;
import com.assignment.question.player.AudioPlayer;
import com.assignment.question.processor.AudioProcessor;

// Define AudioFactory interface - Abstract Factory
public abstract class AudioFactory {
    public abstract MediaFormat supportsFormat();

    // interfaces
    public abstract AudioDecoder getDecoder(byte[] audioData);

    public abstract AudioProcessor getProcessor(byte[] audioData);

    public abstract AudioPlayer getPlayer(int volume, double playbackRate);
}