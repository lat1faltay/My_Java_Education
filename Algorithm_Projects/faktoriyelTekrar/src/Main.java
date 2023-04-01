import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextByte();

        int fuck = 1;

        /*
        while (sayi > 1) {
            fuck = fuck * sayi;
            sayi--;
        }
        System.out.println("Faktoriyel = " + fuck);

         */

        for (int i = sayi; i > 0; i--) {
            fuck = fuck * i;
        }
        System.out.println("Faktoriyel = " + fuck);


    }
}