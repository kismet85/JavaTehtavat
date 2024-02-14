class NumberPrinter implements Runnable {
    private final int start;
    private final int end;
    private final boolean isOdd;

    public NumberPrinter(int start, int end, boolean isOdd) {
        this.start = start;
        this.end = end;
        this.isOdd = isOdd;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if ((i % 2 == 0 && !isOdd) || (i % 2 != 0 && isOdd)) {
                System.out.println((isOdd ? "Odd" : "Even") + " Thread: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 20;

        Thread oddThread = new Thread(new NumberPrinter(start, end, true));
        Thread evenThread = new Thread(new NumberPrinter(start, end, false));

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Printing complete.");
    }
}
