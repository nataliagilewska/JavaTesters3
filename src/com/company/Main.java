package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //Zadanie ze szkolenia:
        Wylicz w=new Wylicz(14,21);
        w.dzielnik();

        //2 zadanie ze szkolenia
        int[] tab = {1,2,4,5,8};
        Dzialania obiekt = new Dzialania(tab);
        System.out.println("Suma elementow tablicy: " + obiekt.suma());
    }

}
