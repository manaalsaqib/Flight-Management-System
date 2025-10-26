import Airport.airport;
import Aircraft.aircraft;
import Aircraft.Aeroplane;
import Aircraft.Helicopter;
import Flight.flight;
import Passengers.passengers;
import Controller.aircontrol;

public class Main{
    public static void main(String[]args){
        // creating Airports
        airport Karachi = new airport("Jinnah International Airport", "Karachi");
        airport Islamabad = new airport("Islamabad International Airport", "Islamabad");
        airport Lahore = new airport("Lahore International Airport", "Lahore");

        System.out.println(Karachi);

        // creating Aircraft
        Aeroplane Boeing = new Aeroplane("Boeing 737" , 400 );
        Helicopter heli = new Helicopter("Airbus H135", 5);

        //creating flights
        flight flight1 = new flight("PK-303",Karachi, Lahore, Boeing );
        flight flight2 = new flight("HK-007",Lahore, Karachi, heli);

        // Creating Passengers

        String[] name = {"Manaal", "Hussain" , "Irna" , "Mahad" , "Yusra", "Marium" , "Fajar" , "Ayesha" };
        int[] ticketno = {6074,6075,6089,6098,6078,6054,6057,6034};
        passengers List = new passengers(name,ticketno);

        List.boardflight(flight1);
        flight1.flightInfo();

        // Controller
        aircontrol control = new aircontrol("Mr. Ahmed");

        // Air controller checking and giving permission of landing the aircraft
//        control.Landingpermission(heli,Karachi);
        control.Landingpermission(Boeing,Islamabad);
//
//        // Aircraft services
//        Boeing.service();
        heli.service();


    }
}