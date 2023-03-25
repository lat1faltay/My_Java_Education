import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salatalik = 3.14;
        double elma = 4.11;
        double kabak = 2.22;
        double domates = 0.95;
        double patlican= 7.00;

        System.out.println("Salatalık kaç kilo: ");
        double salatalikKilo = scan.nextDouble();

        System.out.println("Elma kaç kilo: ");
        double elmaKilo = scan.nextDouble();

        System.out.println("kabak kaç kilo: ");
        double kabakKilo = scan.nextDouble();

        System.out.println("domates kaç kilo: ");
        double domatesKilo = scan.nextDouble();

        System.out.println("patlıcan kaç kilo: ");
        double patlicanKilo = scan.nextDouble();

        double toplam = 0.0;


    }
}