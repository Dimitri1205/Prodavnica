package artikli;

public class Voce extends Artikal {

    private String jedinicaMere, tip;
    private double cenaPoJediniciMere;

    public Voce(String naziv ,String tip,String jedinicaMere,  double cenaPoJediniciMere) {
        super.naziv = naziv;
        this.jedinicaMere = jedinicaMere;
        this.tip = tip;
        this.cenaPoJediniciMere = cenaPoJediniciMere;
    }

    public String getJedinicaMere() {
        return jedinicaMere;
    }

    @Override
    public String toString() {
        return super.naziv + " - " + tip + " [" + cenaPoJediniciMere + "/" + jedinicaMere + "]";
     }

    @Override
    public double izracunajCenu(double kolicina) {
        return cenaPoJediniciMere * kolicina;
    }
}
