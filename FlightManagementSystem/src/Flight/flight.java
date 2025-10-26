package Flight;
import Airport.airport;
import Aircraft.aircraft;

public class flight {
    private String flightnumber;
    private airport source;
    private airport destination;
    private aircraft aircraft;

    public flight(String flightnumber, airport source, airport destination, aircraft aircraft){
        this.flightnumber = flightnumber;
        this.source = source;
        this.destination = destination;
        this.aircraft = aircraft;
    }
    public String getflightNumber(){
        return flightnumber;
    }
    public void flightInfo(){
        System.out.println("Flight: " + flightnumber + " Details----");
        System.out.println("From: " + source.getCity() +  "\nTo: " + destination.getCity());
        aircraft.fly();
    }

}
