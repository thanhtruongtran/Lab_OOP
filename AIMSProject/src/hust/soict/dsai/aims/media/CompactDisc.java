package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track \"" + track.getTitle() + "\" added to the CD.");
        } else {
            System.out.println("Track \"" + track.getTitle() + "\" is already in the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track \"" + track.getTitle() + "\" removed from the CD.");
        } else {
            System.out.println("Track \"" + track.getTitle() + "\" is not found in the CD.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    @Override
    public void play() {
        System.out.println("Playing CD: " + getTitle());
        System.out.println("Artist: " + getArtist());
        System.out.println("CD Length: " + getLength());

        for (Track track : tracks) {
            track.play();
        }
    }
    
    @Override
    public String toString() {
        return "ID: " + getId() +"Title: " + getTitle() + ", Category: " + getCategory() + ", Cost: " + getCost() + ", Artist: " + artist + ", Length: " + getLength();
    }
}

