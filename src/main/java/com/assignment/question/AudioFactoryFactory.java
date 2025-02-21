package com.assignment.question;

// Part 3: Define AudioFactoryFactory - Optional
// - Simple Factory for AudioFactory
public class AudioFactoryFactory {
    public static AudioFactory getAudioFactory(MediaFormat mediaFormat) {
        switch (mediaFormat) {
            case FLAC:
                return new FLACAudioFactory();
            case MP3:
                return new MP3AudioFactory();
            default:
                throw new IllegalArgumentException("Invalid media format: " + mediaFormat);
        }
    }    
}
