import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AgeDistributionSimulator {
    public static void main(String[] args) {

        int[][] ageDistribution = {
                {18, 19, 20, 21, 22, 23, 24, 25, 26},
                {7, 10, 14, 18, 20, 22, 30, 35, 40}
        };

        int numberOfSamples = 1000;
        int[] simulatedAges = simulateAgeDistribution(ageDistribution, numberOfSamples);


        Map<Integer, Integer> ageFrequencies = new HashMap<>();
        int otherCount = 0;

        for (int age : simulatedAges) {
            if (age >= 18 && age <= 26) {
                ageFrequencies.put(age, ageFrequencies.getOrDefault(age, 0) + 1);
            } else {
                otherCount++;
            }
        }


        double totalPercentage = 0;
        for (int i = 0; i < ageDistribution[0].length; i++) {
            int age = ageDistribution[0][i];
            int count = ageFrequencies.getOrDefault(age, 0);
            totalPercentage += ageDistribution[1][i] * (double) count / numberOfSamples;
        }

        for (int i = 0; i < ageDistribution[0].length; i++) {
            int age = ageDistribution[0][i];
            int count = ageFrequencies.getOrDefault(age, 0);
            double percentage = ageDistribution[1][i] * (double) count / numberOfSamples / totalPercentage * 100;
            System.out.println("Age " + age + ": " + String.format("%.1f", percentage) + "%");
        }

        double otherPercentage = otherCount / (double) numberOfSamples * 100;
        System.out.println("Other ages (above 26): " + String.format("%.1f", otherPercentage) + "%");
    }

    private static int[] simulateAgeDistribution(int[][] ageDistribution, int numberOfSamples) {
        int[] simulatedAges = new int[numberOfSamples];
        Random random = new Random();

        for (int i = 0; i < numberOfSamples; i++) {
            double rand = random.nextInt(101);
            double cumulativeProbability = 0;

            for (int j = 0; j < ageDistribution[0].length; j++) {
                cumulativeProbability += ageDistribution[1][j];
                if (rand <= cumulativeProbability) {
                    simulatedAges[i] = ageDistribution[0][j];
                    break;
                }
            }
        }

        return simulatedAges;
    }
}
