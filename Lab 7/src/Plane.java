public class Plane extends Vehicle implements Flyable{
    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;
    public Plane() {
        this(0.0, "", "");
    }
    public Plane(double fuel, String airline, String boeing) {
        super(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }
    public String getAirline() {
        return this.airline;
    }
    public void setBoeing(String boeing) {
        this.boeing = boeing;
    }
    public String getBoeing() {
        return this.boeing;
    }
    @Override
    public void startEngine() {
        if (this.getFuel() >= 20) {
            System.out.println("Plane’s Engine starts");
            this.setFuel((this.getFuel() - 20));
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine() {
        System.out.println("Plane’s Engine stops");
    }
    @Override
    public void honk() {
        System.out.println("Weeeeeee");
    }
    @Override
    public void fly() {
        if (this.getFuel() >= 20) {
            System.out.println("Plane Fly");
            this.setFuel((this.getFuel() - 20));
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }
    @Override
    public void takeOff() {
        if (this.getFuel() >= 10) {
            System.out.println("Plane Already to Take Off");
            this.setFuel((this.getFuel() - 10));
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }
    @Override
    public void landing() {
        if (this.getFuel() >= 10) {
            System.out.println("Plane Already to Landing");
            this.setFuel((this.getFuel() - 10));
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }
}
