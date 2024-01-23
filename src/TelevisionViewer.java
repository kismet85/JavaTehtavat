import java.util.Random;

public class TelevisionViewer {
    static Random random = new Random();
    static int day = 1;
    boolean sleeping = false;

    public TelevisionViewer(int day, boolean sleeping) {
        this.day = day;
        this.sleeping = sleeping;
    }

    public static int getDay() {
        return day;
    }

    public static void setDay() {
        day++;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    static Television television = new Television();

    public static void main(String[] args) {
            while (day != 10) {
                System.out.println(wakeUp());
                watchTv();
                television.resetChannel();
                sleep();
            }

    }

    public static void watchTv()
    {
        int randomAmountOfChannels = random.nextInt(1,5);
        for (int i = 0; i < randomAmountOfChannels; i++) {
                System.out.println("Watching channel " + television.getChannel());
                television.resetChannel();
        }
    }
    public static String wakeUp()
    {
        return ("Woke up, " + "day " + getDay());
    }

    public static void sleep()
    {
        System.out.println("Falling asleep");
        setDay();
    }
}
