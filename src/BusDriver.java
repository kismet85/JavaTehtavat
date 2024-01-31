public class BusDriver {

    public static void main(String[] args) {
        Bus bus = new Bus(200.0, 80,0);

        System.out.println("Current amount of passangers: " + bus.getNumberOfPassangers());
        System.out.println("-------------------------------------");
        bus.setCurrentSpeed(50,5);
        bus.setCurrentSpeed(0,5);
        System.out.println("Bus stopped, to pickup passangers!");
        bus.passengerEnter(10);
        System.out.println("Current amount of passangers: " + bus.getNumberOfPassangers());
        System.out.println("Continuing route!");
        bus.setCurrentSpeed(60,5);
        bus.setCurrentSpeed(0,5);
        System.out.println("Bus stopped, to pickup passangers!");
        bus.passengerEnter(20);
        System.out.println("Current amount of passangers: " + bus.getNumberOfPassangers());
        bus.setCurrentSpeed(60,5);
        bus.setCurrentSpeed(0,5);
        System.out.println("Bus stopped, to pickup passangers!");
        bus.passengerExit(10);
        System.out.println("Current amount of passangers: " + bus.getNumberOfPassangers());
        bus.passengerEnter(30);
        System.out.println("Current amount of passangers: " + bus.getNumberOfPassangers());
        bus.setCurrentSpeed(60,5);
        bus.setCurrentSpeed(0,5);
        System.out.println("Bus stopped, to pickup passangers!");
        bus.passengerExit(10);
        System.out.println("Current amount of passangers: " + bus.getNumberOfPassangers());
        bus.passengerEnter(30);
        System.out.println("Current amount of passangers: " + bus.getNumberOfPassangers());
        bus.passengerEnter(100);
        System.out.println("Current amount of passangers: " + bus.getNumberOfPassangers());

    }
}
