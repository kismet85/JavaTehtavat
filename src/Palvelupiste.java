import java.util.LinkedList;
import java.util.Scanner;

public class Palvelupiste {
    static LinkedList<Asiakas> asiakasJono = new LinkedList<>();

    public static void lisaaJonoon(Asiakas asiakas) {
        asiakasJono.add(asiakas);
    }

    public static Asiakas poistaJonosta() {
        return asiakasJono.poll();
    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        boolean kaynnissa = true;
        while (kaynnissa) {
            System.out.println("Valitse toimenpide: ");
            System.out.println("1. Lisää asiakas");
            System.out.println("2. Poista asiakas");
            System.out.println("3. Palvele kaikki asiakkaat");
            System.out.println("0. Lopeta");

            int valinta = scanner.nextInt();

            switch (valinta)
            {
                case 1:
                    Asiakas uusiAsiakas = new Asiakas();
                    lisaaJonoon(uusiAsiakas);
                    System.out.println("Asiakas lisätty jonoon. ID: " + uusiAsiakas.getId());
                    break;
                case 2:
                    palvele();
                    break;
                case 3:
                    palveleKaikkiAsiakkaat();
                    break;
                case 0:
                    System.out.println("Ohjelma lopetetaan.");
                    scanner.close();
                    kaynnissa = false;
                    break;
            }
        }
    }

    public static void palveleKaikkiAsiakkaat()
    {
        for (int i = 0; i < asiakasJono.size(); i++) {
            palvele();
        }
    }
    static void palvele()
    {
        if (!asiakasJono.isEmpty()) {
            Asiakas poistettuAsiakas = poistaJonosta();
            poistettuAsiakas.kulutaAikaa();
            poistettuAsiakas.setLopetusaika(System.currentTimeMillis());
            double AsiakasPalveluAika = poistettuAsiakas.getKulunutAika();
            System.out.println("Asiakas poistettu jonosta. ID: " + poistettuAsiakas.getId() +
                    String.format(", Kulunut aika: %.1f minuuttia", AsiakasPalveluAika));
            poistettuAsiakas.resetAloitusaika();
        } else {
            System.out.println("Jono on tyhjä.");
        }
    }

}
