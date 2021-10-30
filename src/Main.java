import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        /*podpunkt_a();
        String slowo = podajslowo();
        String[] lista_slow = new String[6];
        for (int i = 0; i<lista_slow.length; i++)
        {
            lista_slow[i] = podajslowo();
        }
        /*for (int i = 0; i<lista_slow.length; i++)
        {
            System.out.println(lista_slow[i]);
        }*/
        ///pokazliste(lista_slow);
       // odwrocliste(lista_slow);
        String imie = "Aleksander";
        String nazwisko = "Purcha";
        wypluj_imie(imie);
        wypluj_imie(imie, nazwisko);



        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */


        }
    static void podpunkt_a(){
        int[] tablica = new int[20];
        Random rnd = new Random();
        for (int i =0; i<tablica.length; i++){
            int x = rnd.nextInt(20)+20;
            tablica[i] = x;
            System.out.println(tablica[i]);
        }


    }


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        static String podajslowo(){
            System.out.println("Podaj slowo:");
            Scanner scan = new Scanner(System.in);
            String slowo = scan.nextLine();
            return slowo;
        }
        static void pokazliste(String[] x){
            for (int i = 0; i<x.length; i++)
            {
                System.out.println(x[i]);
            }

        }
        static void odwrocliste(String[] x){
            for (int i = x.length-1; i>=0; i--){
                System.out.println(x[i]);
            }
        }

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        static void wypluj_imie(String x){
            System.out.println(x);
        }
        static void wypluj_imie(String imie, String nazwisko){
            String imienaz = imie + " " + nazwisko;
            System.out.println(imienaz);
        }

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */


    }

