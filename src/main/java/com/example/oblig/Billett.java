package com.example.oblig;

import java.util.Comparator;

public class Billett implements Comparable<Billett> {
    private int id;
    private String film;
    private int antall;
    private String fnavn, enavn, tlfnr, epost;

    public Billett(int id, String film, int antall, String fnavn, String enavn, String tlfnr, String epost) {
        this.id = id;
        this.film = film;
        this.antall = antall;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.tlfnr = tlfnr;
        this.epost = epost;
    }

    public Billett() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(String tlfnr) {
        this.tlfnr = tlfnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    @Override
    public int compareTo(Billett billett) {
        return this.getEnavn().compareToIgnoreCase(billett.getEnavn());
    }
}
