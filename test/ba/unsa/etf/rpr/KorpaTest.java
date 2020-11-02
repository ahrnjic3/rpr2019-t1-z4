package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @org.junit.jupiter.api.Test
    void testPodudaranjaKodovaIzbacenogIOriginialnogArtikla() { // testira da li se kod Artikla koji se dobije izbacivanjem podudara sa kodom izbacenog artikla
        Korpa k= new Korpa();
        k.dodajArtikl(new Artikl("Tastatura",100,"0"));
        Artikl a = k.izbaciArtiklSaKodom("0");
        assertEquals("0",a.getKod());
    }
    @org.junit.jupiter.api.Test
    void testPodudaranjaCijenaIzbacenogIOriginialnogArtikla() {// testira da li se cijena Artikla koji se dobije izbacivanjem podudara sa cijenom izbacenog artikla
        Korpa k= new Korpa();
        k.dodajArtikl(new Artikl("Tastatura",100,"0"));
        Artikl a = k.izbaciArtiklSaKodom("0");
        assertEquals(100,a.getCijena());
    }
    @org.junit.jupiter.api.Test
    void testPodudaranjaNazivaIzbacenogIOriginialnogArtikla() {// testira da li se naziv Artikla koji se dobije izbacivanjem podudara sa nazivom izbacenog artikla
        Korpa k= new Korpa();
        k.dodajArtikl(new Artikl("Tastatura",100,"0"));
        Artikl a = k.izbaciArtiklSaKodom("0");
        assertEquals("Tastatura",a.getNaziv());
    }
    @org.junit.jupiter.api.Test
    void testVracanjaNullKadaSeProslijediNevalidanKod() {// Testira da li metoda izbaciArtiklSaKodom vraca null ako joj se proslijedi nevalidan kod
        Korpa k= new Korpa();
        k.dodajArtikl(new Artikl("Tastatura",100,"0"));
        Artikl a = k.izbaciArtiklSaKodom("1");
        assertEquals(null,a);
    }
    @org.junit.jupiter.api.Test
    void testSmanjivanjaBrojaElemenataUnutarKorpe() {// Testira da li metoda smanjuje broj elemenata u korpi
        Korpa k= new Korpa();
        k.dodajArtikl(new Artikl("Tastatura",100,"0"));
        Artikl a = k.izbaciArtiklSaKodom("0");
        assertEquals(0,k.getBr());
    }


    @org.junit.jupiter.api.Test
    void testNazivaDodanogArtikla() { // Testira da li je naziv dodanog artikla pravilan
        Korpa k= new Korpa();
        k.dodajArtikl(new Artikl("Tastatura",100,"0"));
        assertEquals("Tastatura",k.getArtikli()[0].getNaziv());
    }
    @org.junit.jupiter.api.Test
    void testCijeneDodanogArtikla() { // Testira da li je cijena dodanog artikla pravilna
        Korpa k= new Korpa();
        k.dodajArtikl(new Artikl("Tastatura",100,"0"));
        Artikl a=k.getArtikli()[0];
        assertEquals(100,a.getCijena());
    }
    @org.junit.jupiter.api.Test
    void testKodaDodanogArtikla() { // Testira da li je kod dodanog artikla pravilna
        Korpa k= new Korpa();
        k.dodajArtikl(new Artikl("Tastatura",100,"0"));
        assertEquals("0",k.getArtikli()[0].getKod());
    }
    @org.junit.jupiter.api.Test
    void testVracanjaTrueMetodeDodajArtikl() { // Testira da li metoda dodajArtikl vraca true, ako je ispravno izvrsena
        Korpa k= new Korpa();
        boolean a=k.dodajArtikl(new Artikl("Tastatura",100,"0"));
        assertTrue(a);
    }
    @Test
    void testVracanjaFalseMetodeDodajArtikl() { // Testira da li metoda dodajArtikl vraca false, ako je prekoracen max broj artikala u korpi
        Korpa k= new Korpa();
        boolean a=false;
        for (int i = 0; i < 51; i++) {
             a=k.dodajArtikl(new Artikl("Tastatura",100,""+i));
            if (!a) break;
        }
        assertFalse(a);
    }

    @org.junit.jupiter.api.Test
    void testVracanjaTacneUkupneCijene() {
        Korpa k= new Korpa();
        k.dodajArtikl(new Artikl("Tastatura",100,"0"));
        k.dodajArtikl(new Artikl("Mis",100,"1"));
        assertEquals(200,k.dajUkupnuCijenuArtikala());
    }
}