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
        ghoomar.addSongToPlaylist(1, playlist);
        ghoomar.addSongToPlaylist(2, playlist);
        ghoomar.addSongToPlaylist(3, playlist);
        ghoomar.addSongToPlaylist(4, playlist);
        ghoomar.addSongToPlaylist(5, playlist);

        ListIterator<Song> playlistIterator = playlist.listIterator();
        while (!quit) {
            printMenu();
            System.out.print("Enter a choice from menu: ");
            int option = scanner.nextInt();
            scanner.nextLine();//ignore new line
            switch (option) {
                case 1:
                case 5:
                    System.out.println("Not implemented yet");
                    break;
                case 2:
                    if (goingForward) {
                        if (playlistIterator.hasNext()) {
                            playlistIterator.next().playSong();
                        }
                    } else {
                        if (playlistIterator.hasPrevious()) {
                            playlistIterator.previous().playSong();
                        }
                    }
                    break;
                case 3:
                    if (!goingForward) {
                        if (playlistIterator.hasNext()) {
                            playlistIterator.next();
                        }
                        goingForward = true;
                    }

                    if (playlistIterator.hasNext()) {
                        playlistIterator.next().playSong();
                    } else {
                        System.out.println("Reached at the end of playlist");
                    }
                    break;
                case 4:
                    if (goingForward) {
                        if (playlistIterator.hasPrevious()) {
                            playlistIterator.previous();
                        }
                        goingForward = false;
                    }

                    if (playlistIterator.hasPrevious()) {
                        playlistIterator.previous().playSong();
                    } else {
                        System.out.println("Reached at the top of playlist");
                    }
                    break;
                case 6:
                    printPlaylistItems(playlist);
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void printPlaylistItems(LinkedList<Song> playlist) {
        int i = 0;
        for (Song song : playlist) {
            System.out.println((++i) + ". " + song.toString());
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
