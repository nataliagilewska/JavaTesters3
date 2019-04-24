public class Podzielnosc {
    int b1;


    public Podzielnosc(int b1)
    {
        this.b1=b1;

    }

    public boolean czyPodzielne()
    {
        Boolean bool =false;
        if (b1%3==0)
                bool=true;
        if (b1%5==0)
            bool=true;
        return bool;
    }
}
