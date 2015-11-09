package bank;

/**
 * Created by eptwalabha on 09/11/15.
 */
public class LigneOCR {
    private CaractereOCR caractereOcr;

    public LigneOCR(){
        this.caractereOcr = new CaractereOCR();
    }

    public String lire(String ligneHaut, String ligneMilieu, String ligneBas) {
        String lu = "";
        for (int espace = 0;espace<27;espace+=3){
            String haut = ligneHaut.substring(espace,espace+3);
            String milieu = ligneMilieu.substring(espace,espace+3);
            String bas = ligneBas.substring(espace,espace+3);
            lu = lu + caractereOcr.lire(haut,milieu,bas);
        }
        return lu;
    }
}
