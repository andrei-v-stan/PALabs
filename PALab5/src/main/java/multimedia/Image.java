package multimedia;

import java.io.Serializable;

public class Image implements Media, Serializable {
    private String name, path, date;

    public Image() {
        this.name = null;
        this.path = null;
        this.date = null;
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


}

