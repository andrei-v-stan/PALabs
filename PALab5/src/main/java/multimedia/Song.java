package multimedia;

import java.io.Serializable;

public class Song implements Media, Serializable {
    private String name, path, date, artist;

    public Song() {
        this.name = null;
        this.path = null;
        this.date = null;
        this.artist = null;
    }


    public void setName(String nume) {
        this.name = nume;
    }

    public String getName() {
        return name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setAuthor(String artist) {
        this.artist = artist;
    }

    public String getAuthor() {
        return artist;
    }

}
