package reka.model;

import java.util.List;

public class Location {
    private String name;
    private List<Location> adjacencyList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Location> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Location> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public Location(String name, List<Location> adjacencyList) {
        this.name = name;
        this.adjacencyList = adjacencyList;
    }
}
