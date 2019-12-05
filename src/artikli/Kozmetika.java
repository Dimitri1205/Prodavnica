package artikli;

public class Kozmetika extends Artikal {

    private double cenaPoKomadu;

    public Kozmetika(String naziv ,double cenaPoKomadu) {
        this.cenaPoKomadu = cenaPoKomadu;
        super.naziv = naziv;
    }

    @Override
    public String toString() {
        return super.naziv + " [" + cenaPoKomadu + "]";
    }

    @Override
    public double izracunajCenu(double kolicina) {
        return cenaPoKomadu * kolicina;
    }
}
