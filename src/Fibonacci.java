public class Fibonacci {

    public Fibonacci()
    {

    }


    public int obliczFibonacciego(int n)
    {
        int wynik=0;
        if (n==0)
        {
            wynik=0;
        }
        else if (n==1)
        {
            wynik=1;
        }
        else
        {
            wynik=obliczFibonacciego(n-1)+  obliczFibonacciego(n-2);
        }

        return wynik;

    }
}
