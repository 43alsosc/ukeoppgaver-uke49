package com.example.uke49a;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class produktKontroller {
    @PostMapping("/lagre")
    public produkt returProdukt(produkt innProdukt) {
        return innProdukt;
    }
}