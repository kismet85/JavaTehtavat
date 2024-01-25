import java.util.Random;

public class Tapahtuma implements Comparable<Tapahtuma> {

    public enum TapahtumanTyyppi {
        SAAPUMINEN, POISTUMINEN
    }

    private long tapahtumaAika;
    private TapahtumanTyyppi tapahtumanTyyppi;

    public Tapahtuma(long tapahtumaAika, TapahtumanTyyppi tapahtumanTyyppi) {
        this.tapahtumaAika = tapahtumaAika;
        this.tapahtumanTyyppi = tapahtumanTyyppi;
    }

    public long getTapahtumaAika() {
        return tapahtumaAika;
    }

    public TapahtumanTyyppi getTapahtumanTyyppi() {
        return tapahtumanTyyppi;
    }

    @Override
    public int compareTo(Tapahtuma other) {
        return Long.compare(this.tapahtumaAika, other.tapahtumaAika);
    }


    public static void main(String[] args) {
        Random random = new Random();
        int tapahtumanAika = random.nextInt(5,20);
        Tapahtuma tapahtuma1 = new Tapahtuma(0, TapahtumanTyyppi.SAAPUMINEN);
        Tapahtuma tapahtuma2 = new Tapahtuma(tapahtumanAika, TapahtumanTyyppi.POISTUMINEN);

        Tapahtumalista tapahtumalista = new Tapahtumalista();

        tapahtumalista.lisaaTapahtuma(tapahtuma1);
        tapahtumalista.lisaaTapahtuma(tapahtuma2);

        tapahtumalista.tulostaTapahtumat();
    }
}
