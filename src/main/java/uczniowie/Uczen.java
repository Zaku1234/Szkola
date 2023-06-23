package uczniowie;

import szkola.Szkola;

public class Uczen {
    private String imie;
    private String nazwisko;
    private int numerKlasy;
    private Szkola szkola;

    public Uczen(String imie, String nazwisko, int numerKlasy, Szkola szkola) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKlasy = numerKlasy;
        this.szkola = szkola;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumerKlasy() {
        return numerKlasy;
    }

    public Szkola getSzkola() {
        return szkola;
    }
}