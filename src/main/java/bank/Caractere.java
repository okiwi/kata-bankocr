package bank;

/**
 * Created by eptwalabha on 09/11/15.
 */
public enum Caractere {

    ZERO(0, " _ ", "| |", "|_|"),
    UN(1, "   ", "  |", "  |"),
    DEUX(2, " _ ", " _|", "|_ "),
    TROIS(3, " _ ", " _|", " _|"),
    QUATRE(4, "   ", "|_|", "  |");


    private final int valeur;
    private final String haut;
    private final String milieu;
    private final String bas;

    private Caractere(int valeur, String haut, String milieu, String bas) {
        this.haut = haut;
        this.milieu = milieu;
        this.bas = bas;
        this.valeur = valeur;
    }

    public int getValeur()
    {
        return valeur;
    }

    public boolean equals(String haut, String milieu, String bas)
    {
        return haut.equals(this.haut) && milieu.equals(this.milieu) && bas.equals(this.bas);
    }
}
