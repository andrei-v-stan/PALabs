package commands;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadCommand implements Load {
    private String path;

    LoadCommand() {
        path = null;
    }


    public void load() {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Catalog p2 = (Catalog) objectInputStream.readObject();
            objectInputStream.close();
            p2.list();
        } catch (Exception evt) {
            System.out.println(evt.toString());
        }
    }

    public void setPath(String path) {
        this.path = path;
    }
}

