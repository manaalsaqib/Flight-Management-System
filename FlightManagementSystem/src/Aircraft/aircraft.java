package Aircraft;

public class aircraft {
    protected String model;
    protected int capacity;

    public aircraft(String model, int capacity){
        this.model = model;
        this.capacity = capacity;
    }
    public void service(){
       System.out.println(model  + " is being serviced");
    }
    public void fly(){
        System.out.println(model + " is now flying");
    }
    public void land(){
        System.out.println(model + " is now Landing");
    }
    public String getModel(){
        return model;
    }

}




