package challenge.innerclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Albums {
    private SongList songList = new SongList();
    private String artist;

    public Albums(String artist) {
        this.artist = artist;
        addSong(new Song("Kesariya Balam", 2.10));
        addSong(new Song("Kawaron Tabariyo", 5.09));
        addSong(new Song("Jad Dekhu Banne Ri Lal Pili Ankhyan", 4.27));
        addSong(new Song("Ghoomar", 4.20));
    }

    /**
     * @param trackNumber track number of song starting from 1
     * @param playlist    playlist where song from album needs to be added
     */
    void addSongToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && (trackNumber <= songList.getSize())) {
            Song songToAdd = songList.getSongNumber(index);
            playlist.add(songToAdd);
            System.out.println("Added to playlist " + songToAdd.toString());
        } else {
            System.out.println("Track no " + trackNumber + " doesn't exists.\n" +
                    "Here are list of songs you can add");
            printListOfSongs();
        }
    }

    public boolean addSong(Song song) {
        if (!songList.find(song.getTitle())) {
            songList.add(song);
            System.out.println("Added " + song.toString());
            return true;
        }
        System.out.println("Song" + song.getTitle() + " already exist in album");
        return false;
    }

    public void printListOfSongs() {
        songList.printList();
    }


    public void removeSongFromAlbum(String title) {
        if (songList.remove(title)) {
            System.out.println("Song " + title + " removed from album " + title);
        } else {
            System.out.println("Song with title \"" + title + "\" not found in album " + artist);
        }
    }

    private class SongList {
        private ArrayList<Song> songs = new ArrayList<>();

        private int getSize() {
            return songs.size();
        }

        private Song getSongNumber(int titleNumber) {
            return songs.get(titleNumber);
        }

        public boolean add(String title, double duration) {
            if (find(title)) {
                System.out.println("Song with title " + title + " already present. Skipping duplicate entry");
                return false;
            }
            return songs.add(new Song(title, duration));
        }

        public boolean remove(String title) {
            if (!find(title)) {
                return false;
            }

            ListIterator<Song> listIterator = songs.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().getTitle().equals(title)) {
                    listIterator.remove();
                    return true;
                }
            }
            return false;
        }

        public boolean find(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return true;
                }
            }
            return false;
        }

        public boolean add(Song song) {
            return add(song.getTitle(), song.getDurationInSeconds());
        }

        public void printList() {
            int i = 0;
            for (Song song : songs)
                System.out.println((++i) + ": " + song.toString());
        }
    }
}