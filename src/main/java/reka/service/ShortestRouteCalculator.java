package reka.service;

import reka.model.Location;
import reka.model.LocationGraph;

import java.util.ArrayList;
import java.util.List;

public class ShortestRouteCalculator {
    public List<Location> calculateShortestRoute (Location start, Location stop, LocationGraph myMap){


        Graph terkep=new Graph(myMap.getLocationList().size());
        for (int i=0; i<myMap.getLocationList().size();i++){
            Location location=myMap.getLocationList().get(i);
            for (int j=0; j<location.getAdjacencyList().size();j++){
                int szomszedszama=findszomszedszama(location.getAdjacencyList().get(j),myMap);
              terkep.addEdge(i,szomszedszama);
            }

        }
        return null;
    }

    private int findszomszedszama(Location location,LocationGraph myMap) {
        myMap.getLocationList();
        for (int i = 0; i < myMap.getLocationList().size(); i++) {
            if (myMap.getLocationList().get(i).getName() == location.getName()) {
                return i;
            }
        }

        return 0;
    }

}
