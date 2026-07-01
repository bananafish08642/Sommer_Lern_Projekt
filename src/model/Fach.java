package model;

public enum Fach {
    GGP("Geografie"),
    D("Deutsch"),
    M("Mathe"),
    E("Englisch"),
    SEW("Softwareentwicklung"),
    ITP("Informationstechnische Projekte"),
    NAWI("Naturwissenschaften"),
    SYT("Systemtechnik"),
    INSY("Informationssysteme");

    private String bezeichnung;
    private Fach(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
