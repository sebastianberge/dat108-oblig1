package no.hvl.dat108.task3;

import no.hvl.dat108.task3.Main.Funksjon;

public class Ansatt {
    private String fornavn;
    private String etternavn;
    private String kjonn;
    private String stilling;
    private double aarslonn;

    public Ansatt(String fornavn, String etternavn, String kjonn, String stilling, double aarslonn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjonn = kjonn;
        this.stilling = stilling;
        this.aarslonn = aarslonn;
    }

    public void endreLonn(Funksjon f) {
        aarslonn = f.endretLonn(aarslonn);
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getKjonn() {
        return kjonn;
    }

    public void setKjonn(String kjonn) {
        this.kjonn = kjonn;
    }

    public String getStilling() {
        return stilling;
    }

    public void setStilling(String stilling) {
        this.stilling = stilling;
    }

    public double getAarslonn() {
        return aarslonn;
    }

    public void setAarslonn(double aarslonn) {
        this.aarslonn = aarslonn;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}