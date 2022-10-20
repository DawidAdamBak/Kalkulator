import java.util.Random;

public class NajwiekszaNajmniejsza {
    public static void main(String[] args) {
        Random rmbBak = new Random();
        int WygenerowanaLiczbaBak;
        int liczbaWylosowanychLiczbBak = 1;
        int najmniejszaLiczbaBak = 101;
        int najwiekszaLiczbaBak = 0;
        while (liczbaWylosowanychLiczbBak <= 10){
            WygenerowanaLiczbaBak = rmbBak.nextInt(1, 100);
            System.out.print("Wylosowana liczba: " + WygenerowanaLiczbaBak);
            if (WygenerowanaLiczbaBak > najwiekszaLiczbaBak)
                najwiekszaLiczbaBak = WygenerowanaLiczbaBak;
            else if (WygenerowanaLiczbaBak < najmniejszaLiczbaBak) {
                najmniejszaLiczbaBak = WygenerowanaLiczbaBak;
            }
            liczbaWylosowanychLiczbBak ++;
        }
        System.out.print("\nNajmniejsza wygenerowana liczba to: " + najmniejszaLiczbaBak);
        System.out.print("\nNajwiększa wygenerowana liczba to: " + najwiekszaLiczbaBak);
    }
}
