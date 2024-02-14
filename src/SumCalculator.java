class SumCalculator implements Runnable {
    private final int[] numbers;
    private final int start;
    private final int end;
    private long sum;

    public SumCalculator(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = start; i <= end; i++) {
            sum += numbers[i];
        }
    }

    public long getSum() {
        return sum;
    }
}
