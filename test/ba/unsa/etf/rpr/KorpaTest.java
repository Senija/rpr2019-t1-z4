package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Slusalice", 300, "3"));
        k.dodajArtikl(new Artikl("Laptop", 1300, "13"));
        assertEquals(2, k.getDinamicSize());
        //assertArrayEquals();
    }


    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        Artikl izbaceni1 = k.izbaciArtiklSaKodom("4");
        Artikl izbaceni2 =  k.izbaciArtiklSaKodom("5");
//        assertEquals("Biciklo", izbaceni1.getNaziv());
//        assertEquals(1000, izbaceni1.getCijena());
        assertEquals("4", izbaceni1.getKod());
        assertEquals("5", izbaceni1.getKod());

    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        assertEquals(5000, k.dajUkupnuCijenuArtikala());
    }
}