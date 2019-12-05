package artikli;

public class Povrce extends Artikal {

    private String jedinicaMere;
    private double cenaPoJediniciMere;

    public Povrce(String naziv ,String jedinicaMere, double cenaPoJediniciMere) {
        super.naziv = naziv;
        this.jedinicaMere = jedinicaMere;
        this.cenaPoJediniciMere = cenaPoJediniciMere;
    }

    public String getJedinicaMere() {
        return jedinicaMere;
    }

    @Override
    public String toString() {
        return super.naziv + " [" + cenaPoJediniciMere + "/" + jedinicaMere + "]";
    }

    @Override
    public double izracunajCenu(double kolicina) {
        return cenaPoJediniciMere * kolicina;
    }
}
