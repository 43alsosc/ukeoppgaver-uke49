package com.example.uke49b;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OppgaveKontroller {
    @PostMapping("/lagre")
    public Oppgave returOppgave(Oppgave innOppgave) {
        return innOppgave;
    }
}
