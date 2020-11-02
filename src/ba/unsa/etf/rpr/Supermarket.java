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

        Artikl[] l1= new Artikl[br];
        for (int i = 0; i < br; i++) {
            l1[i]=new Artikl(lista[i]);
        }
        return  l1;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        boolean nadjen=false;
        Artikl a=null;
        int indeks = 0;
        for (int i = 0; i <br ; i++) {
            Artikl c=lista[i];
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
