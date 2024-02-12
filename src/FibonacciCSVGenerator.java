import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSVGenerator {

    public static void main(String[] args) {
        String filename = "fibonacci_sequence.csv";
        generateFibonacciSequenceToFile(filename, 100);
        System.out.println("Fibonacci tallennettu tiedostoon " + filename);
    }

    public static void generateFibonacciSequenceToFile(String filename, int count) {
        try (FileWriter writer = new FileWriter(filename)) {
            long a = 0, b = 1;
            writer.append("Indeksi, Fibonacci Numero\n");
            writer.append("0,").append(String.valueOf(a)).append("\n");
            writer.append("1,").append(String.valueOf(b)).append("\n");

            for (int i = 2; i < count; i++) {
                long next = a + b;
                writer.append(String.valueOf(i)).append(",").append(String.valueOf(next)).append("\n");
                a = b;
                b = next;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
