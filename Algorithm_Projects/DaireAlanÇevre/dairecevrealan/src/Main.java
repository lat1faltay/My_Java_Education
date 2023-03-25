import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi, r, alan, cevre, toplam;
        pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("r değerini giriniz: ");
        r = scanner.nextInt();

        alan = pi * (r * r);
        System.out.println("alan: " + alan);


        cevre = (2 * pi) * r;
        System.out.println("Cevre: " + cevre);

    }
}