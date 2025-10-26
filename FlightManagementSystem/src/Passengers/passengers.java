package Passengers;
import Flight.flight;

public class passengers {
    private String[] name;
    private int[] ticketno;

    public passengers(String[] name, int[] ticketno){
        this.name = name;
        this.ticketno = ticketno;
        }

        public String[] getname(){
        return name;
        }
        public int[] getTicketno() {
            return ticketno;
        }
        public void boardflight(flight flight){
        System.out.println("Passenger List for Flight " + flight.getflightNumber());
        for(int i = 0; i < name.length; i++) {
            System.out.println(name[i] + " " + "(" + ticketno[i] + ")");
        }
    }
}

