package reka.service;

import reka.model.Location;
import reka.model.LocationGraph;

import java.util.ArrayList;
import java.util.List;

public class ShortestRouteCalculator {
    public List<Location> calculateShortestRoute (Location start, Location stop, LocationGraph myMap){
       List<Location> result=new ArrayList<>();
       result.add(start);
       List<Location> currentNeighbours=start.getAdjacencyList();
        for (int i = 0; i < currentNeighbours.size(); i++) {
            currentNeighbours.get(i);

        }
        return null;
    }
    private
}
