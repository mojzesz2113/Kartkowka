import java.util.ArrayList;
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
    }
}