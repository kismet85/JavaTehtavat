import java.util.Random;

public class Saapumisprosessi {
    private Tapahtumalista tapahtumalista;
    private Random randomGenerator;
    private Tapahtuma.TapahtumanTyyppi tapahtumanTyyppi;

    public Saapumisprosessi(Tapahtumalista tapahtumalista, Tapahtuma.TapahtumanTyyppi tapahtumanTyyppi) {
        this.tapahtumalista = tapahtumalista;
        this.randomGenerator = new Random();
        this.tapahtumanTyyppi = tapahtumanTyyppi;
    }

    public void luoUusiTapahtuma(Kello kello) {
        long saapumisaika = kello.haeAika() + (long) randomGenerator.nextDouble() * 10;
        Tapahtuma uusiTapahtuma = new Tapahtuma(saapumisaika, tapahtumanTyyppi);
        tapahtumalista.lisaaTapahtuma(uusiTapahtuma);
        kello.asetaAika(saapumisaika);
    }
}
