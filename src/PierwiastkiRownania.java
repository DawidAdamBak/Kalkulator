import java.util.Scanner;

public class PierwiastkiRownania {
    public static void main(String[] args) {
        float aBak;
        float bBak;
        float cBak;
        float deltaBak;
        float pierwiastekDeltaBak;
        int liczbaSwitchBak;
        float x1Bak;
        float x2Bak;
        Scanner scaner = new Scanner(System.in);

        System.out.print("Podaj wartość zmiennej 'a': ");
        do {
            aBak = scaner.nextFloat();
            if (aBak == 0) {
                System.out.print("Warość 'a' nie może być równa 0!");
                System.out.print("\nPonownie podaj wartość zmiennej 'a': ");
            }
        }while (aBak == 0);

        System.out.print("Podaj wartość zmiennej 'b': ");
        bBak = scaner.nextFloat();

        System.out.print("Podaj wartość zmiennej 'c': ");
        cBak = scaner.nextFloat();

        deltaBak = (bBak * bBak) - (4 * aBak * cBak);

        if (deltaBak == 0)
            liczbaSwitchBak = 0;
        else if (deltaBak > 0) {
            liczbaSwitchBak = 1;
        }
        else liczbaSwitchBak = 11;


        switch (liczbaSwitchBak){
            case 0: {
                x1Bak = (-bBak) / (2 * aBak);
                System.out.print("Delta wynosi: " + deltaBak + ", a pierwiastek x1: " + x1Bak);
                break;
            }
            case 1: {
                pierwiastekDeltaBak = (float)Math.pow(deltaBak, 0.5);
                x1Bak = (-bBak + pierwiastekDeltaBak) / (2 * aBak);
                x2Bak = (-bBak - pierwiastekDeltaBak) / (2 * aBak);
                System.out.print("\nDelta wynosi: " + deltaBak);
                System.out.print("\nX1 jest równe: " + x1Bak + ", a X2 jest równe: " + x2Bak);
                break;
            }
            default:{
                System.out.print("Równanie o podanych zmiennych nie ma rozwiązań");
                break;
            }

        }
    }
}
