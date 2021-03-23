package commands;

import multimedia.Media;

public class AddCommand implements Add {

    Catalog catalog;

    AddCommand() {
        catalog = new Catalog();
    }

    public void add(Media item) {
        catalog.add(item);
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}

