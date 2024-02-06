public class VehicleMain {

    public static void main(String[] args) {

        System.out.println("Vehicle demonstration:");
        Vehicle car = new Car1("Petrol", "Car", "Red");
        Vehicle motorcycle = new Motorcycle("Gasoline", "Motorcycle", "Black");
        Vehicle bus = new Bus1("Diesel", "Bus", 40);
        Vehicle car2 = new Car2("Petrol", "Car", "Red");
        Vehicle motorcycle2 = new Motorcycle1("Gasoline", "Motorcycle", "Black");
        Vehicle bus2 = new Bus2("Diesel", "Bus", 40);
        Vehicle tesla = new ElectricCar("Electric", "Car", "Silver");
        Vehicle electrobike = new ElectricMotorcycle("Electric", "Motorcycle", "White");


        car.start();
        car.stop();
        car.getInfo();

        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();

        System.out.println();

        bus.start();
        bus.stop();
        bus.getInfo();

        System.out.println("----------------------------");

        car2.start();
        car2.stop();
        car2.getInfo();

        System.out.println();

        motorcycle2.start();
        motorcycle2.stop();
        motorcycle2.getInfo();

        System.out.println();

        bus2.start();
        bus2.stop();
        bus2.getInfo();

        System.out.println();

        tesla.start();
        tesla.stop();
        tesla.getInfo();

        System.out.println();

        electrobike.start();
        electrobike.stop();
        electrobike.getInfo();
    }
}
