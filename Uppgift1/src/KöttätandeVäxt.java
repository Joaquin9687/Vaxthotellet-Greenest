
public class KöttätandeVäxt extends Växt {

    private static final double BASNIVÅ_LITER = 0.1;
    private static final double MULTIPLIKATOR_LITER = 0.2;
    private static final Vätsketyp VÄTSKETYPE = Vätsketyp.PROTEINDRYCK;

    public KöttätandeVäxt(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
    }

    // Beräknar vätskemängden med en basnivå plus ett tillägg som beror på växtens höjd
    @Override
    public double beräknaVätskemängd() {
        return BASNIVÅ_LITER + (MULTIPLIKATOR_LITER * getHöjdIMeter());
    }

    @Override
    public Vätsketyp hämtaVätsketyp() {
        return VÄTSKETYPE;
    }
}