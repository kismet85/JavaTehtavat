public class Motorcycle implements Vehicle{
    private String vehicleType = "";
    private String fuelType = "";
    private String color = "";

    public Motorcycle(String fuelType, String type , String color) {
        this.vehicleType = type;
        this.fuelType = fuelType;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle Information:");
        System.out.println("Type: " + vehicleType);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Color: " + color);
    }
}
