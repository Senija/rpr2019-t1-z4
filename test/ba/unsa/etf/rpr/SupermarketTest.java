package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Slusalice", 300, "3"));
        supermarket.dodajArtikl(new Artikl("Laptop", 1300, "13"));
        supermarket.dodajArtikl(new Artikl("Telefon", 900, "9"));
        assertEquals(3, supermarket.getDinamicSize());
        //kako ovo za array
    }


    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Slusalice", 300, "3"));
        supermarket.dodajArtikl(new Artikl("Laptop", 1300, "13"));
        supermarket.dodajArtikl(new Artikl("Telefon", 900, "9"));
        Artikl izbaceni1 =  supermarket.izbaciArtiklSaKodom("3");
        Artikl izbaceni2 = supermarket.izbaciArtiklSaKodom("13");
        assertEquals(3, izbaceni1.getKod());
        assertEquals(3, izbaceni2.getKod());

    }
}