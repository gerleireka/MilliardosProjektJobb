package reka.main;

import reka.model.Location;
import reka.model.LocationGraph;
import reka.model.Person;
import reka.service.ShortestRouteCalculator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FeladatEgy {
    public static void main(String[] args) {
        Location oktogon=new Location("Oktogon", Collections.emptyList());
        Location nyugatiTer=new Location("Nyugati Ter", Collections.emptyList());
        Location deakTer=new Location("Deak Ter", Collections.emptyList());
        Location borarosTer=new Location("Boraros Ter", Collections.emptyList());
        Location moriczZsigmondKorter=new Location("Moricz Zsigmond Korter", Collections.emptyList());
        Location kalvinTer= new Location("Kalvin Ter", Collections.emptyList());
        List<Location> deakTerConnections=List.of(nyugatiTer,oktogon);
        deakTer.setAdjacencyList(deakTerConnections);
        List<Location> nyugatiTerConnections=List.of(deakTer,oktogon,kalvinTer);
        nyugatiTer.setAdjacencyList(nyugatiTerConnections);
        List<Location> borarosTerConnections=List.of(moriczZsigmondKorter,oktogon);
        borarosTer.setAdjacencyList(borarosTerConnections);
        List<Location> oktogonConnections=List.of(nyugatiTer,deakTer,borarosTer,kalvinTer);
        oktogon.setAdjacencyList(oktogonConnections);
        List<Location> moriczZsigmondKorterConnections=List.of(borarosTer,kalvinTer);
        moriczZsigmondKorter.setAdjacencyList(moriczZsigmondKorterConnections);
        List<Location> kalvinTerConnections=List.of(nyugatiTer,oktogon);
        kalvinTer.setAdjacencyList(kalvinTerConnections);
//hozzaadjuk a terkephez
        List<Location> helyekListaja=List.of(oktogon,nyugatiTer,deakTer,borarosTer,moriczZsigmondKorter);
        helyekListaja.add(kalvinTer);
        LocationGraph elsoTerkep= new LocationGraph(helyekListaja);
        //szemelyek
        Person agnes= new Person(oktogon,moriczZsigmondKorter ,1);
        Person antal= new Person(nyugatiTer,kalvinTer ,1);
        Person harold= new Person( borarosTer,nyugatiTer,1);
        Person emilia= new Person (oktogon,borarosTer,1);
        Person reka= new Person(moriczZsigmondKorter,kalvinTer,1);
        List<Person> utazok=List.of(agnes,antal,harold,emilia,reka);
        List<Location> agnesUtvaonal=
                ShortestRouteCalculator.calculateShortestRoute(agnes.getStart(),agnes.getStop(),elsoTerkep);

    }
}
