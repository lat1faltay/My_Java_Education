import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, taxiPrice, kmPrice = 2.20, taxiStartPrice=10;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç km gidilecek: ");
        km = scan.nextDouble();;

        taxiPrice = taxiStartPrice + (km * kmPrice);
        System.out.println("Taksi ücreti: " + taxiPrice);

        if(taxiPrice < 20){
            System.out.println("İndi Bindi = 20 TL");
        }


    }
}