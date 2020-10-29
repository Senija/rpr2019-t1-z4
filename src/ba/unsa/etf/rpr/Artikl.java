package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public Artikl(String ime, int cijena, String kod){
        //if(cijena <= 0) throw new IllegalArgumentException();
        naziv = ime;
        this.cijena = cijena;
        this.kod = kod;
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

//    public void dodajArtikl(Artikl a){
//        this.naziv = a.getNaziv();
//        kod = a.getKod();
//        cijena = a.getCijena();
//    }
}
