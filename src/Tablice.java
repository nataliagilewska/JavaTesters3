public class Tablice {
    public Tablice()
    {}

    public int[] przesun(int[] tablica, int oile)
    {
        double index=0;
        int index2=0;
        int [] pomocnicza = tablica; //{1,2,3,4,5,6,7,8,9,10};  //oile=2
        //int [] wynik={0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<10; i++)//i=0
        {
            index=i-oile;  //-2
            if (index<0)
            {
                index =10+index;
                index2=(int)index;
            }
            tablica[i]=pomocnicza[index2]; //tablica[0]=pomocnicza[2]
        }
        return tablica;
    }
}
