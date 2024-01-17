import java.util.Random;
import java.util.Scanner;

public class MultiplicationTableExam {
    static int points = 0;
    static Scanner scanner = new Scanner(System.in);

    static Random random = new Random();
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            int firstNumber = random.nextInt(1,11);
            int secondNumber = random.nextInt(1,11);
            askMathQuestion(firstNumber,secondNumber);
        }

        if(points == 10)
        {
            System.out.println("Congratulations you have gotten full points and you are a master of multiplication!");
        }
    }

    public static void askMathQuestion(int firstNumber, int secondNumber)
    {
        System.out.println("What is the product of " + firstNumber + " and " + secondNumber);
        int answer = scanner.nextInt();
        answer(firstNumber,secondNumber,answer);
    }

    public static void answer(int firstNumber, int secondNumber, int answer)
    {
        int correctAnswer = firstNumber * secondNumber;
        if(answer == correctAnswer)
        {
            System.out.println("You have earned one point!");
            points++;
            System.out.println("You have " + points + " points!");
        }
        else
        {
            System.out.println("Incorrect answer!");
        }
    }


}
