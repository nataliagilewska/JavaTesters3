package com.company;

public class Wylicz {
    int a;
    int b;

    public Wylicz(int a,int b)
    {
        this.a=a;
        this.b=b;
    }


    public int dzielnik()
    {
        int wynik = 1;
        Boolean bool=false;
        for (int i=a;i>0;i--)
        {
            if (a%i==0)
            {
                if (b%i==0)
                {
                    bool=true;
                    wynik=i;
                    System.out.println("Najwiekszy wspolny dzielnik: "+wynik);
                    i=0;
                }
            }
        }
        if (bool==false)
            System.out.println("Najwiekszy wspolny dzielnik to 1");
        return wynik;

    }

}
