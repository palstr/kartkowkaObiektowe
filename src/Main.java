public class Main {
    public static void main(String[] args) {

        System.out.println("WITAJ W SKLEPIE!");
        System.out.println("----------------");

        Produkt produkt = new Produkt("Mleko", 16.99, true);
        Produkt produkt2 = new Produkt("Ciastka", 7.99, true);
        Produkt produkt3 = new Produkt("Płatki", 4.99, true);
        Produkt produkt4 = new Produkt("Sałata", 9.99, true);

        Zamowienie zamowienie = new Zamowienie();

        zamowienie.dodajProdukt(produkt);
        zamowienie.dodajProdukt(produkt2);
        zamowienie.dodajProdukt(produkt3);
        zamowienie.dodajProdukt(produkt4);

        System.out.println("Produkty w naszym sklepie: " + zamowienie);

        System.out.println("----------------");

        System.out.println("CENA SAŁATY:");
        zamowienie.podajKoszt(produkt4);

        System.out.println("----------------");

        Klient klient = new Klient("Barbara", "Wiechowicka");
        Klient klient2 = new Klient("Baltazar", "Modrzewicki");
        Klient klient3 = new Klient("Karina", "Burzik");

        System.out.println("Klient 1 przed zamówieniem: " + klient);

        klient.zrobZamowienie(produkt2);

        System.out.println("Klient 1 po zamówieniu: " + klient);

        System.out.println("----------------");
        System.out.println("To samo z klientem 2");
        System.out.println(klient2);
        System.out.println("Po zamówieniu jednego produktu:");
        klient2.zrobZamowienie(produkt);
        System.out.println(klient2);
        System.out.println("Po zamówieniu drugiego produktu:");
        klient2.zrobZamowienie(produkt3);
        System.out.println(klient2);
        System.out.println("----------------");
        System.out.println("PRÓBA ZAMÓWIENIA NIEDOSTĘPNEGO PRODUKTU:");

        klient.zrobZamowienie(produkt2);
        klient.zrobZamowienie(produkt3);

        System.out.println("----------------");
        System.out.println("Klient 3 po zamówieniu:");
        klient3.zrobZamowienie(produkt4);
        System.out.println(klient3);
        System.out.println("Klient 3 po realizacji zamówienia");
        klient3.usunZamowienie(produkt4);
        System.out.println(klient3);
        System.out.println("----------------");

        System.out.println("KLIENT 2 ZAPŁACI W SUMIE:" );
        klient.ileZaplaciWSumie(klient2);

        System.out.println("----------------");

        System.out.println("KLIENT 3 ZAPŁACI W SUMIE:" );
        klient.ileZaplaciWSumie(klient3);

        System.out.println("----------------");



    }
}