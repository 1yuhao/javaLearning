package javaLearning_06;

import javax.swing.plaf.synth.SynthUI;
import java.util.Objects;

public class CD extends Item {
    private String artist;
    private int numofTracks;
    private int playingTime;
    private boolean gotIt = false;
    private String comment;

    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.artist = artist;
        this.numofTracks = numofTracks;
//        this.playingTime = playingTime;
//        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                ", numofTracks=" + numofTracks +
                ", playingTime=" + playingTime +
                ", gotIt=" + gotIt +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return numofTracks == cd.numofTracks &&
                playingTime == cd.playingTime &&
                gotIt == cd.gotIt &&
                Objects.equals(artist, cd.artist) &&
                Objects.equals(comment, cd.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, numofTracks, playingTime, gotIt, comment);
    }

    public void print() {
        super.print();
        System.out.print(":"+artist);
    }
}
