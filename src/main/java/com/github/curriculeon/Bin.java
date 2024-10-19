package com.github.curriculeon;

public class Bin {
    public Integer faceValueToTrack = null;
    public Integer numberOfOccurrences=0;
    public Bin(Integer faceValueToTrack) {
        this.faceValueToTrack = faceValueToTrack;
    }

    Bin(Integer faceValueToTrack, Integer numberOfOccurrences) {
//        this.faceValueToTrack = faceValueToTrack;
//        this.numberOfOccurrences = numberOfOccurrences;
    }

    public Integer getFaceValueToTrack() {
        return this.faceValueToTrack;
    }

    public Integer getNumberOfOccurrences() {
        return this.numberOfOccurrences;
    }

    public void increment() {
        this.numberOfOccurrences++;
    }
}
