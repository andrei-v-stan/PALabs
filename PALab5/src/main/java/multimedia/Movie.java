package multimedia;

import java.io.Serializable;

public class Movie implements Media, Serializable {
    private String name, path, date, rating;

    public Movie() {
        this.name = null;
        this.path = null;
        this.date = null;
        this.rating = null;
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

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

}
