public class Prostokat {

    public Prostokat()
    {}

    public void rysuj(int a, int b)
    {
        if (a<3)
            System.out.println("Złe wymiary");
        else if (b<3)
            System.out.println("Złe wymiary");
        else
        {
            for (int i=1; i<=b; i++)
            {

                for (int j=1; j<=a; j++)
                {
                    if (i==1)
                    {
                        System.out.print("#");
                    }
                    else
                    if (i==b)
                    {
                        System.out.print("#");
                    }
                    else
                    {
                        if (j==1)
                            System.out.print("#");
                        else if (j==a)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    }


                }
                System.out.println();

            }

        }

    }

}
