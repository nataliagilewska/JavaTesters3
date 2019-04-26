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
}
