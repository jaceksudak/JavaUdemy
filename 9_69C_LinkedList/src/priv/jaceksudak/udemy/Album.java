package priv.jaceksudak.udemy;

import java.util.ArrayList;

/**
 * Created by Jacek on 2017-03-26.
 */
public class Album {
    private String title;
    private ArrayList<Song> songList;

    public Album(String title) {
        this.title = title;
        this.songList  = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getAlbumSize() {
        return songList.size();
    }

    public void addSong(String title, double duration) {
        Song newSong = new Song(title,duration);
        songList.add(newSong);
    }

    public Song getSong(int number) {
        if(songList.size()>=number) {
            return songList.get(number-1);
        } else {
            return null;
        }
    }
}
