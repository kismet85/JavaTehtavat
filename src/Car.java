//Task 2: Modified Car class
//
//Modify Car class so that it has an additional constructor with gasoline tank capacity and top speed arguments.
public class Car {
    CruiseControl cruiseControl = new CruiseControl(this);
    double gasolineTank;
    int topSpeed;
    int currentSpeed = 0;
    double odometer = 0;
    double gasUsage = 0.0;
    boolean cruiseDrive = false;
    public Car(float gasolineTank, int topSpeed) {
        this.gasolineTank = gasolineTank;
        this.topSpeed = topSpeed;
    }

    public void setGasUsage()
    {
        gasUsage = (10.0/100.0) * odometer;
    }
    public double getGasolineTank() {
        return gasolineTank;
    }

    public void setGasolineTank(double gasolineTank) {
        this.gasolineTank -= gasolineTank;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
    public int getCurrentSpeed() { return currentSpeed;}

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void cruiseSpeed(int speed)
    {
        setCurrentSpeed(speed);
        if(currentSpeed==speed  && cruiseDrive)
        {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("You are cruising at " + currentSpeed + "Km/h");
            }
        }
    }
    public void setCurrentSpeed(int speed)
    {
        while(currentSpeed != speed)
        {
            if(currentSpeed< speed) {
                currentSpeed += 1;
                odometer = odometer + (currentSpeed/100.0);
                System.out.println("Current speed " + currentSpeed + "Km/h");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            else if(currentSpeed> speed)
            {
                currentSpeed -= 1;
                odometer = odometer + (currentSpeed/200.0);
                System.out.println("Current speed " + currentSpeed + "Km/h");
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("You are already driving this speed");
            }
        }
        setGasUsage();
        setGasolineTank(gasUsage);
    }
}
