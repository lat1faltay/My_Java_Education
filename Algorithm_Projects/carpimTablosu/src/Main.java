import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        int carpim = 0;
        for (int i = 1; i <= 10; i++){
            carpim = sayi *i;
            System.out.println(sayi + "*" + i + " = " + carpim );
        }

    }
}