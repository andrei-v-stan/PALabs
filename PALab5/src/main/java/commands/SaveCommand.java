package commands;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveCommand implements Save {

    private Catalog catalog;
    private String path;

    SaveCommand() {
        catalog = null;
        path = null;
    }


    public void save() {
        try {
            FileOutputStream fout = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(catalog);
            out.flush();
            out.close();
        } catch (Exception evt) {
            System.out.println(evt.toString());
        }
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
