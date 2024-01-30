public class Kello {
    private static Kello instance;
    private long aika;

    private Kello() {
        aika = 0;
    }

    public static Kello getInstance() {
        if (instance == null) {
            instance = new Kello();
        }
        return instance;
    }

    public void asetaAika(long uusiAika) {
        this.aika = uusiAika;
    }

    public long haeAika() {
        return aika;
    }
}
