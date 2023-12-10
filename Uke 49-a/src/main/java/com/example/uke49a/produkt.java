package com.example.uke49a;

public class produkt {
    private String navn;
    private String pris;

    // Konstruktør
    public produkt(String navn, String pris) {
        this.navn = navn;
        this.pris = pris;
    }

    // Tom konstruktør
    public produkt() {
    }

    // Get metoder
    public String getNavn() {
        return navn;
    }
    public String getPris() {
        return pris;
    }

    // Set metoder
    public void setNavn(String navn) {
        this.navn = navn;
    }
    public void  setPris(String pris) {
        this.pris = pris;
    }
}
