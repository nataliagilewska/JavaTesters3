package com.company;

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
        int pom1=1;
        int pom2=100;

        //for ()

    }

}
