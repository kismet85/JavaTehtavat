import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryListManager2 {
    static Scanner scanner = new Scanner(System.in);
    private static Map<String, Double> groceryList = new HashMap<>();
    static GroceryListManager2 grocerylist = new GroceryListManager2();
    static boolean isBuying = false;
    static boolean isChoosing = false;

    public static void main(String[] args) {

        StartChoices();

    }

    private static void StartChoices() {
        isChoosing = true;
        while(isChoosing)
        {
            System.out.println("1: Add items.");
            System.out.println("2: Remove items.");
            System.out.println("3: Check item.");
            System.out.println("4: Show all items in grocerylist and the total price.");
            System.out.println("5: Finish.");
            int tekoValinta = scanner.nextInt();
            switch (tekoValinta)
            {
                case 1:
                    System.out.println("Adding items in list.");
                    StartBuying();
                    break;
                case 2:
                    System.out.println("Removing items in list");
                    System.out.println("Choose which item to remove by writing the name of the item from the list." );
                    displayList();
                    scanner.nextLine();
                    String removableitem = scanner.nextLine();
                    if(checkItem(removableitem)) {
                        removeItem(removableitem);
                    }
                    else
                    {
                        System.out.println("Item doesnt exist.");
                    }
                    break;
                case 3:
                    System.out.println("Check item");
                    scanner.nextLine();
                    String itemToCheck = scanner.nextLine();
                    checkItem(itemToCheck);
                    break;
                case 4:
                    displayList();
                    System.out.printf("Total price of all items in grocerylist: %.2f\n", calculateTotalCost());
                    break;
                case 5:
                    isChoosing = false;
                    System.out.println("Program finished!");
                    break;
                default:
                    System.out.println("Inocorrect choice.");
            }
        }
    }

    private static void StartBuying() {
        isBuying = true;
        while(isBuying)
        {
            System.out.println("Add food items into your grocerylist:");
            System.out.println("1: Apples");
            System.out.println("2: Milk");
            System.out.println("3: Bread");
            System.out.println("4: Candy");
            System.out.println("5: Meat");
            System.out.println("6: Eggs");
            System.out.println("7: Cookies");
            System.out.println("8: Pizza");
            System.out.println("9: Margarin");
            System.out.println("10: Juice");
            System.out.println("0: Stop adding.");

            int valinta = scanner.nextInt();

            manageGrocery(valinta);

        }
    }

    private static void manageGrocery(int valinta) {
        switch (valinta)
        {
            case 1:
                System.out.println("Adding Apples to list.");
                if(!checkItem("Apple")) {
                    grocerylist.addItem("Apple" , 1.00);
                }
                break;
            case 2:
                System.out.println("Adding Milk to list.");
                if(!checkItem("Milk")) {
                    grocerylist.addItem("Milk",1.29);
                }
                break;
            case 3:
                System.out.println("Adding Bread to list.");
                if(!checkItem("Bread")) {
                    grocerylist.addItem("Bread", 1.49);
                }
                break;
            case 4:
                System.out.println("Adding Candy to list.");
                if(!checkItem("Candy")) {
                    grocerylist.addItem("Candy", 2.50);
                }
                break;
            case 5:
                System.out.println("Adding Meat to list.");
                if(!checkItem("Meat")) {
                    grocerylist.addItem("Meat", 5.50);
                }
                break;
            case 6:
                System.out.println("Adding Eggs to list.");
                if(!checkItem("Eggs")) {
                    grocerylist.addItem("Eggs", 2.20);
                }
                break;
            case 7:
                System.out.println("Adding Cookies to list.");
                if(!checkItem("Cookies")) {
                    grocerylist.addItem("Cookies",2.10);
                }
                break;
            case 8:
                System.out.println("Adding Pizza to list.");
                if(!checkItem("Pizza")) {
                    grocerylist.addItem("Pizza", 6.90);
                }
                break;
            case 9:
                System.out.println("Adding Margarin to list.");
                if(!checkItem("Margarin")) {
                    grocerylist.addItem("Margarin", 1.79);
                }
                break;
            case 10:
                System.out.println("Adding Juice to list.");
                if(!checkItem("Juice")) {
                    grocerylist.addItem("Juice", 2.19);
                }
                break;
            case 0:
                isBuying = false;
                break;
            default:
                System.out.println("No valid option entered!");
        }
    }

    public void addItem(String item, Double price)
    {
        groceryList.put(item,price);
    }
    public static void removeItem(String item)
    {
        groceryList.remove(item);
        System.out.println("Item " + item + " removed from grocerylist!");
    }
    public static void displayList()
    {
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            String name = entry.getKey();
            double price = entry.getValue();
            System.out.println("Item: " + name + ", price: " + price);
        }
    }
    public static boolean checkItem(String item)
    {
        if (groceryList.containsKey(item)) {
            System.out.println("Item " + item + " already exists in grocerylist.");
            return true;
        } else {
            System.out.println("Item doesnt exist.");
            return false;
        }
    }

    public static double calculateTotalCost()
    {
        double totalPrice = 0.00;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            double price = entry.getValue();
            totalPrice += price;
        }
        return totalPrice;
    }
}
