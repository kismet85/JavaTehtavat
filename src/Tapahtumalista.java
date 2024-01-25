import java.util.PriorityQueue;

public class Tapahtumalista {

    private PriorityQueue<Tapahtuma> tapahtumaLista = new PriorityQueue<>();

    public void lisaaTapahtuma(Tapahtuma tapahtuma) {
        tapahtumaLista.add(tapahtuma);
    }

    public Tapahtuma poistaSeuraavaTapahtuma() {
        return tapahtumaLista.poll();
    }

    public void tulostaTapahtumat() {
        while (!tapahtumaLista.isEmpty()) {
            Tapahtuma tapahtuma = tapahtumaLista.poll();
            System.out.println("Tapahtuma: " + tapahtuma.getTapahtumanTyyppi() + ", Aika: " + tapahtuma.getTapahtumaAika() + " min.");
        }
    }
}
