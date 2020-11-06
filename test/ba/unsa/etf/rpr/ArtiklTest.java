package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getCijena() {
        Artikl a = new Artikl("Slusalice", 300, "30");
        assertEquals(300, a.getCijena());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("Slusalice", 300, "30");
        assertEquals("30", a.getKod());
    }

    @Test
    void getNaziv() {
        Artikl a = new Artikl("Slusalice", 300, "30");
        assertEquals("Slusalice", a.getNaziv());
    }
}