package commands;

import java.awt.*;
import java.io.File;

public class PlayCommand implements Play{

    private Catalog catalog;
    private String name;
    private Desktop desktop;
    private File file;

    PlayCommand(){
        catalog = new Catalog();
        desktop = null;
        file = null;
        name = null;
    }

    public void play(){
        int counter, ok = 0;

        try{
            if(name != null)
                if(catalog != null) ok = 1;
        }

        catch (Exception evt){
            System.out.println("Initialisation error~");
        }

        try{
            if(Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
                counter = catalog.getItemByName(name);
                file = new File(catalog.getMediaList().get(counter).getPath());
                desktop.open(file);
            }
        }
        catch (Exception evt){
            System.out.println(evt.toString());
        }
    }

    public void setCatalog(Catalog catalog){
        this.catalog = catalog;
    }

    public void setName(String name){
        this.name = name;
    }
}

