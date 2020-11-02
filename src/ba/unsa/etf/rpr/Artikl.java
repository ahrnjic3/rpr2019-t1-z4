package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public Artikl(String naziv, int cijena, String kod){
        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }
    public Artikl(Artikl a)
    {
        this.naziv = new String(a.getNaziv());
        this.cijena = a.getCijena();
        this.kod = new String(a.getKod());
    }
    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
