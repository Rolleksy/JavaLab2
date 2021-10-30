import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Podaj Liczbe:");
        int liczba = scan.nextInt();
        switch (liczba%2)
        {
            case 0:
                System.out.println("Liczba jest parzysta");
                break;
            case 1:
                System.out.println("Liczba jest nieparzysta");
                break;
            default:
                System.out.println("To tyle");
        }*/

        /*System.out.println("Podaj Liczbe:");
        int liczba2 = scan.nextInt();
        switch (liczba2%7)
        {
            case 0:
                System.out.println("Liczba jest podzielna przez 7");
                break;
            default:
                System.out.println("Liczba nie jest podzielna przez 7");
        }*/



        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        int lit_o = 0;
        int lit_p = 0;
        int lit_x = 0;
        int lit_z = 0;
        int lit_q = 0;
        String slowo = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        for(int i =0; i<slowo.length(); i++){
            char litera = slowo.charAt(i);
            switch(litera){
                case 'o':
                    lit_o++;
                    break;
                case 'p':
                    lit_p++;
                    break;
                case 'x':
                    lit_x++;
                    break;
                case 'z':
                    lit_z++;
                    break;
                case 'q':
                    lit_q++;
                    break;
            }
        }
        System.out.println("Liter O jest: " + lit_o);
        System.out.println("Liter P jest: " + lit_p);
        System.out.println("Liter X jest: " + lit_x);
        System.out.println("Liter Z jest: " + lit_z);
        System.out.println("Liter Q jest: " + lit_q);



    }
}
