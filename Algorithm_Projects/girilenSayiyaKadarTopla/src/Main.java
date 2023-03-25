import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("hangi sayıya kadar toplama işlemi yapılsın: ");
        int sayi = scan.nextInt();

        int toplam = 0;

        for (int i = 0; i <= sayi; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam);
    }
}