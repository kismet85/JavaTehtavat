public class VehicleMain {

    public static void main(String[] args) {

        System.out.println("Vehicle demonstration:");
        Vehicle car = new Car1("Petrol", "Car", "Red");
        Vehicle motorcycle = new Motorcycle("Gasoline", "Motorcycle", "Black");
        Vehicle bus = new Bus1("Diesel", "Bus", 40);

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
    }
}
