package pl.edu.ur.oopl9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // ZADANIE 1

        int[] tab = new int[100];
        System.out.println("Zadanie 1");
        System.out.println("losowanie");
        System.out.println("===========================");
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            tab[i] = r.nextInt();
            System.out.println(tab[i]);
        }

        System.out.println();
        System.out.println("sortowanie");
        System.out.println("===========================");
        Arrays.sort(tab);
        for (int i = 0; i < 100; i++) {
            System.out.println(tab[i]);
        }
        // ZADANIE 2

        System.out.println();
        System.out.println("Zadanie 2");
        System.out.println("===========================");
        int a;
        Random losujLiczby = new Random();
        TreeSet z = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            //losowane liczby bez zakresu
            a = losujLiczby.nextInt();
            z.add(a);

        }
        Iterator t = z.iterator();
        while (t.hasNext()) {
            System.out.println(t.next() + " ");
        }
        // ZADANIE 3
        System.out.println();
        System.out.println("Zadanie 3");
        System.out.println("===========================");
        List<Auta> lista = new ArrayList<>();

        Auta fiat = new Auta("Fiat", "Punto", 160, 2000);
        Auta seat = new Auta("Seat", "Ibiza", 210, 1300);
        Auta opel = new Auta("Opel", "Corsa", 190, 20000);

        lista.add(fiat);
        lista.add(seat);
        lista.add(opel);

        System.out.println("Wyświetlanie danych");
        System.out.println(lista.get(0).toString());
        System.out.println(lista.get(1).toString());
        System.out.println(lista.get(2).toString());

        // ZADANIE 4
        System.out.println();
        System.out.println("Zadanie 4");
        System.out.println("===========================");

        Tlumacz.Tlumacz();
        //błąd polskich znaków
    }
}
