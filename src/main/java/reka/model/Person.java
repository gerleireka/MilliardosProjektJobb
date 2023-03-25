package reka.model;

public class Person {
    private Location start;
    private Location stop;
    private Integer type;
    public Person (Location start, Location stop, Integer type){
        this.start=start;
        this.stop=stop;
        this.type=type;
    }

    public Location getStart() {
        return start;
    }

    public Location getStop() {
        return stop;
    }

    public void setStop(Location stop) {
        this.stop = stop;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setStart(Location start){
        this.start=start;
    }
}
