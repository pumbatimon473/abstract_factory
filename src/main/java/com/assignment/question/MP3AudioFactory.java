package com.assignment.question;

import com.assignment.question.decoder.AudioDecoder;
import com.assignment.question.decoder.MP3Decoder;
import com.assignment.question.player.AudioPlayer;
import com.assignment.question.player.MP3Player;
import com.assignment.question.processor.AudioProcessor;
import com.assignment.question.processor.MP3AudioProcessor;

// Part 2: Implement AudioFactory interface - Concrete Factory
public class MP3AudioFactory extends AudioFactory {

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public AudioDecoder getDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioProcessor getProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }

    @Override
    public AudioPlayer getPlayer(int volume, double playbackRate) {
        return new MP3Player(volume, playbackRate);
    }
}