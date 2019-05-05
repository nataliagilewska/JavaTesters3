public class Tablice {
    public Tablice()
    {}

    public int[] przesun(int[] tablica, int oile)
    {
        int index=0;
        //int index1=0;
        //int index2=0;
        int [] pomocnicza = tablica; //{1,2,3,4,5,6,7,8,9,10};  //oile=2
        int [] tablica2=new int[10];//tablica;// wynik
        //int [] wynik={0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<10; i++)//i=0
        {
            index=i+oile;  //-2
            if (index>9)
            {
                index=index-10;
                            }
            else {index=index; }
            tablica2[index]=pomocnicza[i]; //tablica[0]=pomocnicza[2]

        }
        return tablica2;
    }

    public boolean czySumaRownaZero()
    {
        boolean b=false;

        return b;
    }
}
