//Enum: definiera en fast uppsättning konstanta värden som inte ska ändras
public enum Vätsketyp {
    KRANVATTEN("kranvatten"),
    MINERALVATTEN("mineralvatten"),
    PROTEINDRYCK("proteindryck");

    // Texten som visas för användaren
    private final String visningsNamn;

    Vätsketyp(String visningsNamn) {
        this.visningsNamn = visningsNamn;
    }

    public String getVisningsNamn() {
        return this.visningsNamn;
    }
}