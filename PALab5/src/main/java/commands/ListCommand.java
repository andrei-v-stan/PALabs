package commands;

public class ListCommand implements List {

    private Catalog catalog;
    int iterator;

    ListCommand() {
        catalog = new Catalog();
    }


    public void list() {
        for (int iterator = 0; iterator < catalog.getMediaList().size(); ++iterator)
            System.out.println(catalog.getMediaList().get(iterator).getName() + " " + catalog.getMediaList().get(iterator).getPath());
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Catalog getCatalog() {
        return catalog;
    }
}

