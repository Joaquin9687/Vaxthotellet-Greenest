public class Kaktus extends Växt {

    private static final double FLAT_RATE_LITERS = 0.02;
    private static final Vätsketyp VÄTSKETYPE = Vätsketyp.MINERALVATTEN;

    public Kaktus(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
    }

    // Kaktusen får en fast mängd mineralvatten varje dag
    @Override
    public double beräknaVätskemängd() {
        return FLAT_RATE_LITERS;
    }

    @Override
    public Vätsketyp hämtaVätsketyp() {
        return VÄTSKETYPE;
    }
}