public class SumowanieParzyste {
    public static void main(String[] args) {

        int suma100Bak = 0;
        for (int iBak = 1; iBak <= 100; iBak++) {
            if(iBak % 2 == 0) {
                suma100Bak += iBak;
            }
        }
        System.out.print("Suma liczb parzystych z zakresu od 0 do 100 synosi: " + suma100Bak);
    }
}