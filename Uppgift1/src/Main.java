import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

        private static final String FRÅGA_MEDDELANDE = "Vilken växt ska få vätska?";
        private static final String TOM_INMATNING_MEDDELANDE = "Fel: Inmatningen får inte vara tom!";
        private static final String HITTADE_INTE_MEDDELANDE = "Det finns ingen växt vid det namnet på hotellet.";

        private static final String RESULTAT_MALL = "Växten %s ska få %.2f liter %s per dag.";

        public static void main(String[] args) {
                //Polymorfism
                List<Växt> hotellGäster = new ArrayList<>();

                hotellGäster.add(new Kaktus("Igge", 0.20));
                hotellGäster.add(new Palm("Laura", 5.0));
                hotellGäster.add(new KöttätandeVäxt("Meatloaf", 0.7));
                hotellGäster.add(new Palm("Olof", 1.0));

                String indata = JOptionPane.showInputDialog(null, FRÅGA_MEDDELANDE);

                //Felhantering
                if (indata == null || indata.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, TOM_INMATNING_MEDDELANDE, "Fel", JOptionPane.ERROR_MESSAGE);
                        return;
                }

                String sökNamn = indata.trim();
                Växt hittadVäxt = null;

                for (Växt växt : hotellGäster) {
                        if (växt.getNamn().equalsIgnoreCase(sökNamn)) {
                                hittadVäxt = växt;
                                break;
                        }
                }
                // Polymorfism
                if (hittadVäxt != null) {

                        double mängd = hittadVäxt.beräknaVätskemängd();
                        String vätskeNamn = hittadVäxt.hämtaVätsketyp().getVisningsNamn();

                        String utdataMeddelande = String.format(RESULTAT_MALL, hittadVäxt.getNamn(), mängd, vätskeNamn);

                        JOptionPane.showMessageDialog(null, utdataMeddelande);
                } else {
                        JOptionPane.showMessageDialog(null, HITTADE_INTE_MEDDELANDE, "Hittades ej", JOptionPane.WARNING_MESSAGE);
                }
        }