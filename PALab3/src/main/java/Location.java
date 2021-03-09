import java.util.HashMap;
import java.util.Map;

public abstract class Location implements Visitable,Payable,Classifiable {


    String name;
    Map<Location,Integer> maping = new HashMap<>();
    private int isClassifiable, isPayable, isVisitable;

     public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getIsClassifiable() {
        return isClassifiable;
    }

    public void setIsClassifiable(int isClassifiable) {
        this.isClassifiable = isClassifiable;
    }

    public int getIsPayable() {
        return isPayable;
    }

    public void setIsPayable(int isPayable) {
        this.isPayable = isPayable;
    }

    public int getIsVisitable() {
        return isVisitable;
    }

    public void setIsVisitable(int isVisitable) {
        this.isVisitable = isVisitable;
    }




    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", maping=" + maping +
                ", isClassifiable=" + isClassifiable +
                ", isPayable=" + isPayable +
                ", isVisitable=" + isVisitable +
                '}';
    }


}
