import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç saat kalındı: ");
        int saat = scan.nextInt();

        double price = saat * 1.5;

        System.out.println("ödemeniz gereken toplam fiyat: "+price);

    }
}