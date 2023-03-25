package reka.model;
import java.util.List;
public class LocationGraph {
    public LocationGraph(List<Location> locationList) {
        this.locationList = locationList;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    private List<Location> locationList;


}
