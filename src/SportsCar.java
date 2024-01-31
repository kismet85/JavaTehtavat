public class SportsCar extends Car{
    public SportsCar(double gasolineTank, int topSpeed) {
        super(gasolineTank, topSpeed);
    }

    // isompi polttoaine käyttö
    @Override
    public void setGasUsage() {
        gasUsage = (20.0/100.0) * odometer;
    }

    @Override
    public double getGasolineTank() {
        return super.getGasolineTank();
    }

    @Override
    public void setGasolineTank(double gasolineTank) {
        super.setGasolineTank(gasolineTank);
    }

    @Override
    public int getTopSpeed() {
        return super.getTopSpeed();
    }

    @Override
    public int getCurrentSpeed() {
        return super.getCurrentSpeed();
    }

    @Override
    public void setTopSpeed(int topSpeed) {
        super.setTopSpeed(topSpeed);
    }

    // acceleration lisätty nopeampaan vauhtiin
    @Override
    public void cruiseSpeed(int speed,int acceleration) {
        super.cruiseSpeed(speed,acceleration);
    }

    // acceleration lisätty nopeampaan vauhtiin
    @Override
    public void setCurrentSpeed(int speed, int acceleration) {
        super.setCurrentSpeed(speed,acceleration);
    }
}
