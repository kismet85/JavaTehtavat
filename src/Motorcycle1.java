class Motorcycle1 extends AbstractVehicle {
    private String fuelType;
    private String type;
    private String color;
    public Motorcycle1(String fuelType, String type, String color) {
        super(fuelType, type);
        this.fuelType = fuelType;
        this.type = type;
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
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuelType());
        System.out.println("Color: " + color);
    }

    @Override
    public String getFuelType() {
        return super.getFuelType();
    }
    @Override
    public String getType()
    {
        return super.getType();
    }
}