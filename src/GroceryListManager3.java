import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryListManager3 {
    static Scanner scanner = new Scanner(System.in);
    private static Map<String, Double> groceryList = new HashMap<>();
    private static Map<String, String> itemCategories = new HashMap<>();
    static GroceryListManager3 grocerylist = new GroceryListManager3();
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
            System.out.println("5: Show all items by category.");
            System.out.println("6: Finish.");
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
                    showCategoryChoices();
                    break;
                case 6:
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
        String currentItem;
        switch (valinta)
        {
            case 1:
                currentItem = "Apple";
                System.out.println("Adding " + currentItem + " to list.");
                if(!checkItem(currentItem)) {
                    grocerylist.addItem(currentItem , 1.00);
                    grocerylist.addItemWithCategory(currentItem,"Fruits");
                }
                break;
            case 2:
                currentItem = "Milk";
                System.out.println("Adding " + currentItem + " to list.");
                if(!checkItem(currentItem)) {
                    grocerylist.addItem(currentItem,1.29);
                    grocerylist.addItemWithCategory(currentItem,"Dairy");
                }
                break;
            case 3:
                currentItem = "Bread";
                System.out.println("Adding " + currentItem + " to list.");
                if(!checkItem(currentItem)) {
                    grocerylist.addItem(currentItem, 1.49);
                    grocerylist.addItemWithCategory(currentItem,"Bakery");
                }
                break;
            case 4:
                currentItem = "Candy";
                System.out.println("Adding " + currentItem + " to list.");
                if(!checkItem(currentItem)) {
                    grocerylist.addItem(currentItem, 2.50);
                    grocerylist.addItemWithCategory(currentItem,"Sweets");
                }
                break;
            case 5:
                currentItem = "Meat";
                System.out.println("Adding " + currentItem + " to list.");
                if(!checkItem(currentItem)) {
                    grocerylist.addItem(currentItem, 5.50);
                    grocerylist.addItemWithCategory(currentItem,"Animal husbandry");
                }
                break;
            case 6:
                currentItem = "Eggs";
                System.out.println("Adding " + currentItem + " to list.");
                if(!checkItem(currentItem)) {
                    grocerylist.addItem(currentItem, 2.20);
                    grocerylist.addItemWithCategory(currentItem,"Animal husbandry");
                }
                break;
            case 7:
                currentItem = "Cookies";
                System.out.println("Adding " + currentItem + " to list.");
                if(!checkItem(currentItem)) {
                    grocerylist.addItem(currentItem,2.10);
                    grocerylist.addItemWithCategory(currentItem,"Bakery");
                }
                break;
            case 8:
                currentItem = "Pizza";
                System.out.println("Adding " + currentItem + " to list.");
                if(!checkItem(currentItem)) {
                    grocerylist.addItem(currentItem, 6.90);
                    grocerylist.addItemWithCategory(currentItem,"Bakery");
                }
                break;
            case 9:
                currentItem = "Margarin";
                System.out.println("Adding " + currentItem + " to list.");
                if(!checkItem(currentItem)) {
                    grocerylist.addItem(currentItem, 1.79);
                    grocerylist.addItemWithCategory(currentItem,"Dairy");
                }
                break;
            case 10:
                currentItem = "Juice";
                System.out.println("Adding " + currentItem + " to list.");
                if(!checkItem(currentItem)) {
                    grocerylist.addItem(currentItem, 2.19);
                    grocerylist.addItemWithCategory(currentItem,"Fruits");
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

    public void addItemWithCategory(String item, String category)
    {
        itemCategories.put(item,category);
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

    public static void showCategoryChoices()
    {
        for (Map.Entry<String, String> entry : itemCategories.entrySet()) {
            String categoryName = entry.getValue();
            System.out.println("Category: " + categoryName);
        }
        System.out.println("Write category to get all items of that category type.");
        scanner.nextLine();
        String categoryChoice = scanner.nextLine();
        displayByCategory(categoryChoice);
    }
    public static void displayByCategory(String category)
    {
        for (Map.Entry<String, String> entry : itemCategories.entrySet()) {
            String item = entry.getKey();
            String categoryName = entry.getValue();
            if (category.equalsIgnoreCase(categoryName)) {
                System.out.println("DISPLAYING ALL ITEMS BY CATEGORY:");
                System.out.println("Food item: " + item);
            }
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
