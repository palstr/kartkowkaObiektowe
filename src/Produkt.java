public class Produkt {
    protected String nazwa;
    protected double cena;
    protected Boolean dostepny;

    public Produkt(String nazwa, double cena, Boolean dostepny) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dostepny = dostepny;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public Boolean getDostepny() {
        return dostepny;
    }

    public void setDostepny(Boolean dostepny) {
        this.dostepny = dostepny;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", dostepny=" + dostepny +
                '}';
    }
}
