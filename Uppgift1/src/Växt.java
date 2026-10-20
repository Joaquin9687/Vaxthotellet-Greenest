//Interface
public abstract class Växt implements VätskeBeräknare {
    //Inkapsling
    private final String namn;
    private final double höjdIMeter;

    public Växt(String namn, double höjdIMeter) {
        this.namn = namn;
        this.höjdIMeter = höjdIMeter;
    }


    public String getNamn() {
        return namn;
    }

    public double getHöjdIMeter() {
        return höjdIMeter;
    }
}