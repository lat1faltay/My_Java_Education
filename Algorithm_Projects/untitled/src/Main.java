import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı: ");
        int a = scan.nextInt();
        int toplam = 0;


        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                toplam += i;
            }
        }

        System.out.println("Toplam = " + toplam);

    }
}