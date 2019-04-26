public class Dzialania {
    int[]tab;
    int zwiekszO=7;

    public Dzialania()
    {

    }

    public Dzialania(int[] tab)
    {
        this.tab=tab;
    }

    public Dzialania(int[] tab, int zwiekszO)
    {
        this.tab=tab;
        this.zwiekszO=zwiekszO;
    }

    public int suma()
    {
        int wynik=0;
        int pom=tab.length;
        int i;

        for (i=0;i<pom;i++)
        {
            wynik=wynik+tab[i];
        }
        return wynik;
    }

    //public int[] dodaj(int[] tablica, int zwiekszOliczbe)
    public int[] dodaj()
    {
        int wynik=0;
        int pom=tab.length;
        int i;

        for (i=0;i<pom;i++)
        {
            tab[i]+=zwiekszO;
        }
        return tab;
    }

    public int Silnia (int n)
    {
        int wynik=1;
        for (int a1=1; a1<=n; a1++)
        {
            wynik*=a1;
        }
        return wynik;
    }

}
