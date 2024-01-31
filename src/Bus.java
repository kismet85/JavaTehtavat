public class Bus extends Car{
    int numberOfPassangers = 0;
    int maxPassangers = 50;
    public Bus(double gasolineTank, int topSpeed, int numberOfPassangers) {
        super(gasolineTank, topSpeed);
        this.numberOfPassangers = numberOfPassangers;
    }

    @Override
    public void setGasUsage() {
        super.setGasUsage();
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

    @Override
    public void cruiseSpeed(int speed, int acceleration) {
        super.cruiseSpeed(speed, acceleration);
    }

    @Override
    public void setCurrentSpeed(int speed, int acceleration) {
        super.setCurrentSpeed(speed, acceleration);
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(int numberOfPassangers) {
        System.out.println("Picked up " + numberOfPassangers + " passangers!");
        if(this.numberOfPassangers < maxPassangers) {
            this.numberOfPassangers += numberOfPassangers;
            if(this.numberOfPassangers > 50)
            {
                this.numberOfPassangers = 50;
            }
        }
        else
        {
            System.out.println("Bus has maximum amount of passangers!");
        }
    }

    public void passengerEnter(int passangers)
    {
        setNumberOfPassangers(passangers);
    }

    public void passengerExit(int passangers)
    {
        System.out.println(passangers + " left the bus!");
        if(this.numberOfPassangers > 0)
        {
            this.numberOfPassangers -= passangers;
        }
        if(this.numberOfPassangers < 0)
        {
            this.numberOfPassangers = 0;
        }
    }
}
