import java.util.PriorityQueue;
import java.util.Scanner;

public class AsiakasJono {
    static PriorityQueue<Asiakas> asiakasJono = new PriorityQueue<>();
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        boolean kaynnissa = true;
        while (kaynnissa) {
            System.out.println("Valitse toimenpide: ");
            System.out.println("1. Lisää asiakas");
            System.out.println("2. Poista asiakas");
            System.out.println("0. Lopeta");

            int valinta = scanner.nextInt();

            switch (valinta)
            {
                case 1:
                    Asiakas uusiAsiakas = new Asiakas();
                    asiakasJono.add(uusiAsiakas);
                    System.out.println("Asiakas lisätty jonoon. ID: " + uusiAsiakas.getId());
                    break;
                case 2:
                    if (!asiakasJono.isEmpty()) {
                        Asiakas poistettuAsiakas = asiakasJono.poll();
                        poistettuAsiakas.kulutaAikaa();
                        poistettuAsiakas.setLopetusaika(System.currentTimeMillis());
                        double AsiakasPalveluAika = poistettuAsiakas.getKulunutAika();
                        System.out.println("Asiakas poistettu jonosta. ID: " + poistettuAsiakas.getId() +
                                String.format(", Kulunut aika: %.1f minuuttia", AsiakasPalveluAika));
                        poistettuAsiakas.resetAloitusaika();
                    } else {
                        System.out.println("Jono on tyhjä.");
                    }
                    break;
                case 0:
                    System.out.println("Ohjelma lopetetaan.");
                    scanner.close();
                    kaynnissa = false;
                    break;
            }
        }
    }

}
