abstract class AbstractVehicle implements Vehicle, ElectricVehicle{
    private String fuelType;
    private String type;
    public AbstractVehicle(String fuelType, String type) {
        this.fuelType = fuelType;
        this.type = type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getType() {
        return type;
    }


}