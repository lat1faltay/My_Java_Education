import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        int fuck = 1;


        for (int i = 1; i <= sayi; i++) {
            fuck = fuck * i;

        }

        System.out.println(fuck);

    }
}