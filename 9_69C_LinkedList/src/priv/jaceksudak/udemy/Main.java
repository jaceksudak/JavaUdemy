package priv.jaceksudak.udemy;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Jacek Sudak on 2017-03-26.
 * Udemy course
 * This is a simple program showing the basic mechanics of LinkedList and ArrayList.
 * It's a simulation of a music player, at the beginning of the code a playlist is created (LinkedList of Songs) from two available Albums.
 * User can go back and forward playing songs from the playlist. Ther is also an option to remove a song from the playlist.
 */
public class Main {

    private static LinkedList<Song> playlist = new LinkedList<>();
    private static ListIterator<Song> iterator;
    private static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {

        Album album1 = new Album("Perfect Strangers");
        album1.addSong("Knocking at Your Back Door", 3.23);
        album1.addSong("Under the Gun", 5.21);
        album1.addSong("Nobody's Home", 4.76);
        album1.addSong("Mean Streak", 3.66);
        album1.addSong("Perfect Strangers", 2.11);
        Album album2 = new Album("Black Sabbath");
        album2.addSong("Black Sabbath", 3.24);
        album2.addSong("The Wizard", 5.22);
        album2.addSong("Behind the Wall of Sleep", 4.77);
        album2.addSong("N.I.B.", 3.67);
        album2.addSong("Evil Woman", 2.12);

        addToPlaylist(album1.getSong(1));   //1
        addToPlaylist(album1.getSong(3));   //2
        addToPlaylist(album1.getSong(5));   //3
        addToPlaylist(album2.getSong(2));   //4
        addToPlaylist(album2.getSong(4));   //5
        addToPlaylist(album2.getSong(1));   //6
        addToPlaylist(album1.getSong(2));   //7
        printPlaylist();
        printInstructions();

        iterator = playlist.listIterator();
        boolean quit=false;
        nowPlaying();

        while(!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();
            switch(option) {
                case 1:
                    nextSong();
                    break;
                case 2:
                    previousSong();
                    break;
                case 3:
                    nowPlaying();
                    break;
                case 4:
                    removeSong();
                    break;
                case 5:
                    printInstructions();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Wrong number, try again");
                    printInstructions();
            }
        }
    }

    private static void nowPlaying() {
        if(!iterator.hasPrevious()) {
            System.out.println("You are at the beginning of the list.");
        } else {
            System.out.println(iterator.previous().toString());
            iterator.next();
        }
    }

    private static void nextSong() {
        if(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        } else {
            System.out.println("You are at the last track of the list.");
        }
    }

    private static void previousSong() {
        if(!iterator.hasPrevious()) {
            System.out.println("You are at the beginning of the list.");
        } else {
            iterator.previous();
            nowPlaying();
        }
    }

    private static void removeSong() {
        if(!iterator.hasPrevious()) {
            System.out.println("You are at the beginning of the list.");
        } else {
            System.out.println("Song removed: "+iterator.previous().toString());
            iterator.next();
            iterator.remove();
            nowPlaying();
        }
    }


    private static void printInstructions() {
        System.out.println("Available commands: ");
        System.out.println("\t1. Next song");
        System.out.println("\t2. Previous song");
        System.out.println("\t3. Replay song");
        System.out.println("\t4. Remove current song from playlist");
        System.out.println("\t5. Print instructions:");
        System.out.println("\t6. Exit");
    }

    private static void printPlaylist() {
        iterator = playlist.listIterator();
        System.out.println("Current playlist:");
        while(iterator.hasNext()) {
            printSong(iterator.next());
        }
    }

    private static void printAlbumlist(Album album) {
        System.out.println("priv.jaceksudak.udemy.Album: "+album.getTitle());
        for(int i=0; i<album.getAlbumSize();i++) {
            printSong(album.getSong(i+1));
        }
    }

    private static void addToPlaylist(Song song) {
        playlist.add(song);
    }

    private static void printSong(Song song) {
        System.out.println(song.toString());
    }
}
