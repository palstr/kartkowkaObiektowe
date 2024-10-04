import java.util.ArrayList;

public class Klient {
    protected String imie;
    protected String nazwisko;

    public ArrayList<Produkt> zamowienia = new ArrayList<>();

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Produkt> getZamowienia() {
        return zamowienia;
    }

    public void zrobZamowienie(Produkt produkt){
        if(!produkt.getDostepny()){
            System.out.println("Wybacz, nie mamy tego produktu (" + produkt.getNazwa() + ")!");
        }
        else {
            produkt.setDostepny(false);
            zamowienia.add(produkt);
        }
    }



    public void ileZaplaciWSumie(Klient klient){
        double cena = 0;

        /* WSZYSTKIE ZAMÓWIONE PRZEZ KLIENTA PRODUKTY SĄ WCZEŚNIEJ GROMADZONE W JEDNEJ LIŚCIE
        NIEZALEŻNIE OD MOMENTU, W KTÓRYM KLIENT ZAMAWIA */

        /* W WYPADKU REALIZACJI ZAMÓWIENIA MOŻNA USUNĄĆ PRODUKT Z LISTY... */

        for (Produkt spr:
             klient.zamowienia) {
            cena = cena + spr.getCena();
        }

        System.out.println(cena);
    }
    public void usunZamowienie(Produkt produkt){
        // ...O TUTAJ
        zamowienia.remove(produkt);
        produkt.setDostepny(true);
    }
    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", zamowienia=" + zamowienia +
                '}';
    }
}
