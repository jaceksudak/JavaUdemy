package priv.jaceksudak.udemy;

/**
 * Created by Jacek on 2017-03-26.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return ("\t"+this.title+"\t"+this.duration);
    }
}
