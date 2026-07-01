package model;

public class Schulaufgabe extends Aufgabe {
    private Fach fach;
    public Schulaufgabe(Fach fach, String name, Boolean erfuellt, double laenge, String deadline) {
        super(name, erfuellt, laenge, deadline);
        this.fach = fach;
    }

    public Fach getFach() {
        return fach;
    }

    public void setFach(Fach fach) {
        this.fach = fach;
    }
}
