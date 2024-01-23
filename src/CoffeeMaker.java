import java.util.Scanner;

//A coffee maker has a selector for coffee type (normal/espresso) and a selector for coffee amount (10–80 ml).
//It also has an of/off switch that behaves in the same way as TV of/off switch. Coffee type and amount selectors behave like TV channel switch, i.e.,
//they can only be changed when the device is on, and the device remembers the selections even when it is switched off.
public class CoffeeMaker {
    static Scanner scanner = new Scanner(System.in);
    int amountOfCoffee;

    static boolean deviceOn = false;

    public CoffeeMaker(int amountOfCoffee, boolean deviceOn) {

        this.amountOfCoffee = amountOfCoffee;
        this.deviceOn = deviceOn;
    }

    public int getAmountOfCoffee() {
        return amountOfCoffee;
    }

    public void setAmountOfCoffee(int amountOfCoffee) {
        this.amountOfCoffee = amountOfCoffee;
    }

    public static boolean isDeviceOn() {
        return deviceOn;
    }

    public static void setDeviceOn(boolean deviceOffOn) {
        deviceOn = true;
    }
    public static void setDeviceOff(boolean deviceOffOn) {
        deviceOn = false;
    }

    public static void main(String[] args) {
        turnCoffeeOn();
    }

    public static void turnCoffeeOn()
    {
        System.out.println("Coffee machine is off, do you want to turn it on?");
        System.out.print("1= On, 2= Off:");
        int valinta = scanner.nextInt();
        while(!isDeviceOn()) {
            if (valinta == 1) {
                setDeviceOn(deviceOn);
                kahviValinta();
            } else if (valinta == 2) {
                setDeviceOff(deviceOn);
            }
        }
    }
    public static void kahviValinta()
    {
        String kahvi = null;
        if(isDeviceOn())
        {
            System.out.println("Do you want normal coffee[1] or espresso[2]?");
            int kahviValinta = scanner.nextInt();
            if(kahviValinta==1)
            {
                kahvi = "Normaali";
            }
            else if(kahviValinta==2)
            {
                kahvi = "Espresso";
            }
            do {
                System.out.println("Enter the amount of coffee 10-80ml.");
                int kahviMaara = scanner.nextInt();
                if(kahviMaara >= 10 && kahviMaara <= 80)
                {
                    System.out.println("Valitsit kahvin " + kahvi + ", kahvin määrä on: " + kahviMaara + "ml");
                    break;
                }
            }
            while(kahviValinta!= 1 || kahviValinta != 2);

        }
    }
}
