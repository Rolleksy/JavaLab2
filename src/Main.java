import java.util.Random;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        /*int x = 1000;
        int ind = 51;
        int indeks = 62851;
        do
            {
                if(x%ind==0)
                {
                    System.out.println("liczba "+x+" podzielna przez "+ind+". Moj nr indeksu:"  + indeks);
                }
                else
                {
                    System.out.println(x);
                }
                x--;

            }
        while(x>0);*/


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        /*
        int[] losowe_inty = new int[5];
        int licz = 0;
        int upplimit = 25;
        while (licz<6)
        {
            Random rand = new Random();
            losowe_inty[licz] = rand.nextInt(upplimit);
            System.out.println(losowe_inty[licz]);
            licz++;

        }*/

        double[] losowe_double = new double[5];
        int licz2 = 0;
        double uppLim = 25;
        while (licz2<6)
        {
            Random rnd = new Random();
            losowe_double[licz2] = Math.random();
            System.out.println(losowe_double[licz2]);
            licz2++;
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


    }
}
