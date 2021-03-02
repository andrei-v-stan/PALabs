
public class Factory extends Source {

    public Factory(String name, int[] capacity, int supply) {
        this.setName(name);
        this.setCapacity(capacity);
        this.setSupply(supply);
    }

    public String getType() {
        return "Factory";
    }

}