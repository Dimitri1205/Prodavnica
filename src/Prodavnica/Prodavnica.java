package Prodavnica;

import java.util.ArrayList;
import java.util.Collections;

public class Prodavnica {

    private String naziv, adresa;
    private ArrayList<Racun> listaRacuna;

    public Prodavnica(String naziv, String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.listaRacuna = new ArrayList<Racun>();
    }

    public void dodajRacun (Racun racun) {
        listaRacuna.add(racun);
    }

    public Racun najskupljiRacun () {
        if (listaRacuna.isEmpty()) {
            System.out.println("Ne postoji ni jedan racun u prodavnici");
            return null;
        } else {
            return Collections.max(listaRacuna);
        }
    }

    public Racun najjeftinijiRacun () {
        if (listaRacuna.isEmpty()) {
            System.out.println("Ne postoji ni jedan racun u prodavnici");
            return null;
        } else {
            return Collections.min(listaRacuna);
        }
    }

    public Racun vratiRacun (int dan, int mesec, int godina) {
        int control = 0;
        Racun racun = new Racun();
        racun.umanjiID();
        if (listaRacuna.isEmpty()) {
            System.out.println("Ne postoji ni jedan racun u prodavnici");
            return null;
        } else {
            for (Racun r : listaRacuna) {
                if (r.getDan() == dan && r.getMesec() == mesec && r.getGodina() == godina && racun.getId() > r.getId()) {
                    racun = r;
                    control++;
                }
            }
        } if (control != 0) {
            return racun;
        } else {
            System.out.println("Ne postoji racun za izabrani datum");
            return null;
        }
        }

        public double prosecnaCena () {
        double suma = 0;
        if (listaRacuna.isEmpty()) {
            System.out.println("Ne postoji ni jedan racun u prodavnici");
            return suma;
        } else {
            for (Racun r: listaRacuna) {
                suma += r.izracunajUkupnuCenu();
            }
            return (suma / listaRacuna.size());
        }
        }

    @Override
    public String toString() {
        String tekst = "Prodavnica: " + naziv + ", " + adresa;
        tekst += "\n------------------------------------------";
        tekst += "\nNajskuplji racun: " + najskupljiRacun().izracunajUkupnuCenu() + " dinara";
        tekst += "\nNajjeftiniji racun: " + najjeftinijiRacun().izracunajUkupnuCenu() + " dinara";
        tekst += "\nProsecna cena svih racuna: " + prosecnaCena();
        for (Racun r: listaRacuna) {
            tekst += "\n------------------------------------------";
            tekst += "\n" + r;
        }
        return tekst;
    }
}
