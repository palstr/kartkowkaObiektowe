import java.util.ArrayList;

public class Zamowienie {
    protected ArrayList<Produkt> produkty = new ArrayList<>();

    public void dodajProdukt(Produkt produkt){
        //OGÓLNA LISTA PRODUKTÓW
        produkty.add(produkt);
    }

    public void podajKoszt(Produkt produkt){
        //KOSZT JEDNEGO PRODUKTU
        System.out.println(produkt.getCena());
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "produkty=" + produkty +
                '}';
    }
}
