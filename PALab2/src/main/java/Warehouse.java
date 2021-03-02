
public class Warehouse extends Source {

    public Warehouse(String name, int[] capacity, int supply) {
        this.setName(name);
        this.setCapacity(capacity);
        this.setSupply(supply);
    }

    public String getType() {
        return "Warehouse";
    }

}
