public class Podzielnosc {
  public Podzielnosc()
  {}

    public boolean czyPodzielne(int b1)
    {
        Boolean bool =false;
        if (b1%3==0)
                bool=true;
        if (b1%5==0)
            bool=true;
        return bool;
    }

    public boolean najwiekszyWspolnyDzielnik(int b2, int b3, int b4)
    {
        Boolean bool =false;
        if (b2%b4==0)
        {
            if (b3%b4==0)
            {
                bool=true;

            }
        }
    return bool;
    }

}
