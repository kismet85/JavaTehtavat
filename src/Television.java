import java.util.Random;

public class Television {
    Random random = new Random();
    int channel = 1;

    public Television()
    {

    }
    public Television(int channel) {
        this.channel = channel;
    }

    public void setChannel() {
        int randomChannel = random.nextInt(10);
        this.channel += randomChannel;
    }

    public void resetChannel()
    {
        this.channel = 1;
    }
    public int getChannel() {
        setChannel();
        return channel;
    }


}
