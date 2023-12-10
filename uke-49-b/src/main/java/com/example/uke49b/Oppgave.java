package com.example.uke49b;

public class Oppgave {

    // Definerer Attributtene
    private String oppgave;
    private String beskrivelse;

    // Konstruktør
    public Oppgave(String oppgave, String beskrivelse) {
        this.oppgave = oppgave;
        this.beskrivelse = beskrivelse;
    }

    // Tom konstruktør
    public Oppgave() {
    }

    // Get metoder
    public String getOppgave() {
        return oppgave;
    }
    public String getBeskrivelse() {
        return beskrivelse;
    }

    // Set metoder
    public void setOppgave(String oppgave) {
        this.oppgave = oppgave;
    }
    public void  setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
}