import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //wczytaj liczbę i rozłóż ją na czynniki pierwsze
        Scanner klawiatura = new Scanner(System.in);
        int liczbaWczytana = klawiatura.nextInt();
        Kalkulator obliczenia = new Kalkulator(liczbaWczytana);
        ArrayList<Integer> wyniki = obliczenia.obliczCzynniki();
        System.out.println(wyniki);

        ArrayList<Integer> wylosowaneLiczby = new ArrayList<>();
        for(int i=0; i<10; i++){
            int licz = (int)(Math.random()*100+1);
            wylosowaneLiczby.add(licz);
        }
        System.out.println(wylosowaneLiczby);
        for (Integer element: wylosowaneLiczby){
            System.out.println(element);
            Kalkulator obl = new Kalkulator(element);
            System.out.println(obl.obliczCzynniki());
            //System.out.println(obl.sprawdzCzyPierwsza());
        }
        for (Integer element: wylosowaneLiczby){
            Kalkulator obl = new Kalkulator(element);
            if(obl.sprawdzCzyPierwsza()){
                System.out.println(element+ " jest liczba pierwsza");
            }
            else{
                System.out.println(element+ " nie jest liczba pierwsza");
            }
        }
        //tablica z liczbami pierwszymi które wylosowały się w tablicy wylosowane
        ArrayList<Integer> liczbyPierwsze = new ArrayList<>();
        for(Integer element: wylosowaneLiczby){
            Kalkulator obl = new Kalkulator(element);
            if(obl.sprawdzCzyPierwsza()){
                liczbyPierwsze.add(element);
            }
        }
        System.out.println(liczbyPierwsze);

        //przygotuj listę z 10 liczbami wylosowanymi z zakresu od 30 do 60 bez powtórzeń
        HashSet<Integer> losowanie = new HashSet<>();
        while(losowanie.size()<10){
            losowanie.add((int)(Math.random()*30+31));
        }
        System.out.println(losowanie);
        //tablica 10 liczb wypełniona pierwiastkami
        double pierwiastki [] = new double[10];
        for(int i=0;i<10;i++){
            pierwiastki[i] = Math.pow(i, 0.5);
        }
        for(double wartosc: pierwiastki){
            System.out.print(wartosc+", ");
        }
        //liczby Fibbonacciego
        System.out.println("Liczby Fibbonacciego");
        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        int indeks = 2;
        while(fibo.size()<40){
            fibo.add(fibo.get(indeks-2)+fibo.get(indeks-1));
            indeks++;
        }
        System.out.println(fibo);
    }
}