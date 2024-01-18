//Write a program that generates random names by combining first and last names from hard-coded name arrays. The program should work as follows:
//
//Create two arrays, firstNames and lastNames, which contain first and last names.
//
//Ask the user how many random names the program should generate.
//
//Generate random names using the following logic:
//
//Choose the index value for the first name randomly.
//Choose the index value for the last name randomly.
//Use the index values to create a random full name (i.e. first name and last name).
//Print the generated full name.
//Repeat these steps as many times as the user-specified number of names to generate.

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        String[] firstNames = {"Tom", "Jerry", "David", "Alex", "Mauno", "Erkki", "Kova"};
        String[] lastNames = {"Brit", "Saxon", "Ice", "Tolonen", "Koivisto", "Merkki", "Äijä"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter how many random names you wish to be generated:");
        int randomNameAmount= scanner.nextInt();
        for (int i = 0; i < randomNameAmount; i++) {
            int firstNameRandom = random.nextInt(0,firstNames.length);
            int lastNameRandom = random.nextInt(0,lastNames.length);

            String name = firstNames[firstNameRandom] + " " + lastNames[lastNameRandom];
            System.out.println(name);
        }
    }
}
