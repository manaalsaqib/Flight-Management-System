package Controller;
import Aircraft.*;
import Aircraft.Aeroplane;
import Flight.flight;

import Airport.airport;
import Flight.flight;
import Passengers.passengers;

public class aircontrol {
    private String name;

    public aircontrol(String name) {
        this.name = name;
    }

    public  void Landingpermission(aircraft aircraft, airport airport) {
        System.out.println("Controller : " + name + " checking conditions for " + aircraft.getModel());
        if (aircraft instanceof Aeroplane) {
            if (airport.isrunawayfree()) {
                System.out.println("Runway is free " + aircraft.getModel() + " can land safely");
                airport.occupyrunway();
                aircraft.land();
                airport.freerunaway();
            } else {
                System.out.println("Runway is busy " + aircraft.getModel() + " must wait");
            }
        } else if (aircraft instanceof Helicopter) {
            if (airport.isHelipadfree()) {
                System.out.println("Helipad is free " + aircraft.getModel() + "can land safely");
                airport.occupyhelipad();
                aircraft.land();
                airport.freehelipad();
            } else {
                System.out.println("Helipad is occupied " + aircraft.getModel() + "must wait");
            }
        }
    }
}
