package challenge.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class AlbumsMain {
    private static LinkedList<Song> playlist = new LinkedList<>();
    private static Albums ghoomar = new Albums("Ghoomer");
    private static boolean goingForward = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        ListIterator<Song> songListIterator = playlist.listIterator();
        while (!quit) {
            printMenu();
            System.out.print("Enter a choice from menu: ");
            int option = scanner.nextInt();
            scanner.nextLine();//ignore new line
            switch (option) {
                case 1:
                    System.out.print("Enter title no: ");
                    int trackNumber = scanner.nextInt();
                    scanner.nextLine();
                    ghoomar.addSongToPlaylist(trackNumber, playlist);
                    break;
                case 2:
                    if (goingForward) {
                        if (songListIterator.hasNext()) {
                            Song song = songListIterator.next();
                            song.playSong();
                        }
                    } else {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous().playSong();
                        }
                    }
                    break;
                case 3:
                    if (!goingForward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        goingForward = true;
                    }

                    if (songListIterator.hasNext()) {
                        Song song = songListIterator.next();
                        song.playSong();
                    } else {
                        System.out.println("Stay tuned for more songs");
                    }
                    break;
                case 4:
                    if (goingForward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        goingForward = false;
                    }

                    if (songListIterator.hasPrevious()) {
                        songListIterator.previous().playSong();
                    } else {
                        System.out.println("Stay tuned for more songs");
                    }
                    break;
                case 5:
                    System.out.print("Enter song title to remove: ");
                    removeSongFromPlaylist(playlist, scanner.nextLine());
                    break;
                case 6:
                    ghoomar.printListOfSongs();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }


    private static void removeSongFromPlaylist(LinkedList<Song> playlist, String title) {
        for (Song song : playlist) {
            if (song.getTitle().equals(title)) {
                playlist.remove(song);
            } else {
                System.out.println("Song not found in playlist");
            }
        }
    }

    private static void printMenu() {
        System.out.println("1:\tAdd Track to playlist\n" +
                "2:\tSkip Song\n" +
                "3:\tNext Song\n" +
                "4:\tPrevious Song\n" +
                "5:\tRemove a Song\n" +
                "6:\tList All Songs\n" +
                "7:\tQuit\n");
    }
}
