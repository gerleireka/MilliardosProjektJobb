package reka.main;

import reka.model.Location;

import java.util.Collections;
import java.util.List;

public class FeladatEgy {
    public void static void main(String[] args) {
        Location oktogon=new Location("Oktogon", Collections.emptyList());
        Location nyugatiTer=new Location("Nyugati Ter", Collections.emptyList());
        Location deakTer=new Location("Deak Ter", Collections.emptyList());
        Location borarosTer=new Location("Boraros Ter", Collections.emptyList());
        Location moriczZsigmondKorter=new Location("Moricz Zsigmond Korter", Collections.emptyList());
        Location kalvinTer=new Location("Kalvin Ter", Collections.emptyList());
        List deakTerConnections=List.of(nyugatiTer,oktogon);
        deakTer.setAdjacencyList(deakTerConnections);
        List nyugatiTerConnections=List.of(deakTer,oktogon,kalvinTer);
        nyugatiTer.setAdjacencyList(nyugatiTerConnections);
        List borarosTerConnections=List.of(moriczZsigmondKorter,oktogon);
        borarosTer.setAdjacencyList(borarosTerConnections);
        List oktogonConnections=List.of(nyugatiTer,deakTer,borarosTer,kalvinTer);
        oktogon.setAdjacencyList(oktogonConnections);
        List moriczZsigmondKorterConnections=List.of(borarosTer,kalvinTer);
        moriczZsigmondKorter.setAdjacencyList(moriczZsigmondKorterConnections);
        List kalvinTerConnections=List.of(nyugatiTer,oktogon);
        kalvinTer.setAdjacencyList(kalvinTerConnections);

    }
}
