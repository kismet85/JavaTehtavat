import java.util.Scanner;

public class CarDriver {

    static Scanner scanner = new Scanner(System.in);
    static boolean carIsOn = false;
    static Car car1 =  new Car(50.0f, 160);
    public static void main(String[] args) {
        driveCar();
    }

    public static void driveCar()
    {
        startCar();
        while(carIsOn) {
            System.out.println("Valitse toiminto:");
            System.out.println("1: Kiihdytä");
            System.out.println("2: Hidasta");
            System.out.println("3: Tarkista polttoainemäärä");
            System.out.println("4: Cruise control");
            int valinta = scanner.nextInt();
            switch (valinta) {
                case 1:
                    System.out.println("Accelerate speed to km/h:");
                    int nopeudenNousu = scanner.nextInt();
                    increaseSpeed(nopeudenNousu);
                    break;
                case 2:
                    System.out.println("Decelerate Speed to km/h:");
                    int nopeudenLasku = scanner.nextInt();
                    decreaseSpeed(nopeudenLasku);
                    break;
                case 3:
                    System.out.println("Current gasoline tank has " + car1.getGasolineTank() + " Litres");
                    break;
                case 4:
                    System.out.println("Set Cruise control speed:");
                    int cruiseSpeed = scanner.nextInt();
                    car1.cruiseControl.cruiseSpeed(cruiseSpeed);
                    break;
                default:
            }
        }
    }
    public static void startCar()
    {
        carIsOn = true;
        System.out.println("Käynnistit auton!");
        System.out.println("BRRRRrrrrmmmm");
    }

    public static void increaseSpeed(int nopeudenTavoite)
    {
        if(carIsOn) {
            if(car1.getCurrentSpeed()>nopeudenTavoite)
            {
                System.out.println("Already driving faster!");
            }
            else {
                car1.setCurrentSpeed(nopeudenTavoite);
            }
        }
    }

    public static void decreaseSpeed(int nopeudenTavoite)
    {
        if(carIsOn) {
            if(car1.getCurrentSpeed()<nopeudenTavoite)
            {
                System.out.println("Invalid option!");
            }
            else {
                car1.setCurrentSpeed(nopeudenTavoite);
            }
        }
    }


}
