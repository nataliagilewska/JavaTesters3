//package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here


        //Zadanie ze szkolenia:
        Wylicz w=new Wylicz(14,21);
        w.dzielnik();

        //2 zadanie ze szkolenia
        int[] tab = {1,2,4,5,8};
        //tab.for <- jak to wpisze to mam szybka podpowiedz fora
        //String imie="Michal";
        //if(imie.equals("Michal")) - dla porownywania stringow ZAWSZE UZYWAC EQUALS!!! (bo zwykle porownanie string1==string2 porowna miejsca pamieci)
        Dzialania obiekt = new Dzialania(tab);
        System.out.println("Suma elementow tablicy: " + obiekt.suma());
        //3 zad ze szkolenia
        int []tab2 =obiekt.dodaj();
        for (int j=0;j<tab2.length;j++)
        {
            System.out.print(tab2[j]+" ");

        }
        //PRACA DOMOWA:
        //ZAd1.
        System.out.println();
        System.out.println("\nPraca domowa ZAD 1 - liczby podzielne przez 3 i 5: ");
        int pom1=1;
        int pom2=100;
        Podzielnosc p = new Podzielnosc();
        for (int k=1;k<=100; k++)
        {
            if (p.czyPodzielne(k))
            {
                System.out.print(k+" ");
            }
        }


        //ZAD 2.
        System.out.println("\nZAD 2:");
        //2. Napisz funkcję która przyjmuje dwie zmienne typu int, a następnie wylicza ich największy wspólny dzielnik
        //raz wypisuje go na konsole.(prezentacja)
        Podzielnosc p2 = new Podzielnosc();
        int b1=24;
        int b2=30;
        Boolean bolek;
        //int pomoc=b1;
        //int pomoc2=b2;
        if (b1>b2)
        {
            for(int m=b2; m>=1; m--)
            {
                bolek= p2.najwiekszyWspolnyDzielnik(b1,b2,m);
                if (bolek==true)
                {
                    System.out.println("Największy wspólny dzielnik liczb "+b1+" i "+b2+" to: "+m);
                    m=0;
                }
            }
        }
        else
        {
            for(int m=b1; m>=1; m--)
            {
                bolek= p2.najwiekszyWspolnyDzielnik(b1,b2,m);
                if (bolek==true)
                {
                    System.out.println("Największy wspólny dzielnik liczb "+b1+" i "+b2+" to: "+m);
                    m=0;
                }
            }
        }


        //ZAD 3.
        //3. Napisz funkcję która przyjmuje zmienną n typu int, a następnie oblicza dla niej silnię (n!) oraz wypisuje ją na
        //konsole
        System.out.println("\nZAD 3:");
        int n=5;
        Dzialania dzialania = new Dzialania();
        System.out.println(n+" silnia = "+dzialania.Silnia(n));

        //ZAD 4.
        //4. Napisz funkcję która przyjmuje dwa argumenty: tablicę integerów oraz ilość pól o którą należy ją przesunąć w
        //prawo (również int). Ostatnie elementy tablicy wracają na początek np. mamy tablicę 10-cio elementową i
        //przesuwamy ją o 2, więc element z indeksu 9 znajdzie się pod indeksem 1, indeks 8 pod 0 itd.
        System.out.println("\nZAD 4: Przesunięta tablica ");

        int []tab4 = new int[]{1,2,3,4,5,6,7,8,9,10}; // NIE DZIALA - POPRAWIC FUNKCJE
        int oile=2;
        Tablice t = new Tablice();
        int []pomocnik;
        pomocnik = t.przesun(tab4, oile);
        for (int q=0; q<10; q++)
        {
            System.out.print(pomocnik[q]+" "); // NIE DZIALA - POPRAWIC FUNKCJE
        }

        //ZAD 5.
        System.out.println();
        System.out.println("ZAD 5: ciąg Fibonacciego");
        int nn=7;
        Fibonacci f = new Fibonacci();

        //int n1;
        //int []fib=new int[nn];
        int pomocniczek=f.obliczFibonacciego(nn);

        System.out.println(nn+" element ciągu Fibonacciego jest równy "+pomocniczek);

        //ZAD 6.
        System.out.println();
        System.out.println("ZAD 6: Czy suma elementów tablicy równa 0");
        int [] sumaZero = {-1,1,2,3,4,5};
        int [] sumaNieZero = {1,2,3,4,5};
        Tablice tablice = new Tablice();
        System.out.println("Pierwsza tablica: "+tablice.czySumaRownaZero(sumaZero));
        System.out.println("Druga tablica: "+tablice.czySumaRownaZero(sumaNieZero));

        //ZAD 7.
        System.out.println();
        System.out.println("ZAD 7: Rysowanie prostokątów");
        int a7 = 10;
        int b7 = 3;
        Prostokat prostokat = new Prostokat ();
        prostokat.rysuj(a7,b7);


    }






}

