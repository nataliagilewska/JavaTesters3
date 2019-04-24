package com.company;

public class Dzialania {
    int[]tab;

    public Dzialania(int[] tab)
    {
        this.tab=tab;
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


}
