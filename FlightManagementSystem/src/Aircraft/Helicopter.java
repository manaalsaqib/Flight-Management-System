package Aircraft;
import Aircraft.aircraft;

public class Helicopter extends aircraft {
    public Helicopter(String model, int capacity){
        super(model,capacity);
    }

    @Override
    public void fly() {
        System.out.println("Helicopter: " + model + " is lifting off");
    }

    @Override
    public void service() {
        System.out.println("Helicopter: " + model + " is being serviced");
    }
}
