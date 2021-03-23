package multimedia;

import java.io.Serializable;

public class Book implements Media, Serializable {
    private String name, path, date, author;

    public Book() {
        this.name = null;
        this.path = null;
        this.date = null;
        this.author = null;
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

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }


}
