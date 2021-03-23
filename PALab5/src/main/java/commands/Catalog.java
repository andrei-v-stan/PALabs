package commands;

import multimedia.Media;

import java.awt.*;
import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Catalog implements Serializable {

    private List<Media> mediaList;
    private Desktop desktop;
    private File file;
    int iterator;

    public Catalog() {

        mediaList = new LinkedList<>();
        desktop = null;
        file = new File("");

    }

    public void add(Media item) {
        mediaList.add(item);
    }

    public void list() {
        for (iterator = 0; iterator < mediaList.size(); ++iterator)
            System.out.println(mediaList.get(iterator).getName() + " " + mediaList.get(iterator).getPath() + " " + mediaList.get(iterator).getDate());
    }

    public int compareNames(String name1, String name2) {
        if (name1.compareTo(name2) == 0) return 1;
        return 0;
    }

    public int getItemByName(String nume) {
        for (int iterator = 0; iterator < mediaList.size(); ++iterator)
            if (compareNames(mediaList.get(iterator).getName(), nume) == 1) return iterator;
        return -1;
    }

    public void play(String nume) {
        int pozitie;
        try {
            if (Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
                pozitie = getItemByName(nume);
                file = new File(mediaList.get(pozitie).getPath());
                desktop.open(file);
            }
        } catch (Exception evt) {
            System.out.println(evt.toString());
        }
    }

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> lista) {
        this.mediaList = lista;
    }

}
