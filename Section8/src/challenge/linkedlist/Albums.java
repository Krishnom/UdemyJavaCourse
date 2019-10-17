package challenge.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Albums {
    ArrayList<Song> songs;
    private String artist;

    public Albums(String artist) {
        this.artist = artist;
        songs = new ArrayList<>();
        addSong(new Song("Kesariya Balam", 2.10));
        addSong(new Song("Kawaron Tabariyo", 5.09));
        addSong(new Song("Jad Dekhu Banne Ri Lal Pili Ankhyan", 4.27));
        addSong(new Song("Ghoomar", 4.20));

    }

    void addSongToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && (trackNumber <= songs.size())) {
            playlist.add(songs.get(index));
            System.out.println("Added to playlist " + songs.get(index).toString());
        } else {
            System.out.println("Track no " + trackNumber + " doesn't exists.\n" +
                    "Here are list of songs you can add");
            printListOfSongs();
        }
    }

    public boolean addSong(Song song) {
        Iterator<Song> songIterator = songs.iterator();

        while (songIterator.hasNext()) {
            if (songIterator.next().getTitle().equals(song.getTitle())) {
                return false;
            }
        }
        songs.add(song);
        System.out.println("Added " + song.toString());
        return true;
    }

    public void printListOfSongs() {
        int i = 0;
        for (Song song : songs) {
            System.out.println((++i) + ": " + song.toString());
        }
    }


    public void removeSongFromAlbum(String title) {
        ListIterator<Song> songListIterator = songs.listIterator();

        while (songListIterator.hasNext()) {
            if (songListIterator.next().getTitle().equals(title)) {
                songListIterator.remove();
                System.out.println("Song " + title + " removed from album " + title);
            }
        }
        System.out.println("Song with title \"" + title + "\" not found in album " + artist);
    }

    public String getArtist() {
        return artist;
    }
}
