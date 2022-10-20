import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float heightBak;
        float weightBak;
        float bmiBak;
        Scanner scaner = new Scanner(System.in);

        System.out.print("Podaj swój wzrost (w metrach): ");
        heightBak = scaner.nextFloat();
        System.out.print("Podaj swoją masę ciała (w kilogramach): ");
        weightBak = scaner.nextFloat();

        bmiBak = weightBak / (float)Math.pow(2, heightBak);

        if (bmiBak < 16.00){
            System.out.printf("Współczynnik BMI wynosi: " + bmiBak + ". Jest to niedowaga.");
        }
        else if (bmiBak >= 16.00 && bmiBak <= 16.99){
            System.out.printf("Współczynnik BMI wynosi: " + bmiBak + ". Jest to wygłodzenie.");
        }
        else if (bmiBak >= 17.00 && bmiBak <= 18.49){
            System.out.printf("Współczynnik BMI wynosi: " + bmiBak + ". Jest to niedowaga.");
        }
        else if (bmiBak >= 18.50 && bmiBak <= 22.99){
            System.out.printf("Współczynnik BMI wynosi: " + bmiBak + ". Jest to norma niski przedział.");
        }
        else if (bmiBak >= 23.00 && bmiBak <= 24.99){
            System.out.printf("Współczynnik BMI wynosi: " + bmiBak + ". Jest to norma wysoki przedział.");
        }
        else if (bmiBak >= 25.00 && bmiBak <= 27.49){
            System.out.printf("Współczynnik BMI wynosi: " + bmiBak + ". Jest to nadwaga niski przedział.");
        }
        else if (bmiBak >= 27.50 && bmiBak <= 29.99){
            System.out.printf("Współczynnik BMI wynosi: " + bmiBak + ". Jest to nadwaga wysoki przedział.");
        }
        else if (bmiBak >= 30 && bmiBak <= 34.9){
            System.out.printf("Współczynnik BMI wynosi: " + bmiBak + ". Jest to otyłość I stopnia.");
        }
        else if (bmiBak >= 35 && bmiBak <= 39.9){
            System.out.printf("Współczynnik BMI wynosi: " + bmiBak + ". Jest to otyłość II stopnia.");
        }
        else
            System.out.printf("Współczynnik BMI wynosi: " + bmiBak + ". Jest to otyłość III stopnia.");
    }
}
