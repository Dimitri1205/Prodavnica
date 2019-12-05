package Prodavnica;

import artikli.Artikal;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;

public class Racun implements Comparable<Racun> {

    private static int ID = 0;
    private int id;
    private int dan, mesec, godina;
    private HashMap<Artikal, Integer> listaArtikala;

    public Racun() {
        this.listaArtikala = new HashMap<>();
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.dan = localDate.getDayOfMonth();
        this.mesec = localDate.getMonthValue();
        this.godina = localDate.getYear();
        this.id = ID++;
    }

    public void dodajArtikal (Artikal artikal, int kolicina) {
        listaArtikala.put(artikal, kolicina);
    }

    public int getId() {
        return id;
    }

    public int getDan() {
        return dan;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public double izracunajUkupnuCenu () {
        double suma = 0;
        if (listaArtikala.isEmpty()) {
            System.out.println("Nema artikala");
        } else {
            for (Artikal a : listaArtikala.keySet()) {
                suma += a.izracunajCenu(listaArtikala.get(a));
            }
        }
        return suma;
    }

    @Override
    public String toString() {
        String tekst = "Racun br: " + id + " (" + dan + ", " + mesec + ", " + godina + ") ";
        for (Artikal a: listaArtikala.keySet()) {
            tekst += "\n" + a + "\t\t" + listaArtikala.get(a) + "\t" + a.izracunajCenu(listaArtikala.get(a));
        }
        tekst += "\n Ukupna cena: " + izracunajUkupnuCenu();
        return tekst;
    }

    @Override
    public int compareTo(Racun o) {
        if (this.izracunajUkupnuCenu() > o.izracunajUkupnuCenu()) {
            return 1;
        } else if (this.izracunajUkupnuCenu() < o.izracunajUkupnuCenu()) {
            return -1;
        } else {
            return 0;
        }
    }

    public void umanjiID () {
        ID--;
    }
}
