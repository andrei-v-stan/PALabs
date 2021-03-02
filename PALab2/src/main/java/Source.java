import java.util.Arrays;
import java.util.Objects;

abstract class Source {

    private String name;
    private int[] capacity;
    private int supply;
    private String type;


    public Source() {
        this.type = getType();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int[] getCapacity() {
        return capacity;
    }

    public void setCapacity(int[] capacity) {
        this.capacity = capacity;
    }


    public int getSupply() {
        return supply;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }


    public abstract String getType();


    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", capacity=" + Arrays.toString(capacity) +
                ", supply=" + supply +
                ", type='" + type + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Source source = (Source) o;
        return supply == source.supply && Objects.equals(name, source.name) && Arrays.equals(capacity, source.capacity);
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(name, supply);
        result = 31 * result + Arrays.hashCode(capacity);
        return result;
    }


}