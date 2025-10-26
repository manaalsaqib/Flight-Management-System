package Airport;

public class airport {
    private String name;
    private String city;
    private boolean runawayfree = true;
    private boolean helipadfree = true;

    public airport(String name, String city){
        this.name = name;
        this.city = city;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }

    public boolean isrunawayfree(){
        return runawayfree;
    }
    public boolean isHelipadfree(){
        return helipadfree;
    }
    public boolean occupyrunway(){
        return false;
    }
    public boolean freerunaway(){
        return true;
    }
    public boolean occupyhelipad(){
        return false;
    }
    public boolean freehelipad(){
        return true;
    }

    @Override
    public String toString() {
        return "Airport: " + name + " (" + city + ")";
    }
}
