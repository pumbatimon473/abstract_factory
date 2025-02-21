package com.assignment.question;

import com.assignment.question.decoder.AudioDecoder;
import com.assignment.question.decoder.FLACDecoder;
import com.assignment.question.player.AudioPlayer;
import com.assignment.question.player.FLACPlayer;
import com.assignment.question.processor.AudioProcessor;
import com.assignment.question.processor.FLACAudioProcessor;

// Part 2: Implement AudioFactory interface - Concrete Factory
public class FLACAudioFactory extends AudioFactory {

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioDecoder getDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioProcessor getProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }

    @Override
    public AudioPlayer getPlayer(int volume, double playbackRate) {
        return new FLACPlayer(volume, playbackRate);
    }
}