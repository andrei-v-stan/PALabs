import java.util.ArrayList;
import java.util.List;

public class TravelPlan {

    City cityPlan = new City();

    private List<Location> locationsPlan = new ArrayList<>();

    public City getCityPlan() {
        return this.cityPlan;
    }

    public void setCityPlan(City cityPlan) {
        this.cityPlan = cityPlan;
    }

    public List<Location> getLocationsPlan() {
        return this.locationsPlan;
    }

    public void setLocationsPlan(List<Location> locationsPlan) {
        this.locationsPlan = locationsPlan;
    }


}
