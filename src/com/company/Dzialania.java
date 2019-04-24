package com.company;

public class Dzialania {
    int[]tab;
    int zwiekszO=7;
    String imie;

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
            System.out.println(imie);
            tab[i]+=zwiekszO;
        }
        return tab;
    }

}
