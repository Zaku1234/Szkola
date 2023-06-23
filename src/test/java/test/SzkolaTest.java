package test;

import szkola.Szkola;
import uczniowie.Uczen;
import szkola.Nauczyciel;

public class SzkolaTest {
    public static void main(String[] args) {
        Szkola szkola = new Szkola("Szkoła Podstawowa nr 1");
        Nauczyciel nauczyciel = new Nauczyciel("Jan", "Kowalski");
        Uczen uczen = new Uczen("Adam", "Nowak", 1, szkola);

        System.out.println("Nazwa szkoły: " + szkola.getNazwa());
        System.out.println("Imię nauczyciela: " + nauczyciel.getImie());
        System.out.println("Nazwisko nauczyciela: " + nauczyciel.getNazwisko());
        System.out.println("Imię ucznia: " + uczen.getImie());
        System.out.println("Nazwisko ucznia: " + uczen.getNazwisko());
        System.out.println("Numer klasy ucznia: " + uczen.getNumerKlasy());
        System.out.println("Szkoła ucznia: " + uczen.getSzkola().getNazwa());
    }
}