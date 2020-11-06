package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int dinamicSize;
//    Korpa(){
//
//    }
    public boolean dodajArtikl(Artikl novi){
        if(dinamicSize < 50){
            artikli[dinamicSize] = novi;
            dinamicSize = dinamicSize + 1;
            return  true;
        }
        else return  false;
    }

    public Artikl[] getArtikli(){
        return  artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < dinamicSize; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl temp = artikli[i];
                artikli[i] = null;
                dinamicSize = dinamicSize - 1;
                return  temp;
            }
        }
        return null;
    }


    public int dajUkupnuCijenuArtikala() {
        int sumaCijena = 0;
        for(int i = 0; i < dinamicSize; i++){
            sumaCijena = sumaCijena + artikli[i].getCijena();
        }
        return  sumaCijena;
    }

    public int getDinamicSize() {
        return dinamicSize;
    }
}
