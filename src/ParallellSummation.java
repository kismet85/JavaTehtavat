public class ParallelSummation {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = 4; // Number of threads to use
        int allNumbers = numbers.length / numThreads;

        // Create and start threads
        SumCalculator[] calculators = new SumCalculator[numThreads];
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int start = i * allNumbers;
            int end = (i == numThreads - 1) ? numbers.length - 1 : (i + 1) * allNumbers - 1;
            calculators[i] = new SumCalculator(numbers, start, end);
            threads[i] = new Thread(calculators[i]);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long totalSum = 0;
        for (SumCalculator calculator : calculators) {
            totalSum += calculator.getSum();
        }

        System.out.println("Total sum: " + totalSum);
    }
}
