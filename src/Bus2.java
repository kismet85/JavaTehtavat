class Bus2 extends AbstractVehicle {
    private String fuelType;
    private String type;
    private int capacity;
    public Bus2(String fuelType, String type, int capacity) {
        super(fuelType, type);
        this.fuelType = fuelType;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus Information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuelType());
        System.out.println("Capacity: " + capacity);
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