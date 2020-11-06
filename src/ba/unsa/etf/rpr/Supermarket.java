package ba.unsa.etf.rpr;

public class Supermarket {
    //private Artikl artikl;
    private Artikl[] artikli = new Artikl[1000];
    private int dinamicSize;

    public void dodajArtikl(Artikl novi){
       // artikl = novi; //da li moze ovako
        if(dinamicSize < 50){
            artikli[dinamicSize] = novi;
            dinamicSize = dinamicSize + 1;
        }
        //else throw new Exception("Prekoracili ste broj dozvoljenih mjesta!");
    }

    public int getDinamicSize() {
        return dinamicSize;
    }

    public Artikl[] getArtikli() {
        return  artikli;
    }

    public Artikl  izbaciArtiklSaKodom(String kod){
        //artikli
        //treba izbacit element na nekom indeksu
        for(int i = 0; i < dinamicSize; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl temp = artikli[i];
                dinamicSize = dinamicSize - 1;
                artikli[i] = null;
                return  temp;
            }
        }
        return  null;
    }
}
