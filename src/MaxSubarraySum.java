import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int arraySize = scanner.nextInt();

        int[] arrayList = new int[arraySize];
        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter integer " + (i+1) + ":");
            arrayList[i] = scanner.nextInt();
        }
        findMaxSum(arrayList);

    }

    public static void findMaxSum(int[] list)
    {
        int minimumValue = list[0];
        int firstIndex = 0;
        int lastIndex = 0;
        int maxValue = minimumValue;
        int currentValue = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                currentValue +=list[j];
                if(currentValue > maxValue)
                {
                    maxValue = currentValue;

                    firstIndex = i;
                    lastIndex = j;
                }
            }
            currentValue = 0;
        }
        System.out.println("Current maxvalue is: " + maxValue);
        System.out.println("Integers: " + firstIndex + " - " + lastIndex);
    }
}
