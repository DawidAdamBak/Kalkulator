import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        float firsNumberBak;
        float secondNumberBak;
        float suma;
        float roznica;
        float iloczyn;
        float iloraz;

        Scanner scaner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        firsNumberBak = scaner.nextFloat();
        System.out.print("Podaj drugą liczbę: ");
        secondNumberBak = scaner.nextFloat();
        //dodawanie
        suma = firsNumberBak + secondNumberBak;
        System.out.printf("Otrzymana suma liczb: '%5.2f'%n", suma);
        //odejmowanie
        roznica = firsNumberBak - secondNumberBak;
        System.out.printf("Otrzymana różnica liczb: '%5.2f'%n", roznica);
        //mnożenie
        iloczyn = firsNumberBak * secondNumberBak;
        System.out.printf("Otrzymany iloczyn liczb: '%5.2f'%n", iloczyn);
        //dzielenie
        iloraz = firsNumberBak / secondNumberBak;
        System.out.printf("Otrzymany iloraz liczb: '%5.2f'%n", iloraz);
    }
}
