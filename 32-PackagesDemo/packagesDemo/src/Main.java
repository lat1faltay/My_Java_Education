import java.util.Scanner;
import matematik.Dortislem;
import matematik.Logaritma;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı giriniz: ");

        String isim = scanner.nextLine();
        System.out.println("Merhaba " + isim);

        Dortislem dortislem = new Dortislem();
        dortislem.topla(2,4);

        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla(1,4);

    }
}