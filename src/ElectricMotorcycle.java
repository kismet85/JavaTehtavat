public class ElectricMotorcycle extends AbstractVehicle{
    String color;
    public ElectricMotorcycle(String fuelType, String type, String color) {
        super(fuelType, type);
        this.color = color;

    }

    @Override
    public void charge() {
        System.out.println("Charging electric motorcycle...");
    }
    @Override
    public String getType()
    {
        return super.getType();
    }
    @Override
    public String getFuelType() {
        return super.getFuelType();
    }
    @Override
    public void selfDrive() {
        System.out.println("Self-drive activated...");
    }

    @Override
    public void start() {
        System.out.println("Electric Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric Motorcycle is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle Information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuelType());
        System.out.println("Color: " + color);
    }
}
