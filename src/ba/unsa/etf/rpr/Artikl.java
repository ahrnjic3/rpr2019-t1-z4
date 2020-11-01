package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private int kod;

    public Artikl(String naziv, int cijena, int kod){
        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }

    public int getCijena() {
        return cijena;
    }

    public int getKod() {
        return kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
