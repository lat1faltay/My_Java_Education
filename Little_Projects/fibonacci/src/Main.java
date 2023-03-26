import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaça kere: ");
        int tekrar = scan.nextInt();

        System.out.println("0");
        int a = 0, b = 1, c = 0;
        for (int i = 1; i < tekrar; i++) {
            c = a + b;
            b = a;
            a = c;
            System.out.println(c);
        }

    }
}