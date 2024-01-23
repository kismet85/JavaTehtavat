import java.util.Random;

public class Asiakas implements Comparable<Asiakas> {
    private static int seuraavaId = 1;
    private static final Random random = new Random();
    private int id;
    private long aloitusaika;
    private long lopetusaika;

    public Asiakas() {
        this.id = seuraavaId++;
        this.aloitusaika = 0;
        this.lopetusaika = 0;
    }

    public int getId() {
        return id;
    }

    public long getAloitusaika() {
        return aloitusaika;
    }

    public long getLopetusaika() {
        return lopetusaika;
    }

    public void setLopetusaika(long lopetusaika) {
        this.lopetusaika = lopetusaika;
    }

    public void kulutaAikaa()
    {
        this.aloitusaika = System.currentTimeMillis();
        int randomTimeSpent = random.nextInt(2000,7000);
        try {
            Thread.sleep(randomTimeSpent);
            setLopetusaika(System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public long getKulunutAika() {
        if (lopetusaika == 0) {
            return 0;
        } else {
            return (lopetusaika - aloitusaika) / 1000;
        }
    }

    public void resetAloitusaika() {
        this.aloitusaika = System.currentTimeMillis();
    }


    public static void main(String[] args) {
        Asiakas asiakas1 = new Asiakas();
        asiakas1.kulutaAikaa();

        asiakas1.setLopetusaika(System.currentTimeMillis());

        Asiakas asiakas2 = new Asiakas();
        asiakas2.kulutaAikaa();
        asiakas2.setLopetusaika(System.currentTimeMillis());


        System.out.println("Asiakas 1 - ID: " + asiakas1.getId() + ", Kulunut aika: " + asiakas1.getKulunutAika() + " ms");
        System.out.println("Asiakas 2 - ID: " + asiakas2.getId() + ", Kulunut aika: " + asiakas2.getKulunutAika() + " ms");
    }

    @Override
    public int compareTo(Asiakas other) {
        return Long.compare(this.aloitusaika, other.aloitusaika);
    }
}
