package com.company;

import Prodavnica.Prodavnica;
import Prodavnica.Racun;
import artikli.Artikal;
import artikli.Kozmetika;
import artikli.Povrce;
import artikli.Voce;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Artikal a1 = new Povrce("Krompir", "kg", 50 );
        Artikal a2 = new Povrce("Luk", "kg", 60 );
        Artikal a3 = new Povrce("Paradajz", "kg", 70 );

        Artikal a4 = new Voce("Jabuke", "Sveze", "kg", 80);
        Artikal a5 = new Voce("Sljive", "Susene", "kg", 90);
        Artikal a6 = new Voce("Visnje", "Smrznute", "kg", 100);

        Artikal a7 = new Kozmetika("Sampon", 150);
        Artikal a8 = new Kozmetika("Sapun", 160);
        Artikal a9 = new Kozmetika("Kaladont", 170);

        Racun r1 = new Racun();
        Racun r2 = new Racun();
        Racun r3 = new Racun();
        Racun r4 = new Racun();

        r1.dodajArtikal(a1, 5);
        r1.dodajArtikal(a4, 2);
        r1.dodajArtikal(a7, 1);

        r2.dodajArtikal(a2, 5);
        r2.dodajArtikal(a5, 3);
        r2.dodajArtikal(a8, 2);

        r3.dodajArtikal(a3, 3);
        r3.dodajArtikal(a6, 6);
        r3.dodajArtikal(a9, 1);

        r4.dodajArtikal(a1, 3);
        r4.dodajArtikal(a2, 6);
        r4.dodajArtikal(a5, 2);
        r4.dodajArtikal(a7, 2);

        Prodavnica p1 = new Prodavnica("Market", "Ulica i broj");

        p1.dodajRacun(r1);
        p1.dodajRacun(r2);
        p1.dodajRacun(r3);
        p1.dodajRacun(r4);

        System.out.println("Vracanje racuna za pogresan datum: ");
        System.out.println(p1.vratiRacun(9,6,2019));
        System.out.println("===================");

        System.out.println("Vracanje prvog racuna za danasnji datum: ");
        LocalDate date = LocalDate.now();
        System.out.println(p1.vratiRacun(date.getDayOfMonth(), date.getMonthValue(), date.getYear()));
        System.out.println("===================");

        System.out.println("Stampanje prodavnice:");
        System.out.println(p1);


    }
}
