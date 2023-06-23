package szkola;

public class Nauczyciel {
    private String imie;
    private String nazwisko;

    public Nauczyciel(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}