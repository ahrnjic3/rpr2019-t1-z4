package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] lista;
    private  int br;

    public Supermarket(){
        this.lista= new Artikl[1000];
        br=0;
    }


    public boolean dodajArtikl(Artikl a) {
        if (br==999) return false;
        lista[br]= new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
        br++;
        return true;
    }

    public Artikl[] getArtikli() {

        return  lista;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a=null;
        System.out.println("brojac je:" + br);
        boolean nadjen=false;
        int indeks = 0;
        for (Artikl c: lista)
            {
            String b=c.getKod();
            if( b.equals(kod)){
                nadjen=true;
                break;
            }
            indeks ++;
        }
        if(nadjen){
            a=lista[indeks];
            lista[indeks]=lista[br-1];
            br--;
        }
        return  a;
    }
}
