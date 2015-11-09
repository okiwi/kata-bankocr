package bank;

import bank.Caractere;

/**
 * Created by eptwalabha on 09/11/15.
 */
public class CaractereOCR {
    public int lire(String haut, String milieu, String bas) {
        for (Caractere caractere : Caractere.values()) {
            if (caractere.equals(haut, milieu, bas))
                return caractere.getValeur();
        }
        return -1;
    }
}
