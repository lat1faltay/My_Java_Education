import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç saat kalındı: ");
        int saat = scan.nextInt();
        System.out.println("Araç tipiniz nedir (1 küçük araç, 2 büyük araç) :");
        int aracTipi = scan.nextInt();
        double price = 0;
        if (aracTipi == 1) {
            price = saat * 1.5;
        } else {
            price = saat * 3;
        }

        System.out.println("ödemeniz gereken toplam fiyat: " + price);


        

    }
}