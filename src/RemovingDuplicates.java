import java.util.HashSet;
import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int arraySize = scanner.nextInt();

        int[] arrayList = new int[arraySize];
        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter integer " + (i + 1) + ":");
            arrayList[i] = scanner.nextInt();
        }
        int[] uniqueArray = removeDuplicates(arrayList);

        System.out.println("The array without duplicates:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }


    public static int[] removeDuplicates ( int[] array){
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            uniqueSet.add(array[i]);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int uniqueValue : uniqueSet) {
            uniqueArray[index++] = uniqueValue;
        }

        return uniqueArray;
    }

}