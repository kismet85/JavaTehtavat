public class CruiseControl {
    int minimumSpeed = 40;
    Car car;

    public CruiseControl(Car car) {
        this.car = car;
    }

    public void cruiseSpeed(int speed)
    {

        if(speed>minimumSpeed && speed<car.getTopSpeed()) {
            System.out.println("Cruise control is set on!");
            car.cruiseDrive = true;
            car.cruiseSpeed(speed);
        }
        else
        {
            System.out.println("Cruise control not possible!");
        }
    }
}
