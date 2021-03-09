import java.util.List;
import java.util.ArrayList;


public class City {

    private List<Location> locations = new ArrayList<>();

    public City(List<Location> locations) {
        this.locations = locations;
    }

    public City() {

    }


    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return this.locations;
    }

    public void addLocation(Location location){
        locations.add(location);
    }

    public int getLocationListByIndex(int index){
        return this.locations.lastIndexOf(index);
    }


    public void printVisitableNonPayableLocations() {

        int iterator,valueVisitable,valuePayable;


        for (iterator = 0; iterator < this.locations.size(); iterator++) {


            valueVisitable = ((Location) this.locations.get(iterator)).getIsVisitable();
            valuePayable = ((Location) this.locations.get(iterator)).getIsPayable();

            if(valueVisitable==1 && valuePayable==0) {
                String vName = ((Location) this.locations.get(iterator)).getName();
                System.out.println(vName);

            }

        }

    }


    @Override
    public String toString() {
        return "City{" +
                "locations=" + locations +
                '}';
    }
}
