package model;

import java.io.Serial;
import java.io.Serializable;

public class Aufgabe implements Serializable, Comparable<Aufgabe> {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private Boolean erfuellt;
    private double laenge;
    private String deadline;
    public Aufgabe(String name, Boolean erfuellt, double laenge, String deadline) {
        this.name = name;
        this.erfuellt = erfuellt;
        this.laenge = laenge;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getErfuellt() {
        return erfuellt;
    }

    public void setErfuellt(Boolean erfuellt) {
        this.erfuellt = erfuellt;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Aufgabe{" +
                ", name='" + name + '\'' +
                ", erfuellt=" + erfuellt +
                ", laenge=" + laenge +
                ", deadline='" + deadline + '\'' +
                '}';
    }

    @Override
    public int compareTo(Aufgabe o) {
        int deadline = this.deadline.compareTo(o.getDeadline());
        if (deadline != 0) {
            return deadline;
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Aufgabe) {
            return this.name.equals(((Aufgabe) o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
