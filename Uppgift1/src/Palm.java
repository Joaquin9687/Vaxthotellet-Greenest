// Arv
public class Palm extends Växt {


    private static final double VÄTSKE_FAKTOR_PER_METER = 0.5;
    private static final Vätsketyp VÄTSKETYPE = Vätsketyp.KRANVATTEN;


    public Palm(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
    }

 // Polymorfism
 // Beräknar 0,5 liter kranvatten per meter
    @Override
    public double beräknaVätskemängd() {

        return VÄTSKE_FAKTOR_PER_METER * getHöjdIMeter();
    }

    @Override
    public Vätsketyp hämtaVätsketyp() {
        return VÄTSKETYPE;
    }
}