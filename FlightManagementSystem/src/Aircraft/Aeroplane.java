package Aircraft;
import Aircraft.aircraft;

public class Aeroplane extends aircraft{
    public Aeroplane(String model, int capacity){
        super(model,capacity);
    }

    @Override
    public void fly() {
        System.out.println("Aeroplane: " + model + " is now flying with " + capacity + " passengers!");

    }

    @Override
    public void service() {
        System.out.println("Aeroplane: " + model + " is being serviced");
    }
}

